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

package swaydb.core.segment.merge

import com.typesafe.scalalogging.LazyLogging
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}
import swaydb.core.data.KeyValue.ReadOnly
import swaydb.core.data.{Memory, Persistent, Value, _}
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.queue.KeyValueLimiter
import swaydb.core.segment.merge.KeyValueMerger._
import swaydb.core.util.SliceUtil._
import swaydb.core.util.TryUtil._
import swaydb.data.slice.Slice
import swaydb.data.order.KeyOrder
import swaydb.data.util.StorageUnits._

private[core] object SegmentMerger extends LazyLogging {
  implicit val keyValueLimiter = KeyValueLimiter.none

  /**
    * If the last Segment is too small, this function merges the last Segment with the previous Segment's key-value.
    *
    * It also executes grouping on the last un-grouped key-values if compression type (grouping) is provided.
    */
  @tailrec
  def completeMerge(segments: ListBuffer[ListBuffer[KeyValue.WriteOnly]],
                    minSegmentSize: Long,
                    forMemory: Boolean,
                    bloomFilterFalsePositiveRate: Double,
                    groupLastSegment: Boolean = true)(implicit groupingStrategy: Option[KeyValueGroupingStrategyInternal]): Try[ListBuffer[ListBuffer[KeyValue.WriteOnly]]] = {
    //if there are any small Segments, merge them into previous Segment.
    val noSmallSegments =
      if (segments.length >= 2 && ((forMemory && segments.last.memorySegmentSize < minSegmentSize) || segments.last.persistentSegmentSize < minSegmentSize)) {
        val newSegments = segments dropRight 1
        val newSegmentsLast = newSegments.last
        segments.last foreach {
          keyValue =>
            newSegmentsLast += keyValue.updateStats(bloomFilterFalsePositiveRate, newSegmentsLast.lastOption)
        }
        newSegments
      } else {
        segments
      }

    //if compression is specified, compress any last non grouped key-values and try completingMerge again
    //in-case compression of the last Segment's key-values resulted is a smaller Segment.
    groupingStrategy match {
      case Some(groupingS) if groupLastSegment =>
        noSmallSegments.filter(_.nonEmpty).lastOption match {
          case Some(lastSegmentsKeyValues) =>
            SegmentGrouper.group(
              segmentKeyValues = lastSegmentsKeyValues,
              bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
              groupingStrategy = groupingS,
              force = true
            ) match {
              case Success(Some(_)) => //grouping occurred.
                //do completeMerge again in-case grouping the last Segment resulted in a smaller Segment.
                completeMerge(
                  segments = noSmallSegments,
                  minSegmentSize = minSegmentSize,
                  forMemory = forMemory,
                  bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                  groupLastSegment = false
                )

              case Success(None) =>
                Success(noSmallSegments.filter(_.nonEmpty))

              case Failure(exception) =>
                Failure(exception)
            }
          case None =>
            Success(noSmallSegments.filter(_.nonEmpty))
        }
      case _ =>
        Success(noSmallSegments.filter(_.nonEmpty))
    }
  }

  def split(keyValues: Iterable[KeyValue.ReadOnly],
            minSegmentSize: Long,
            isLastLevel: Boolean,
            forInMemory: Boolean,
            bloomFilterFalsePositiveRate: Double,
            compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                              groupingStrategy: Option[KeyValueGroupingStrategyInternal]): Try[Iterable[Iterable[KeyValue.WriteOnly]]] = {
    val splits = ListBuffer[ListBuffer[KeyValue.WriteOnly]](ListBuffer())
    keyValues tryForeach {
      keyValue =>
        SegmentGrouper.addKeyValue(
          keyValueToAdd = keyValue,
          splits = splits,
          minSegmentSize = minSegmentSize,
          forInMemory = forInMemory,
          isLastLevel = isLastLevel,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          compressDuplicateValues = compressDuplicateValues
        )
    } match {
      case None =>
        completeMerge(
          segments = splits,
          minSegmentSize = minSegmentSize,
          forMemory = forInMemory,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate
        )

      case Some(Failure(failure)) =>
        Failure(failure)
    }
  }

  /**
    * TODO: Both inputs are Memory so temporarily it's OK to call .get because Memory key-values do not do IO. But this should be fixed and .get should not be invoked.
    *
    * Need a type class implementation on executing side effects of merging key-values, one for [[Memory]] key-values and other for [[Persistent]] key-value types.
    */
  def merge(newKeyValues: Slice[Memory.SegmentResponse],
            oldKeyValues: Slice[Memory.SegmentResponse],
            hasTimeLeftAtLeast: FiniteDuration)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                groupingStrategy: Option[KeyValueGroupingStrategyInternal]): ListBuffer[KeyValue.WriteOnly] =
    merge(
      newKeyValues = newKeyValues,
      oldKeyValues = oldKeyValues,
      minSegmentSize = 100000.gb,
      isLastLevel = false,
      forInMemory = true,
      bloomFilterFalsePositiveRate = 0.1,
      hasTimeLeftAtLeast = hasTimeLeftAtLeast,
      compressDuplicateValues = false
    ).get.flatten.asInstanceOf[ListBuffer[KeyValue.WriteOnly]]

  def merge(newKeyValue: Memory.SegmentResponse,
            oldKeyValue: Memory.SegmentResponse,
            hasTimeLeftAtLeast: FiniteDuration)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                groupingStrategy: Option[KeyValueGroupingStrategyInternal]): ListBuffer[KeyValue.WriteOnly] =
    merge(
      newKeyValues = Slice(newKeyValue),
      oldKeyValues = Slice(oldKeyValue),
      minSegmentSize = 100000.gb,
      isLastLevel = false,
      forInMemory = true,
      bloomFilterFalsePositiveRate = 0.1,
      hasTimeLeftAtLeast = hasTimeLeftAtLeast,
      compressDuplicateValues = false
    ).get.flatten.asInstanceOf[ListBuffer[KeyValue.WriteOnly]]

  def merge(newKeyValues: Slice[KeyValue.ReadOnly],
            oldKeyValues: Slice[KeyValue.ReadOnly],
            minSegmentSize: Long,
            isLastLevel: Boolean,
            forInMemory: Boolean,
            bloomFilterFalsePositiveRate: Double,
            hasTimeLeftAtLeast: FiniteDuration,
            compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                              groupingStrategy: Option[KeyValueGroupingStrategyInternal]): Try[Iterable[Iterable[KeyValue.WriteOnly]]] =
    merge(
      newKeyValues = MergeList(newKeyValues),
      oldKeyValues = MergeList(oldKeyValues),
      splits = ListBuffer[ListBuffer[KeyValue.WriteOnly]](ListBuffer.empty),
      minSegmentSize = minSegmentSize,
      isLastLevel = isLastLevel,
      forInMemory = forInMemory,
      bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
      hasTimeLeftAtLeast = hasTimeLeftAtLeast,
      compressDuplicateValues = compressDuplicateValues
    ) flatMap {
      splits =>
        completeMerge(
          segments = splits,
          minSegmentSize = minSegmentSize,
          forMemory = forInMemory,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate
        )
    }

  private def merge(newKeyValues: MergeList,
                    oldKeyValues: MergeList,
                    splits: ListBuffer[ListBuffer[KeyValue.WriteOnly]],
                    minSegmentSize: Long,
                    isLastLevel: Boolean,
                    forInMemory: Boolean,
                    bloomFilterFalsePositiveRate: Double,
                    hasTimeLeftAtLeast: FiniteDuration,
                    compressDuplicateValues: Boolean)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                      groupingStrategy: Option[KeyValueGroupingStrategyInternal]): Try[ListBuffer[ListBuffer[KeyValue.WriteOnly]]] = {
    import keyOrder._

    def add(nextKeyValue: KeyValue.ReadOnly): Try[Unit] =
      SegmentGrouper.addKeyValue(
        keyValueToAdd = nextKeyValue,
        splits = splits,
        minSegmentSize = minSegmentSize,
        forInMemory = forInMemory,
        isLastLevel = isLastLevel,
        bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
        compressDuplicateValues = compressDuplicateValues
      )

    @tailrec
    def doMerge(newKeyValues: MergeList,
                oldKeyValues: MergeList): Try[ListBuffer[ListBuffer[KeyValue.WriteOnly]]] =
      (newKeyValues.headOption, oldKeyValues.headOption) match {

        case (Some(newKeyValue: KeyValue.ReadOnly.Fixed), Some(oldKeyValue: KeyValue.ReadOnly.Fixed)) =>
          if (oldKeyValue.key < newKeyValue.key)
            add(oldKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else if (newKeyValue.key < oldKeyValue.key)
            add(newKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else
            applyValue(newKeyValue, oldKeyValue, hasTimeLeftAtLeast) flatMap add match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is an overwrite key-value and the existing is a range key-value.
          */
        case (Some(newKeyValue: KeyValue.ReadOnly.Fixed), Some(oldRangeKeyValue: ReadOnly.Range)) =>
          if (newKeyValue.key < oldRangeKeyValue.fromKey)
            add(newKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (newKeyValue.key >= oldRangeKeyValue.toKey)
            add(oldRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //is in-range key
            oldRangeKeyValue.fetchFromAndRangeValue match {
              case Success((oldFromValue, oldRangeRangeValue)) if newKeyValue.key equiv oldRangeKeyValue.fromKey =>
                applyValue(newKeyValue, oldFromValue.getOrElse(oldRangeRangeValue), hasTimeLeftAtLeast) match {
                  case Success(newFromValue) =>
                    val toPrepend =
                      Memory.Range(
                        fromKey = oldRangeKeyValue.fromKey,
                        toKey = oldRangeKeyValue.toKey,
                        fromValue = Some(newFromValue),
                        rangeValue = oldRangeRangeValue
                      )
                    doMerge(newKeyValues.dropHead(), oldKeyValues.dropPrepend(toPrepend))

                  case Failure(exception) =>
                    Failure(exception)
                }

              case Success((oldFromValue, oldRangeValue)) => //else it's a mid range value - split required.
                applyValue(newKeyValue, oldRangeValue, hasTimeLeftAtLeast) match {
                  case Success(newFromValue) =>
                    val lowerSplit = Memory.Range(oldRangeKeyValue.fromKey, newKeyValue.key, oldFromValue, oldRangeValue)
                    val upperSplit = Memory.Range(newKeyValue.key, oldRangeKeyValue.toKey, Some(newFromValue), oldRangeValue)
                    add(lowerSplit) match {
                      case Success(_) =>
                        doMerge(newKeyValues.dropHead(), oldKeyValues.dropPrepend(upperSplit))
                      case Failure(exception) =>
                        Failure(exception)
                    }
                  case Failure(exception) =>
                    Failure(exception)
                }
              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is a range and the existing is a fixed key-value.
          */
        case (Some(newRangeKeyValue: ReadOnly.Range), Some(oldKeyValue: KeyValue.ReadOnly.Fixed)) =>
          if (oldKeyValue.key >= newRangeKeyValue.toKey)
            add(newRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldKeyValue.key < newRangeKeyValue.fromKey)
            add(oldKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //is in-range key
            newRangeKeyValue.fetchFromAndRangeValue match {
              case Success((newRangeFromValue, newRangeRangeValue)) if newRangeKeyValue.fromKey equiv oldKeyValue.key =>
                applyValue(newRangeFromValue.getOrElse(newRangeRangeValue), oldKeyValue, hasTimeLeftAtLeast = hasTimeLeftAtLeast) match {
                  case Success(newFromValue) =>
                    val newKeyValue =
                      Memory.Range(
                        fromKey = newRangeKeyValue.fromKey,
                        toKey = newRangeKeyValue.toKey,
                        fromValue = Some(newFromValue),
                        rangeValue = newRangeRangeValue
                      )
                    doMerge(newKeyValues.dropPrepend(newKeyValue), oldKeyValues.dropHead())
                  case Failure(exception) =>
                    Failure(exception)
                }

              case Success((newRangeFromValue, newRangeRangeValue)) => //split required.
                applyValue(newRangeRangeValue, oldKeyValue, hasTimeLeftAtLeast) match {
                  case Success(newFromValue) =>
                    val lowerSplit = Memory.Range(newRangeKeyValue.fromKey, oldKeyValue.key, newRangeFromValue, newRangeRangeValue)
                    val upperSplit = Memory.Range(oldKeyValue.key, newRangeKeyValue.toKey, Some(newFromValue), newRangeRangeValue)
                    add(lowerSplit) match {
                      case Success(_) =>
                        doMerge(newKeyValues.dropPrepend(upperSplit), oldKeyValues.dropHead())
                      case Failure(exception) =>
                        Failure(exception)
                    }
                  case Failure(exception) =>
                    Failure(exception)

                }

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When both the key-values are ranges.
          */
        case (Some(newRangeKeyValue: ReadOnly.Range), Some(oldRangeKeyValue: ReadOnly.Range)) =>
          if (newRangeKeyValue.toKey <= oldRangeKeyValue.fromKey)
            add(newRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }

          else if (oldRangeKeyValue.toKey <= newRangeKeyValue.fromKey)
            add(oldRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else
            newRangeKeyValue.fetchFromAndRangeValue match {
              case Success((newRangeFromValue, newRangeRangeValue)) =>
                oldRangeKeyValue.fetchFromAndRangeValue match {
                  case Success((oldRangeFromValue, oldRangeRangeValue)) =>
                    val newRangeFromKey = newRangeKeyValue.fromKey
                    val newRangeToKey = newRangeKeyValue.toKey
                    val oldRangeFromKey = oldRangeKeyValue.fromKey
                    val oldRangeToKey = oldRangeKeyValue.toKey

                    if (newRangeFromKey < oldRangeFromKey) {
                      //1   -     15
                      //      10   -  20
                      if (newRangeToKey < oldRangeToKey) {
                        val upperSplit = Memory.Range(newRangeFromKey, oldRangeFromKey, newRangeFromValue, newRangeRangeValue)
                        val middleSplit = Memory.Range(oldRangeFromKey, newRangeToKey, oldRangeFromValue.map(applyValue(newRangeRangeValue, _, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                        val lowerSplit = Memory.Range(newRangeToKey, oldRangeToKey, None, oldRangeRangeValue)

                        add(upperSplit).flatMap(_ => add(middleSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropPrepend(lowerSplit))

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else if (newRangeToKey equiv oldRangeToKey) {
                        //1      -      20
                        //      10   -  20
                        val upperSplit = Memory.Range(newRangeFromKey, oldRangeFromKey, newRangeFromValue, newRangeRangeValue)
                        val lowerSplit = Memory.Range(oldRangeFromKey, oldRangeToKey, oldRangeFromValue.map(applyValue(newRangeRangeValue, _, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)

                        add(upperSplit).flatMap(_ => add(lowerSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else {
                        //1      -         21
                        //      10   -  20
                        val upperSplit = Memory.Range(newRangeFromKey, oldRangeFromKey, newRangeFromValue, newRangeRangeValue)
                        val middleSplit = Memory.Range(oldRangeFromKey, oldRangeToKey, oldRangeFromValue.map(applyValue(newRangeRangeValue, _, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                        val lowerSplit = Memory.Range(oldRangeToKey, newRangeToKey, None, newRangeRangeValue)

                        add(upperSplit).flatMap(_ => add(middleSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropPrepend(lowerSplit), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      }
                    } else if (newRangeFromKey equiv oldRangeFromKey) {
                      //      10 - 15
                      //      10   -  20
                      if (newRangeToKey < oldRangeToKey) {
                        val upperSplit = Memory.Range(
                          fromKey = newRangeFromKey,
                          toKey = newRangeToKey,
                          fromValue = oldRangeFromValue.map(applyValue(newRangeFromValue.getOrElse(newRangeRangeValue), _, hasTimeLeftAtLeast).get) orElse {
                            newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                          },
                          rangeValue = applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get
                        )
                        val lowerSplit = Memory.Range(newRangeToKey, oldRangeToKey, None, oldRangeRangeValue)

                        add(upperSplit) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropPrepend(lowerSplit))

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else if (newRangeToKey equiv oldRangeToKey) {
                        //      10   -  20
                        //      10   -  20
                        val update = Memory.Range(
                          fromKey = newRangeFromKey,
                          toKey = newRangeToKey,
                          fromValue = oldRangeFromValue.map(applyValue(newRangeFromValue.getOrElse(newRangeRangeValue), _, hasTimeLeftAtLeast).get) orElse {
                            newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                          },
                          rangeValue = applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get
                        )

                        add(update) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else {
                        //      10   -     21
                        //      10   -  20
                        val upperSplit = Memory.Range(
                          fromKey = newRangeFromKey,
                          toKey = oldRangeToKey,
                          fromValue = oldRangeFromValue.map(applyValue(newRangeFromValue.getOrElse(newRangeRangeValue), _, hasTimeLeftAtLeast).get) orElse {
                            newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                          },
                          rangeValue = applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get
                        )
                        val lowerSplit = Memory.Range(oldRangeToKey, newRangeToKey, None, newRangeRangeValue)

                        add(upperSplit) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropPrepend(lowerSplit), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      }
                    } else {
                      //        11 - 15
                      //      10   -   20
                      if (newRangeToKey < oldRangeToKey) {
                        val upperSplit = Memory.Range(oldRangeFromKey, newRangeFromKey, oldRangeFromValue, oldRangeRangeValue)
                        val middleSplit = Memory.Range(newRangeFromKey, newRangeToKey, newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                        val lowerSplit = Memory.Range(newRangeToKey, oldRangeToKey, None, oldRangeRangeValue)

                        add(upperSplit).flatMap(_ => add(middleSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropPrepend(lowerSplit))

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else if (newRangeToKey equiv oldRangeToKey) {
                        //        11 -   20
                        //      10   -   20
                        val upperSplit = Memory.Range(oldRangeFromKey, newRangeFromKey, oldRangeFromValue, oldRangeRangeValue)
                        val lowerSplit = Memory.Range(newRangeFromKey, newRangeToKey, newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)

                        add(upperSplit).flatMap(_ => add(lowerSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropHead(), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      } else {
                        //        11 -     21
                        //      10   -   20
                        val upperSplit = Memory.Range(oldRangeFromKey, newRangeFromKey, oldRangeFromValue, oldRangeRangeValue)
                        val middleSplit = Memory.Range(newRangeFromKey, oldRangeToKey, newRangeFromValue.map(applyValue(_, oldRangeRangeValue, hasTimeLeftAtLeast).get), applyValue(newRangeRangeValue, oldRangeRangeValue, hasTimeLeftAtLeast).get)
                        val lowerSplit = Memory.Range(oldRangeToKey, newRangeToKey, None, newRangeRangeValue)

                        add(upperSplit).flatMap(_ => add(middleSplit)) match {
                          case Success(_) =>
                            doMerge(newKeyValues.dropPrepend(lowerSplit), oldKeyValues.dropHead())

                          case Failure(exception) =>
                            Failure(exception)
                        }
                      }
                    }

                  case Failure(exception) =>
                    Failure(exception)
                }

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is a Fixed key-value and the existing is a Group key-value.
          */
        case (Some(newKeyValue: KeyValue.ReadOnly.Fixed), Some(oldGroupKeyValue: ReadOnly.Group)) =>
          if (newKeyValue.key < oldGroupKeyValue.minKey)
            add(newKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldGroupKeyValue.maxKey lessThan newKeyValue.key)
            add(oldGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //is in-group key. Open the Group and merge.
            oldGroupKeyValue.segmentCache.getAll() match {
              case Success(oldGroupKeyValues) =>
                doMerge(newKeyValues, MergeList(oldGroupKeyValues) append oldKeyValues.dropHead())

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is a Group and the existing is a Fixed key-value.
          */
        case (Some(newGroupKeyValue: ReadOnly.Group), Some(oldKeyValue: KeyValue.ReadOnly.Fixed)) =>
          if (newGroupKeyValue.maxKey lessThan oldKeyValue.key)
            add(newGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldKeyValue.key < newGroupKeyValue.key)
            add(oldKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //Group overlaps fixed key-value
            newGroupKeyValue.segmentCache.getAll() match {
              case Success(newGroupKeyValues) =>
                doMerge(MergeList(newGroupKeyValues) append newKeyValues.dropHead(), oldKeyValues)

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is a Range key-value and the existing is a Group key-value.
          */
        case (Some(newRangeKeyValue: KeyValue.ReadOnly.Range), Some(oldGroupKeyValue: ReadOnly.Group)) =>
          if (newRangeKeyValue.toKey <= oldGroupKeyValue.minKey)
            add(newRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldGroupKeyValue.maxKey lessThan newRangeKeyValue.fromKey)
            add(oldGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else
          //Open the Group and merge.
            newRangeKeyValue.fetchFromAndRangeValue match {
              //Cases when the Remove range completely overlaps the group and there is no time set for
              //both fromValue & RangeValue then there is no need to open the group. Simply remove the Group.
              case Success((None | Some(Value.Remove(None, _)), Value.Remove(None, _))) if newRangeKeyValue.fromKey <= oldGroupKeyValue.minKey && oldGroupKeyValue.maxKey.maxKey < newRangeKeyValue.toKey =>
                doMerge(newKeyValues, oldKeyValues.dropHead())

              case Success(_) =>
                oldGroupKeyValue.segmentCache.getAll() match {
                  case Success(oldGroupKeyValues) =>
                    doMerge(newKeyValues, MergeList(oldGroupKeyValues) append oldKeyValues.dropHead())

                  case Failure(exception) =>
                    Failure(exception)
                }

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When the input is a Group and the existing is a Range key-value.
          */
        case (Some(newGroupKeyValue: ReadOnly.Group), Some(oldRangeKeyValue: KeyValue.ReadOnly.Range)) =>
          if (newGroupKeyValue.maxKey lessThan oldRangeKeyValue.fromKey)
            add(newGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldRangeKeyValue.toKey <= newGroupKeyValue.minKey)
            add(oldRangeKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //Group overlaps fixed key-value
            newGroupKeyValue.segmentCache.getAll() match {
              case Success(newGroupKeyValues) =>
                doMerge(MergeList(newGroupKeyValues) append newKeyValues.dropHead(), oldKeyValues)

              case Failure(exception) =>
                Failure(exception)
            }

        /**
          * When both are Groups.
          */
        case (Some(newGroupKeyValue: ReadOnly.Group), Some(oldGroupKeyValue: KeyValue.ReadOnly.Group)) =>
          if (newGroupKeyValue.maxKey lessThan oldGroupKeyValue.minKey)
            add(newGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues.dropHead(), oldKeyValues)
              case Failure(exception) =>
                Failure(exception)
            }
          else if (oldGroupKeyValue.maxKey lessThan newGroupKeyValue.minKey)
            add(oldGroupKeyValue) match {
              case Success(_) =>
                doMerge(newKeyValues, oldKeyValues.dropHead())
              case Failure(exception) =>
                Failure(exception)
            }
          else //Group overlaps fixed key-value
            newGroupKeyValue.segmentCache.getAll() match {
              case Success(newGroupKeyValues) =>
                oldGroupKeyValue.segmentCache.getAll() match {
                  case Success(oldGroupKeyValues) =>
                    doMerge(MergeList(newGroupKeyValues) append newKeyValues.dropHead(), MergeList(oldGroupKeyValues) append oldKeyValues.dropHead())

                  case Failure(exception) =>
                    Failure(exception)
                }

              case Failure(exception) =>
                Failure(exception)
            }

        //there are no more oldKeyValues. Add all remaining newKeyValues
        case (Some(_), None) =>
          newKeyValues.tryForeach(add) match {
            case Some(Failure(exception)) =>
              Failure(exception)
            case None =>
              Success(splits)
          }

        //there are no more newKeyValues. Add all remaining oldKeyValues
        case (None, Some(_)) =>
          oldKeyValues.tryForeach(add) match {
            case Some(Failure(exception)) =>
              Failure(exception)
            case None =>
              Success(splits)
          }

        case (None, None) =>
          Success(splits)
      }

    try
      doMerge(newKeyValues, oldKeyValues)
    catch {
      case ex: Exception =>
        Failure(ex)
    }
  }
}
