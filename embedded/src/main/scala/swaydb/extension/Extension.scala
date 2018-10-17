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

package swaydb.extension

import java.nio.file.Path

import com.typesafe.scalalogging.LazyLogging
import swaydb.configs.level.{DefaultGroupingStrategy, DefaultMemoryConfig, DefaultMemoryPersistentConfig, DefaultPersistentConfig}
import swaydb.core.CoreAPI
import swaydb.data.accelerate.{Accelerator, Level0Meter}
import swaydb.data.api.grouping.KeyValueGroupingStrategy
import swaydb.data.config._
import swaydb.data.slice.Slice
import swaydb.order.KeyOrder
import swaydb.serializers.Serializer
import swaydb.{Set, SwayDB, _}

import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{FiniteDuration, _}
import scala.util.Try

object Extension extends LazyLogging {

  /**
    * A pre-configured, 8 Leveled, persistent database where Level1 accumulates a minimum of 10 Segments before
    * pushing Segments to lower Level.
    *
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    *
    * @param dir                         Root directory for all Level where appendix folder & files are created
    * @param otherDirs                   Secondary directories for all Levels where Segments get distributed.
    * @param maxOpenSegments             Number of concurrent Segments opened
    * @param cacheSize                   Size of in-memory key-values
    * @param mapSize                     Size of LevelZero's maps (WAL)
    * @param mmapMaps                    Memory-maps LevelZero maps files if set to true else reverts java.nio.FileChannel
    * @param mmapAppendix                Memory-maps Levels appendix files if set to true else reverts java.nio.FileChannel
    * @param mmapSegments                Memory-maps Levels Segment files if set to true else reverts java.nio.FileChannel
    * @param segmentSize                 Minimum size of Segment files in each Level
    * @param appendixFlushCheckpointSize Size of the appendix file before it's flushed. Appendix files are append only log files.
    *                                    Flushing removes deleted entries in the file hence reducing the size of the file.
    * @param cacheCheckDelay             Sets the max interval at which key-values get dropped from the cache. The delays
    *                                    are dynamically adjusted based on the current size of the cache to stay close the set
    *                                    cacheSize.
    * @param segmentsOpenCheckDelay      Sets the max interval at which Segments get closed. The delays
    *                                    are dynamically adjusted based on the current number of open Segments.
    * @param acceleration                Controls the write speed.
    * @param keySerializer               Converts keys to Bytes
    * @param valueSerializer             Converts values to Bytes
    * @param ordering                    Sort order for keys
    * @param ec                          ExecutionContext
    * @tparam K Type of key
    * @tparam V Type of value
    * @return Database instance
    */

  def persistent[K, V](dir: Path,
                       maxOpenSegments: Int = 1000,
                       cacheSize: Int = 100.mb,
                       mapSize: Int = 4.mb,
                       mmapMaps: Boolean = true,
                       recoveryMode: RecoveryMode = RecoveryMode.ReportFailure,
                       mmapAppendix: Boolean = true,
                       mmapSegments: MMAP = MMAP.WriteAndRead,
                       segmentSize: Int = 2.mb,
                       appendixFlushCheckpointSize: Int = 2.mb,
                       otherDirs: Seq[Dir] = Seq.empty,
                       cacheCheckDelay: FiniteDuration = 7.seconds,
                       segmentsOpenCheckDelay: FiniteDuration = 5.seconds,
                       bloomFilterFalsePositiveRate: Double = 0.01,
                       minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                       compressDuplicateValues: Boolean = true,
                       lastLevelGroupingStrategy: Option[KeyValueGroupingStrategy] = Some(DefaultGroupingStrategy()),
                       acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit keySerializer: Serializer[K],
                                                                                          valueSerializer: Serializer[V],
                                                                                          ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                          ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Root[K, V]] =
    CoreAPI(
      config = DefaultPersistentConfig(
        dir = dir,
        otherDirs = otherDirs,
        mapSize = mapSize, mmapMaps = mmapMaps,
        mmapSegments = mmapSegments,
        recoveryMode = recoveryMode,
        mmapAppendix = mmapAppendix,
        segmentSize = segmentSize,
        appendixFlushCheckpointSize = appendixFlushCheckpointSize,
        bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
        minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
        compressDuplicateValues = compressDuplicateValues,
        groupingStrategy = lastLevelGroupingStrategy,
        acceleration = acceleration
      ),
      maxOpenSegments = maxOpenSegments,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Root[K, V](new SwayDB(core))
    }

  /**
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    */
  def persistentSet[T](dir: Path,
                       maxOpenSegments: Int = 1000,
                       cacheSize: Int = 100.mb,
                       mapSize: Int = 4.mb,
                       mmapMaps: Boolean = true,
                       recoveryMode: RecoveryMode = RecoveryMode.ReportFailure,
                       mmapAppendix: Boolean = true,
                       mmapSegments: MMAP = MMAP.WriteAndRead,
                       segmentSize: Int = 2.mb,
                       appendixFlushCheckpointSize: Int = 2.mb,
                       otherDirs: Seq[Dir] = Seq.empty,
                       cacheCheckDelay: FiniteDuration = 7.seconds,
                       segmentsOpenCheckDelay: FiniteDuration = 5.seconds,
                       bloomFilterFalsePositiveRate: Double = 0.01,
                       minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                       compressDuplicateValues: Boolean = true,
                       lastLevelGroupingStrategy: Option[KeyValueGroupingStrategy] = Some(DefaultGroupingStrategy()),
                       acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit serializer: Serializer[T],
                                                                                          ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                          ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Set[T]] = {
    CoreAPI(
      config = DefaultPersistentConfig(
        dir = dir,
        otherDirs = otherDirs,
        recoveryMode = recoveryMode,
        mapSize = mapSize,
        mmapMaps = mmapMaps,
        mmapSegments = mmapSegments,
        mmapAppendix = mmapAppendix,
        segmentSize = segmentSize,
        compressDuplicateValues = compressDuplicateValues,
        appendixFlushCheckpointSize = appendixFlushCheckpointSize,
        bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
        minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
        groupingStrategy = lastLevelGroupingStrategy,
        acceleration = acceleration
      ),
      maxOpenSegments = maxOpenSegments,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Set[T](new SwayDB(core))
    }
  }

  /**
    * A 2 Leveled (Level0 & Level1), in-memory database.
    *
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    *
    * @param mapSize         size of Level0 maps before they are converted into Segments
    * @param segmentSize     size of Level1 Segments
    * @param acceleration    Controls the write speed.
    * @param keySerializer   Converts keys to Bytes
    * @param valueSerializer Converts values to Bytes
    * @param ordering        Sort order for keys
    * @param ec
    * @tparam K
    * @tparam V
    * @return
    */

  def memory[K, V](mapSize: Int = 4.mb,
                   segmentSize: Int = 2.mb,
                   cacheSize: Int = 500.mb,
                   cacheCheckDelay: FiniteDuration = 7.seconds,
                   bloomFilterFalsePositiveRate: Double = 0.01,
                   minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                   compressDuplicateValues: Boolean = false,
                   groupingStrategy: Option[KeyValueGroupingStrategy] = None,
                   acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit keySerializer: Serializer[K],
                                                                                      valueSerializer: Serializer[V],
                                                                                      ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                      ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Root[K, V]] =
    CoreAPI(
      config = DefaultMemoryConfig(
        mapSize = mapSize,
        segmentSize = segmentSize,
        bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
        minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
        compressDuplicateValues = compressDuplicateValues,
        groupingStrategy = groupingStrategy,
        acceleration = acceleration
      ),
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      //memory Segments are never closed.
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        Root[K, V](new SwayDB(core))
    }

  /**
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    */
  def memorySet[T](mapSize: Int = 4.mb,
                   segmentSize: Int = 2.mb,
                   cacheSize: Int = 500.mb, //cacheSize for memory database is used for evicting decompressed key-values
                   cacheCheckDelay: FiniteDuration = 7.seconds,
                   bloomFilterFalsePositiveRate: Double = 0.01,
                   minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                   compressDuplicateValues: Boolean = false,
                   groupingStrategy: Option[KeyValueGroupingStrategy] = None,
                   acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit serializer: Serializer[T],
                                                                                      ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                      ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Set[T]] =
    CoreAPI(
      config = DefaultMemoryConfig(
        mapSize = mapSize,
        segmentSize = segmentSize,
        bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
        minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
        compressDuplicateValues = compressDuplicateValues,
        groupingStrategy = groupingStrategy,
        acceleration = acceleration
      ),
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      //memory Segments are never closed.
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        Set[T](new SwayDB(core))
    }

  /**
    * A 3 Leveled in-memory database where the 3rd is persistent.
    *
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    *
    * @param dir                        Root directory for all Level where appendix folder & files are created
    * @param otherDirs                  Secondary directories for all Levels where Segments get distributed.
    * @param maxOpenSegments            Number of concurrent Segments opened
    * @param mapSize                    Size of LevelZero's maps (WAL)
    * @param maxMemoryLevelSize         Total size of in-memory Level (Level1) before Segments gets pushed to persistent Level (Level2)
    * @param maxSegmentsToPush          Numbers of Segments to push from in-memory Level (Level1) to persistent Level (Level2)
    * @param memoryLevelSegmentSize     Size of Level1's Segments
    * @param persistentLevelSegmentSize Size of Level2's Segments
    * @param mmapPersistentSegments     Memory-maps Level2 Segments
    * @param mmapPersistentAppendix     Memory-maps Level2's appendix file
    * @param cacheSize                  Size of
    * @param cacheCheckDelay            Sets the max interval at which key-values get dropped from the cache. The delays
    *                                   are dynamically adjusted based on the current size of the cache to stay close the set
    *                                   cacheSize.
    * @param segmentsOpenCheckDelay     Sets the max interval at which Segments get closed. The delays
    *                                   are dynamically adjusted based on the current number of open Segments.
    * @param acceleration               Controls the write speed.
    * @param keySerializer              Converts keys to Bytes
    * @param valueSerializer            Converts values to Bytes
    * @param ordering                   Sort order for keys
    * @param ec                         ExecutionContext
    * @tparam K Type of key
    * @tparam V Type of value
    * @return Database instance
    */
  def memoryPersistent[K, V](dir: Path,
                             maxOpenSegments: Int = 1000,
                             mapSize: Int = 4.mb,
                             maxMemoryLevelSize: Int = 100.mb,
                             maxSegmentsToPush: Int = 5,
                             memoryLevelSegmentSize: Int = 2.mb,
                             persistentLevelSegmentSize: Int = 4.mb,
                             persistentLevelAppendixFlushCheckpointSize: Int = 2.mb,
                             mmapPersistentSegments: MMAP = MMAP.WriteAndRead,
                             mmapPersistentAppendix: Boolean = true,
                             cacheSize: Int = 100.mb, //cacheSize for memory database is used for evicting decompressed key-values & persistent key-values in-memory
                             otherDirs: Seq[Dir] = Seq.empty,
                             cacheCheckDelay: FiniteDuration = 7.seconds,
                             segmentsOpenCheckDelay: FiniteDuration = 5.seconds,
                             bloomFilterFalsePositiveRate: Double = 0.01,
                             minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                             compressDuplicateValues: Boolean = true,
                             groupingStrategy: Option[KeyValueGroupingStrategy] = Some(DefaultGroupingStrategy()),
                             acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit keySerializer: Serializer[K],
                                                                                                valueSerializer: Serializer[V],
                                                                                                ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                                ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Root[K, V]] =
    CoreAPI(
      config =
        DefaultMemoryPersistentConfig(
          dir = dir,
          otherDirs = otherDirs,
          mapSize = mapSize,
          maxMemoryLevelSize = maxMemoryLevelSize,
          maxSegmentsToPush = maxSegmentsToPush,
          memoryLevelSegmentSize = memoryLevelSegmentSize,
          persistentLevelSegmentSize = persistentLevelSegmentSize,
          persistentLevelAppendixFlushCheckpointSize = persistentLevelAppendixFlushCheckpointSize,
          mmapPersistentSegments = mmapPersistentSegments,
          mmapPersistentAppendix = mmapPersistentAppendix,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
          compressDuplicateValues = compressDuplicateValues,
          groupingStrategy = groupingStrategy,
          acceleration = acceleration
        ),
      maxOpenSegments = maxOpenSegments,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Root[K, V](new SwayDB(core))
    }

  /**
    * For custom configurations read documentation on website: http://www.swaydb.io/configuring-levels
    */
  def memoryPersistentSet[T](dir: Path,
                             maxOpenSegments: Int = 1000,
                             mapSize: Int = 4.mb,
                             maxMemoryLevelSize: Int = 100.mb,
                             maxSegmentsToPush: Int = 5,
                             memoryLevelSegmentSize: Int = 2.mb,
                             persistentLevelSegmentSize: Int = 4.mb,
                             persistentLevelAppendixFlushCheckpointSize: Int = 2.mb,
                             mmapPersistentSegments: MMAP = MMAP.WriteAndRead,
                             mmapPersistentAppendix: Boolean = true,
                             cacheSize: Int = 100.mb,
                             otherDirs: Seq[Dir] = Seq.empty,
                             cacheCheckDelay: FiniteDuration = 7.seconds,
                             segmentsOpenCheckDelay: FiniteDuration = 5.seconds,
                             bloomFilterFalsePositiveRate: Double = 0.01,
                             minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds,
                             compressDuplicateValues: Boolean = true,
                             groupingStrategy: Option[KeyValueGroupingStrategy] = Some(DefaultGroupingStrategy()),
                             acceleration: Level0Meter => Accelerator = Accelerator.noBrakes())(implicit serializer: Serializer[T],
                                                                                                ordering: Ordering[Slice[Byte]] = KeyOrder.default,
                                                                                                ec: ExecutionContext = SwayDB.defaultExecutionContext): Try[Set[T]] =
    CoreAPI(
      config =
        DefaultMemoryPersistentConfig(
          dir = dir,
          otherDirs = otherDirs,
          mapSize = mapSize,
          maxMemoryLevelSize = maxMemoryLevelSize,
          maxSegmentsToPush = maxSegmentsToPush,
          memoryLevelSegmentSize = memoryLevelSegmentSize,
          persistentLevelSegmentSize = persistentLevelSegmentSize,
          persistentLevelAppendixFlushCheckpointSize = persistentLevelAppendixFlushCheckpointSize,
          mmapPersistentSegments = mmapPersistentSegments,
          mmapPersistentAppendix = mmapPersistentAppendix,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration,
          compressDuplicateValues = compressDuplicateValues,
          groupingStrategy = groupingStrategy,
          acceleration = acceleration
        ),
      maxOpenSegments = maxOpenSegments,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Set[T](new SwayDB(core))
    }

  /**
    * Creates a database based on the input config.
    *
    * @param config                 Configuration to use to create the database
    * @param maxSegmentsOpen        Number of concurrent opened Segments
    * @param cacheSize              Size of in-memory key-values. For Memory database this set the size of uncompressed key-values.
    *                               If compression is used for memory database the this field can be ignored.
    * @param cacheCheckDelay        Sets the max interval at which key-values get dropped from the cache. The delays
    *                               are dynamically adjusted based on the current size of the cache to stay close the set
    *                               cacheSize.
    *                               If compression is not used for memory database the this field can be ignored.
    * @param segmentsOpenCheckDelay For persistent Levels only. This can property is not used for databases.
    *                               Sets the max interval at which Segments get closed. The delays
    *                               are dynamically adjusted based on the current number of open Segments.
    * @param keySerializer          Converts keys to Bytes
    * @param valueSerializer        Converts values to Bytes
    * @param ordering               Sort order for keys
    * @param ec                     ExecutionContext
    * @tparam K Type of key
    * @tparam V Type of value
    * @return Database instance
    */
  def apply[K, V](config: SwayDBPersistentConfig,
                  maxSegmentsOpen: Int,
                  cacheSize: Int,
                  cacheCheckDelay: FiniteDuration,
                  segmentsOpenCheckDelay: FiniteDuration)(implicit keySerializer: Serializer[K],
                                                          valueSerializer: Serializer[V],
                                                          ordering: Ordering[Slice[Byte]],
                                                          ec: ExecutionContext): Try[Root[K, V]] =
    CoreAPI(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Root[K, V](new SwayDB(core))
    }

  def apply[T](config: SwayDBPersistentConfig,
               maxSegmentsOpen: Int,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration,
               segmentsOpenCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                       ordering: Ordering[Slice[Byte]],
                                                       ec: ExecutionContext): Try[Set[T]] =
    CoreAPI(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        Set[T](new SwayDB(core))
    }

  def apply[K, V](config: SwayDBMemoryConfig,
                  cacheSize: Int,
                  cacheCheckDelay: FiniteDuration)(implicit keySerializer: Serializer[K],
                                                   valueSerializer: Serializer[V],
                                                   ordering: Ordering[Slice[Byte]],
                                                   ec: ExecutionContext): Try[Root[K, V]] =
    CoreAPI(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        Root[K, V](new SwayDB(core))
    }

  def apply[T](config: SwayDBMemoryConfig,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                ordering: Ordering[Slice[Byte]],
                                                ec: ExecutionContext): Try[Set[T]] =
    CoreAPI(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        Set[T](new SwayDB(core))
    }
}