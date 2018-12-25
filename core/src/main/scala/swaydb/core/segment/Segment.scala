/*
 * Copyright (C) 2018 Simer Plaha (@simerplaha)
 *
 * This file is a part of SwayDB.
 *
 * SwayDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * SwayDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
 */

package swaydb.core.segment

import java.nio.file.Path
import java.util.concurrent.ConcurrentSkipListMap
import bloomfilter.mutable.BloomFilter
import com.typesafe.scalalogging.LazyLogging
import swaydb.core.data._
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.io.file.{DBFile, IO}
import swaydb.core.io.reader.Reader
import swaydb.core.level.PathsDistributor
import swaydb.core.map.Map
import swaydb.core.queue.KeyValueLimiter
import swaydb.core.segment.format.one.{SegmentReader, SegmentWriter}
import swaydb.core.segment.merge.SegmentMerger
import swaydb.core.util.CollectionUtil._
import swaydb.core.util.PipeOps._
import swaydb.core.util.TryUtil._
import swaydb.core.util.{BloomFilterUtil, IDGenerator}
import swaydb.data.config.Dir
import swaydb.data.segment.MaxKey
import swaydb.data.slice.Slice
import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{Deadline, FiniteDuration}
import scala.util.{Failure, Success, Try}
import swaydb.data.order.KeyOrder

private[core] object Segment extends LazyLogging {

  //deeply nested groups are not expected. This should not stack overflow.
  def writeBloomFilterAndGetNearestDeadline(group: KeyValue.WriteOnly.Group,
                                            bloomFilter: Option[BloomFilter[Slice[Byte]]],
                                            currentNearestDeadline: Option[Deadline]): Try[Option[Deadline]] =
    group.keyValues.tryFoldLeft(currentNearestDeadline) {
      case (currentNearestDeadline, childGroup: KeyValue.WriteOnly.Group) =>
        Segment.getNearestDeadline(currentNearestDeadline, childGroup) ==> {
          nearestDeadline =>
            writeBloomFilterAndGetNearestDeadline(childGroup, bloomFilter, nearestDeadline)
        }

      case (currentNearestDeadline, otherKeyValue) =>
        //unslice is not required since this is just bloomFilter add and groups are stored as compressed bytes.
        Try {
          bloomFilter.foreach(_ add otherKeyValue.key)
          //nearest deadline compare with this key-value is not required here as it's already set by the Group.
          Segment.getNearestDeadline(currentNearestDeadline, otherKeyValue)
        }
    }

  def memory(path: Path,
             keyValues: Iterable[KeyValue.WriteOnly],
             bloomFilterFalsePositiveRate: Double,
             removeDeletes: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                     groupingStrategy: Option[KeyValueGroupingStrategyInternal],
                                     keyValueLimiter: KeyValueLimiter): Try[Segment] =
    if (keyValues.isEmpty) {
      Failure(new Exception("Empty key-values submitted to memory Segment."))
    } else {
      val skipList = new ConcurrentSkipListMap[Slice[Byte], Memory](keyOrder)

      val bloomFilter =
        BloomFilterUtil.initBloomFilter(keyValues, bloomFilterFalsePositiveRate)

      def writeKeyValue(keyValue: KeyValue.WriteOnly,
                        currentNearestDeadline: Option[Deadline]): Try[Option[Deadline]] = {
        val keyUnsliced = keyValue.key.unslice()
        keyValue match {
          case group: KeyValue.WriteOnly.Group =>
            writeBloomFilterAndGetNearestDeadline(group, bloomFilter, currentNearestDeadline) map {
              currentNearestDeadline =>
                skipList.put(
                  keyUnsliced,
                  Memory.Group(
                    minKey = keyUnsliced,
                    maxKey = group.maxKey.unslice(),
                    //this deadline is group's nearest deadline and the Segment's nearest deadline.
                    deadline = group.deadline,
                    compressedKeyValues = group.compressedKeyValues.unslice(),
                    groupStartOffset = 0 //compressKeyValues are unsliced so startOffset is 0.
                  )
                )
                currentNearestDeadline
            }

          case remove: Transient.Remove =>
            skipList.put(
              keyUnsliced,
              Memory.Remove(
                key = keyUnsliced,
                deadline = remove.deadline
              )
            )
            bloomFilter.foreach(_ add keyUnsliced)
            Segment.getNearestDeadline(currentNearestDeadline, keyValue)

          case put: Transient.Put =>
            keyValue.getOrFetchValue flatMap {
              value =>
                val unslicedValue = value.map(_.unslice())
                unslicedValue match {
                  case Some(value) if value.nonEmpty =>
                    skipList.put(
                      keyUnsliced,
                      Memory.Put(
                        key = keyUnsliced,
                        value = Some(value.unslice()),
                        deadline = put.deadline
                      )
                    )

                  case _ =>
                    skipList.put(
                      keyUnsliced,
                      Memory.Put(
                        key = keyUnsliced,
                        value = None,
                        deadline = put.deadline
                      )
                    )
                }
                bloomFilter.foreach(_ add keyUnsliced)
                Segment.getNearestDeadline(currentNearestDeadline, keyValue)
            }

          case update: Transient.Update =>
            keyValue.getOrFetchValue flatMap {
              value =>
                val unslicedValue = value.map(_.unslice())
                unslicedValue match {
                  case Some(value) if value.nonEmpty =>
                    skipList.put(
                      keyUnsliced,
                      Memory.Update(
                        key = keyUnsliced,
                        value = Some(value.unslice()),
                        deadline = update.deadline
                      )
                    )

                  case _ =>
                    skipList.put(
                      keyUnsliced,
                      Memory.Update(
                        key = keyUnsliced,
                        value = None,
                        deadline = update.deadline
                      )
                    )
                }
                bloomFilter.foreach(_ add keyUnsliced)
                Segment.getNearestDeadline(currentNearestDeadline, keyValue)
            }

          case range: KeyValue.WriteOnly.Range =>
            range.fetchFromAndRangeValue flatMap {
              case (fromValue, rangeValue) =>
                skipList.put(
                  keyUnsliced,
                  Memory.Range(
                    fromKey = keyUnsliced,
                    toKey = range.toKey.unslice(),
                    fromValue = fromValue.map(_.unslice),
                    rangeValue = rangeValue.unslice
                  )
                )
                bloomFilter.foreach(_ add keyUnsliced)
                Segment.getNearestDeadline(currentNearestDeadline, keyValue)
            }
        }
      }

      //Note: WriteOnly key-values can be received from Persistent Segments in which case it's important that
      //all byte arrays are unsliced before writing them to Memory Segment.
      keyValues.tryFoldLeft(Option.empty[Deadline]) {
        case (deadline, keyValue) =>
          writeKeyValue(keyValue, deadline)
      } flatMap {
        nearestExpiryDeadline =>
          Success(
            MemorySegment(
              path = path,
              minKey = keyValues.head.key.unslice(),
              maxKey =
                keyValues.last match {
                  case range: KeyValue.WriteOnly.Range =>
                    MaxKey.Range(range.fromKey.unslice(), range.toKey.unslice())

                  case group: KeyValue.WriteOnly.Group =>
                    group.maxKey.unslice()

                  case keyValue =>
                    MaxKey.Fixed(keyValue.key.unslice())
                },
              _hasRange = keyValues.last.stats.hasRange,
              _hasGroup = keyValues.last.stats.hasGroup,
              segmentSize = keyValues.last.stats.memorySegmentSize,
              removeDeletes = removeDeletes,
              bloomFilter = bloomFilter,
              cache = skipList,
              nearestExpiryDeadline = nearestExpiryDeadline
            )
          )
      }
    }

  def persistent(path: Path,
                 bloomFilterFalsePositiveRate: Double,
                 mmapReads: Boolean,
                 mmapWrites: Boolean,
                 keyValues: Iterable[KeyValue.WriteOnly],
                 removeDeletes: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                         keyValueLimiter: KeyValueLimiter,
                                         fileOpenLimiter: DBFile => Unit,
                                         compression: Option[KeyValueGroupingStrategyInternal],
                                         ec: ExecutionContext): Try[Segment] =
    SegmentWriter.write(keyValues, bloomFilterFalsePositiveRate) flatMap {
      case (bytes, nearestExpiryDeadline) =>
        if (bytes.isEmpty) {
          Failure(new Exception("Empty key-values submitted to persistent Segment."))
        } else {
          val writeResult =
          //if both read and writes are mmaped. Keep the file open.
            if (mmapWrites && mmapReads)
              DBFile.mmapWriteAndRead(bytes, path, fileOpenLimiter)
            //if mmapReads is false, write bytes in mmaped mode and then close and re-open for read.
            else if (mmapWrites && !mmapReads)
              DBFile.mmapWriteAndRead(bytes, path) flatMap {
                file =>
                  //close immediately to force flush the bytes to disk. Having mmapWrites == true and mmapReads == false,
                  //is probably not the most efficient and should be advised not to used.
                  file.close flatMap {
                    _ =>
                      DBFile.channelRead(file.path, fileOpenLimiter)
                  }
              }
            else if (!mmapWrites && mmapReads)
              DBFile.write(bytes, path) flatMap {
                path =>
                  DBFile.mmapRead(path, fileOpenLimiter)
              }
            else
              DBFile.write(bytes, path) flatMap {
                path =>
                  DBFile.channelRead(path, fileOpenLimiter)
              }

          writeResult map {
            file =>
              PersistentSegment(
                file = file,
                mmapReads = mmapReads,
                mmapWrites = mmapWrites,
                minKey = keyValues.head.key.unslice(),
                maxKey =
                  keyValues.last match {
                    case range: KeyValue.WriteOnly.Range =>
                      MaxKey.Range(range.fromKey.unslice(), range.toKey.unslice())

                    case group: KeyValue.WriteOnly.Group =>
                      group.maxKey.unslice()

                    case keyValue: KeyValue.WriteOnly.Fixed =>
                      MaxKey.Fixed(keyValue.key.unslice())
                  },
                segmentSize = keyValues.last.stats.segmentSize,
                removeDeletes = removeDeletes,
                nearestExpiryDeadline = nearestExpiryDeadline
              )
          }
        }
    }

  def copyToPersist(segment: Segment,
                    fetchNextPath: => Path,
                    mmapSegmentsOnRead: Boolean,
                    mmapSegmentsOnWrite: Boolean,
                    removeDeletes: Boolean,
                    minSegmentSize: Long,
                    bloomFilterFalsePositiveRate: Double,
                    compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                      keyValueLimiter: KeyValueLimiter,
                                                      fileOpenLimiter: DBFile => Unit,
                                                      compression: Option[KeyValueGroupingStrategyInternal],
                                                      ec: ExecutionContext): Try[Slice[Segment]] =
    segment match {
      case segment: PersistentSegment =>
        val nextPath = fetchNextPath
        segment.copyTo(nextPath) flatMap {
          _ =>
            Segment(
              path = nextPath,
              mmapReads = mmapSegmentsOnRead,
              mmapWrites = mmapSegmentsOnWrite,
              minKey = segment.minKey,
              maxKey = segment.maxKey,
              segmentSize = segment.segmentSize,
              nearestExpiryDeadline = segment.nearestExpiryDeadline,
              removeDeletes = removeDeletes
            ) recoverWith {
              case exception =>
                logger.error("Failed to copyToPersist Segment {}", segment.path, exception)
                IO.deleteIfExists(nextPath).failed foreach {
                  exception =>
                    logger.error("Failed to delete copied persistent Segment {}", segment.path, exception)
                }
                Failure(exception)
            }
        } map {
          segment =>
            Slice(segment)
        }

      case memory: MemorySegment =>
        copyToPersist(
          keyValues = Slice(memory.cache.values().asScala.toArray),
          fetchNextPath = fetchNextPath,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          mmapSegmentsOnRead = mmapSegmentsOnRead,
          mmapSegmentsOnWrite = mmapSegmentsOnWrite,
          removeDeletes = removeDeletes,
          minSegmentSize = minSegmentSize,
          compressDuplicateValues = compressDuplicateValues
        )
    }

  def copyToPersist(keyValues: Slice[KeyValue.ReadOnly],
                    fetchNextPath: => Path,
                    mmapSegmentsOnRead: Boolean,
                    mmapSegmentsOnWrite: Boolean,
                    removeDeletes: Boolean,
                    minSegmentSize: Long,
                    bloomFilterFalsePositiveRate: Double,
                    compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                      keyValueLimiter: KeyValueLimiter,
                                                      fileOpenLimiter: DBFile => Unit,
                                                      compression: Option[KeyValueGroupingStrategyInternal],
                                                      ec: ExecutionContext): Try[Slice[Segment]] =
    SegmentMerger.split(
      keyValues = keyValues,
      minSegmentSize = minSegmentSize,
      isLastLevel = removeDeletes,
      forInMemory = false,
      bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
      compressDuplicateValues = compressDuplicateValues
    ) flatMap {
      splits =>
        splits.tryMap(
          tryBlock =
            keyValues =>
              Segment.persistent(
                path = fetchNextPath,
                bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                mmapReads = mmapSegmentsOnRead,
                mmapWrites = mmapSegmentsOnWrite,
                keyValues = keyValues,
                removeDeletes = removeDeletes
              ),

          recover =
            (segments: Slice[Segment], _: Failure[Slice[Segment]]) =>
              segments foreach {
                segmentToDelete =>
                  segmentToDelete.delete.failed foreach {
                    exception =>
                      logger.error(s"Failed to delete Segment '{}' in recover due to failed copyToPersist", segmentToDelete.path, exception)
                  }
              }
        )
    }

  def copyToMemory(segment: Segment,
                   fetchNextPath: => Path,
                   removeDeletes: Boolean,
                   minSegmentSize: Long,
                   bloomFilterFalsePositiveRate: Double,
                   compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                     groupingStrategy: Option[KeyValueGroupingStrategyInternal],
                                                     keyValueLimiter: KeyValueLimiter,
                                                     ec: ExecutionContext): Try[Slice[Segment]] =
    segment.getAll() flatMap {
      keyValues =>
        copyToMemory(
          keyValues = keyValues,
          fetchNextPath = fetchNextPath,
          removeDeletes = removeDeletes,
          minSegmentSize = minSegmentSize,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          compressDuplicateValues = compressDuplicateValues
        )
    }

  def copyToMemory(keyValues: Slice[KeyValue.ReadOnly],
                   fetchNextPath: => Path,
                   removeDeletes: Boolean,
                   minSegmentSize: Long,
                   bloomFilterFalsePositiveRate: Double,
                   compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                     groupingStrategy: Option[KeyValueGroupingStrategyInternal],
                                                     keyValueLimiter: KeyValueLimiter,
                                                     ec: ExecutionContext): Try[Slice[Segment]] =
    SegmentMerger.split(
      keyValues = keyValues,
      minSegmentSize = minSegmentSize,
      isLastLevel = removeDeletes,
      forInMemory = true,
      bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
      compressDuplicateValues = compressDuplicateValues
    ) flatMap { //recovery not required. On failure, uncommitted Segments will be GC'd as nothing holds references to them.
      keyValues =>
        keyValues tryMap {
          keyValues =>
            Segment.memory(
              path = fetchNextPath,
              bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
              keyValues = keyValues,
              removeDeletes = removeDeletes
            )
        }
    }

  def apply(path: Path,
            mmapReads: Boolean,
            mmapWrites: Boolean,
            minKey: Slice[Byte],
            maxKey: MaxKey,
            segmentSize: Int,
            removeDeletes: Boolean,
            nearestExpiryDeadline: Option[Deadline],
            checkExists: Boolean = true)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                         keyValueLimiter: KeyValueLimiter,
                                         fileOpenLimiter: DBFile => Unit,
                                         compression: Option[KeyValueGroupingStrategyInternal],
                                         ec: ExecutionContext): Try[Segment] = {

    val file =
      if (mmapReads)
        DBFile.mmapRead(path, fileOpenLimiter, checkExists)
      else
        DBFile.channelRead(path, fileOpenLimiter, checkExists)

    file map {
      file =>
        PersistentSegment(
          file = file,
          mmapReads = mmapReads,
          mmapWrites = mmapWrites,
          minKey = minKey,
          maxKey = maxKey,
          segmentSize = segmentSize,
          removeDeletes = removeDeletes,
          nearestExpiryDeadline = nearestExpiryDeadline
        )
    }
  }

  /**
    * Reads the [[PersistentSegment]] when the min, max keys & fileSize is not known.
    *
    * This function requires the Segment to be opened and read. After the Segment is successfully
    * read the file is closed.
    *
    * This function is only used for Appendix file recovery initialization.
    */
  def apply(path: Path,
            mmapReads: Boolean,
            mmapWrites: Boolean,
            removeDeletes: Boolean,
            checkExists: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                  keyValueLimiter: KeyValueLimiter,
                                  fileOpenLimiter: DBFile => Unit,
                                  compression: Option[KeyValueGroupingStrategyInternal],
                                  ec: ExecutionContext): Try[Segment] = {

    val file =
      if (mmapReads)
        DBFile.mmapRead(path, fileOpenLimiter, checkExists)
      else
        DBFile.channelRead(path, fileOpenLimiter, checkExists)

    file flatMap {
      file =>
        file.fileSize flatMap {
          fileSize =>
            SegmentReader.readFooter(Reader(file)) flatMap {
              footer =>
                SegmentReader.readAll(footer, Reader(file)) flatMap {
                  keyValues =>
                    //close the file
                    file.close flatMap {
                      _ =>
                        getNearestDeadline(keyValues) map {
                          nearestDeadline =>
                            PersistentSegment(
                              file = file,
                              mmapReads = mmapReads,
                              mmapWrites = mmapWrites,
                              minKey = keyValues.head.key,
                              maxKey =
                                keyValues.last match {
                                  case fixed: KeyValue.ReadOnly.Fixed =>
                                    MaxKey.Fixed(fixed.key)

                                  case group: KeyValue.ReadOnly.Group =>
                                    group.maxKey

                                  case range: KeyValue.ReadOnly.Range =>
                                    MaxKey.Range(range.fromKey, range.toKey)
                                },
                              segmentSize = fileSize.toInt,
                              nearestExpiryDeadline = nearestDeadline,
                              removeDeletes = removeDeletes
                            )
                        }
                    }
                }
            }
        }
    }
  }

  def belongsTo(keyValue: KeyValue,
                segment: Segment)(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
    import keyOrder._
    keyValue.key >= segment.minKey && {
      if (segment.maxKey.inclusive)
        keyValue.key <= segment.maxKey.maxKey
      else
        keyValue.key < segment.maxKey.maxKey
    }
  }

  def overlaps(minKey: Slice[Byte],
               maxKey: Slice[Byte],
               segment: Segment)(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean =
    Slice.intersects((minKey, maxKey, true), (segment.minKey, segment.maxKey.maxKey, segment.maxKey.inclusive))

  def overlaps(minKey: Slice[Byte],
               maxKey: Slice[Byte],
               segments: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean =
    segments.exists(segment => overlaps(minKey, maxKey, segment))

  def overlaps(map: Map[Slice[Byte], Memory.SegmentResponse],
               segments: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean =
    Segment.minMaxKey(map) exists {
      case (minKey, maxKey) =>
        Segment.overlaps(minKey, maxKey, segments)
    }

  def overlaps(segment1: Segment,
               segment2: Segment)(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean =
    Slice.intersects((segment1.minKey, segment1.maxKey.maxKey, segment1.maxKey.inclusive), (segment2.minKey, segment2.maxKey.maxKey, segment2.maxKey.inclusive))

  def partitionOverlapping(segments1: Iterable[Segment],
                           segments2: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): (Iterable[Segment], Iterable[Segment]) =
    segments1
      .partition(segmentToWrite => segments2.exists(existingSegment => Segment.overlaps(segmentToWrite, existingSegment)))

  def nonOverlapping(segments1: Iterable[Segment],
                     segments2: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Iterable[Segment] =
    nonOverlapping(segments1, segments2, segments1.size)

  def nonOverlapping(segments1: Iterable[Segment],
                     segments2: Iterable[Segment],
                     count: Int)(implicit keyOrder: KeyOrder[Slice[Byte]]): Iterable[Segment] = {
    if (count == 0)
      Iterable.empty
    else {
      val resultSegments = ListBuffer.empty[Segment]
      segments1.iterator foreachBreak {
        segment1 =>
          if (!segments2.exists(segment2 => overlaps(segment1, segment2)))
            resultSegments += segment1
          resultSegments.size == count
      }
      resultSegments
    }
  }

  def overlaps(segments1: Iterable[Segment],
               segments2: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Iterable[Segment] =
    segments1.filter(segment1 => segments2.exists(segment2 => overlaps(segment1, segment2)))

  def intersects(segments1: Iterable[Segment], segments2: Iterable[Segment]): Boolean =
    if (segments1.isEmpty || segments2.isEmpty)
      false
    else
      segments1.exists(segment1 => segments2.exists(_.path == segment1.path))

  /**
    * Pre condition: Segments should be sorted with their minKey in ascending order.
    */
  def getAllKeyValues(bloomFilterFalsePositiveRate: Double, segments: Iterable[Segment]): Try[Slice[KeyValue.ReadOnly]] =
    if (segments.isEmpty)
      Success(Slice.create[KeyValue.ReadOnly](0))
    else if (segments.size == 1)
      segments.head.getAll()
    else
      segments.tryFoldLeft(0) {
        case (total, segment) =>
          segment.getHeadKeyValueCount().map(_ + total)
      } flatMap {
        totalKeyValues =>
          segments.tryFoldLeft(Slice.create[KeyValue.ReadOnly](totalKeyValues)) {
            case (allKeyValues, segment) =>
              segment getAll Some(allKeyValues)
          }
      }

  def deleteSegments(segments: Iterable[Segment]): Try[Int] =
    segments.tryFoldLeft(0, failFast = false) {
      case (deleteCount, segment) =>
        segment.delete map {
          _ =>
            deleteCount + 1
        }
    }

  def tempMinMaxKeyValues(segments: Iterable[Segment]): Slice[Memory] =
    segments.foldLeft(Slice.create[Memory](segments.size * 2)) {
      case (keyValues, segment) =>
        keyValues add Memory.Put(segment.minKey, None)
        segment.maxKey match {
          case MaxKey.Fixed(maxKey) =>
            keyValues add Memory.Put(maxKey, None)

          case MaxKey.Range(fromKey, maxKey) =>
            keyValues add Memory.Range(fromKey, maxKey, None, Value.Update(maxKey))
        }
    }

  def tempMinMaxKeyValues(map: Map[Slice[Byte], Memory.SegmentResponse]): Slice[Memory] = {
    for {
      minKey <- map.headValue().map(memory => Memory.Put(memory.key, None))
      maxKey <- map.lastValue() map {
        case fixed: Memory.Fixed =>
          Memory.Put(fixed.key, None)

        case Memory.Range(fromKey, toKey, fromValue, rangeValue) =>
          Memory.Range(fromKey, toKey, None, Value.Update(toKey))
      }
    } yield
      Slice(minKey, maxKey)
  } getOrElse Slice.create[Memory](0)

  def minMaxKey(map: Map[Slice[Byte], Memory.SegmentResponse]): Option[(Slice[Byte], Slice[Byte])] =
    for {
      minKey <- map.headValue().map(_.key)
      maxKey <- map.lastValue() map {
        case fixed: Memory.Fixed =>
          fixed.key

        case range: Memory.Range =>
          range.toKey
      }
    } yield {
      (minKey, maxKey)
    }

  def overlapsWithBusySegments(inputSegments: Iterable[Segment],
                               busySegments: Iterable[Segment],
                               appendixSegments: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Try[Boolean] =
    if (busySegments.isEmpty)
      Success(false)
    else
      SegmentAssigner.assignMinMaxOnlyForSegments(
        inputSegments = inputSegments,
        targetSegments = appendixSegments
      ) map {
        assignments =>
          Segment.overlaps(
            segments1 = busySegments,
            segments2 = assignments
          ).nonEmpty
      }

  def overlapsWithBusySegments(map: Map[Slice[Byte], Memory.SegmentResponse],
                               busySegments: Iterable[Segment],
                               appendixSegments: Iterable[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]]): Try[Boolean] =
    if (busySegments.isEmpty)
      Success(false)
    else {
      for {
        head <- map.headValue()
        last <- map.lastValue()
      } yield {
        {
          if (keyOrder.equiv(head.key, last.key))
            SegmentAssigner.assign(keyValues = Slice(head), segments = appendixSegments)
          else
            SegmentAssigner.assign(keyValues = Slice(head, last), segments = appendixSegments)
        } map {
          assignments =>
            Segment.overlaps(
              segments1 = busySegments,
              segments2 = assignments.keys
            ).nonEmpty
        }
      }
    } getOrElse Success(false)

  /**
    * Key-values such as Groups and Ranges can contain deadlines internally.
    *
    * Groups's internal key-value can contain deadline and Range's from and range value contain deadline.
    * Be sure to extract those before checking for nearest deadline. Use other [[getNearestDeadline]]
    * functions instead that take key-value as input to fetch the correct nearest deadline.
    */
  private[segment] def getNearestDeadline(previous: Option[Deadline],
                                          next: Option[Deadline]): Option[Deadline] =

    (previous, next) match {
      case (None, None) => None
      case (previous @ Some(_), None) => previous
      case (None, next @ Some(_)) => next
      case (Some(previous), Some(next)) =>
        if (previous < next)
          Some(previous)
        else
          Some(next)
    }

  def getNearestDeadline(previous: Option[Deadline],
                         keyValue: KeyValue): Try[Option[Deadline]] =
    keyValue match {
      case readOnly: KeyValue.ReadOnly =>
        getNearestDeadline(previous, readOnly)

      case writeOnly: KeyValue.WriteOnly =>
        Try(getNearestDeadline(previous, writeOnly))
    }

  def getNearestDeadline(previous: Option[Deadline],
                         keyValue: KeyValue.ReadOnly): Try[Option[Deadline]] =
    keyValue match {
      case readOnly: KeyValue.ReadOnly.Fixed =>
        Try(getNearestDeadline(previous, readOnly.deadline))

      case range: KeyValue.ReadOnly.Range =>
        range.fetchFromAndRangeValue map {
          case (Some(fromValue), rangeValue) =>
            getNearestDeadline(previous, fromValue.deadline) ==> {
              getNearestDeadline(_, rangeValue.deadline)
            }
          case (None, rangeValue) =>
            getNearestDeadline(previous, rangeValue.deadline)
        }

      case group: KeyValue.ReadOnly.Group =>
        Try(getNearestDeadline(previous, group.deadline))
    }

  def getNearestDeadline(previous: Option[Deadline],
                         keyValue: KeyValue.WriteOnly): Option[Deadline] =
    keyValue match {
      case writeOnly: KeyValue.WriteOnly.Fixed =>
        getNearestDeadline(previous, writeOnly.deadline)

      case range: KeyValue.WriteOnly.Range =>
        (range.fromValue, range.rangeValue) match {
          case (Some(fromValue), rangeValue) =>
            getNearestDeadline(previous, fromValue.deadline) ==> {
              getNearestDeadline(_, rangeValue.deadline)
            }
          case (None, rangeValue) =>
            getNearestDeadline(previous, rangeValue.deadline)
        }

      case group: KeyValue.WriteOnly.Group =>
        getNearestDeadline(previous, group.deadline)

    }

  def getNearestDeadline(keyValues: Iterable[KeyValue]): Try[Option[Deadline]] =
    keyValues.tryFoldLeft(Option.empty[Deadline])(getNearestDeadline)

  def getNearestDeadlineSegment(previous: Segment,
                                next: Segment): Option[Segment] =
    (previous.nearestExpiryDeadline, next.nearestExpiryDeadline) match {
      case (None, None) => None
      case (Some(_), None) => Some(previous)
      case (None, Some(_)) => Some(next)
      case (Some(previousDeadline), Some(nextDeadline)) =>
        if (previousDeadline < nextDeadline)
          Some(previous)
        else
          Some(next)
    }

  def getNearestDeadlineSegment(segments: Iterable[Segment]): Option[Segment] =
    segments.foldLeft(Option.empty[Segment]) {
      case (previous, next) =>
        previous map {
          previous =>
            getNearestDeadlineSegment(previous, next)
        } getOrElse {
          if (next.nearestExpiryDeadline.isDefined)
            Some(next)
          else
            None
        }
    }

}

private[core] trait Segment {
  private[segment] val cache: ConcurrentSkipListMap[Slice[Byte], _]
  val minKey: Slice[Byte]
  val maxKey: MaxKey
  val segmentSize: Int
  val removeDeletes: Boolean
  val nearestExpiryDeadline: Option[Deadline]

  def getBloomFilter: Try[Option[BloomFilter[Slice[Byte]]]]

  def path: Path

  def put(newKeyValues: Slice[KeyValue.ReadOnly],
          minSegmentSize: Long,
          bloomFilterFalsePositiveRate: Double,
          hasTimeLeftAtLeast: FiniteDuration,
          compressDuplicateValues: Boolean,
          targetPaths: PathsDistributor = PathsDistributor(Seq(Dir(path.getParent, 1)), () => Seq()))(implicit idGenerator: IDGenerator): Try[Slice[Segment]]

  def refresh(minSegmentSize: Long,
              bloomFilterFalsePositiveRate: Double,
              compressDuplicateValues: Boolean,
              targetPaths: PathsDistributor = PathsDistributor(Seq(Dir(path.getParent, 1)), () => Seq()))(implicit idGenerator: IDGenerator): Try[Slice[Segment]]

  def copyTo(toPath: Path): Try[Path]

  def getFromCache(key: Slice[Byte]): Option[KeyValue.ReadOnly]

  def mightContain(key: Slice[Byte]): Try[Boolean]

  def get(key: Slice[Byte]): Try[Option[KeyValue.ReadOnly.SegmentResponse]]

  def lower(key: Slice[Byte]): Try[Option[KeyValue.ReadOnly.SegmentResponse]]

  def higher(key: Slice[Byte]): Try[Option[KeyValue.ReadOnly.SegmentResponse]]

  def getAll(addTo: Option[Slice[KeyValue.ReadOnly]] = None): Try[Slice[KeyValue.ReadOnly]]

  def delete: Try[Unit]

  def close: Try[Unit]

  def getHeadKeyValueCount(): Try[Int]

  def getBloomFilterKeyValueCount(): Try[Int]

  def clearCache(): Unit =
    cache.clear()

  def removeFromCache(key: Slice[Byte]) =
    cache.remove(key)

  def isInCache(key: Slice[Byte]): Boolean =
    cache containsKey key

  def isCacheEmpty: Boolean =
    cache.isEmpty

  def cacheSize: Int =
    cache.size()

  def hasRange: Try[Boolean]

  def isFooterDefined: Boolean

  def isOpen: Boolean

  def isFileDefined: Boolean

  def memory: Boolean

  def persistent: Boolean

  def existsOnDisk: Boolean

}
