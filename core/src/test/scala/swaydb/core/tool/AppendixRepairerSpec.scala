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

package swaydb.core.tool

import java.nio.file.NoSuchFileException

import swaydb.core.TestBase
import swaydb.core.io.file.IO
import swaydb.data.slice.Slice
import swaydb.data.repairAppendix.{AppendixRepairStrategy, OverlappingSegmentsException}
import swaydb.data.util.StorageUnits._
import swaydb.order.KeyOrder
import swaydb.core.util.FileUtil._

import scala.util.Random

class AppendixRepairerSpec extends TestBase {

  implicit val ordering: Ordering[Slice[Byte]] = KeyOrder.default

  "AppendixRepair" should {
    "fail if the input path does not exist" in {
      AppendixRepairer(nextLevelPath, AppendixRepairStrategy.Report).failed.assertGet shouldBe a[NoSuchFileException]
    }

    "create new appendix file if all the Segments in the Level are non-overlapping Segments" in {
      val level = TestLevel(segmentSize = 10.kb)
      level.putKeyValues(randomIntKeyStringValues(1000)).assertGet

      level.segmentsCount() should be > 2
      val segmentsBeforeRepair = level.segments

      //repair appendix
      AppendixRepairer(level.rootPath, AppendixRepairStrategy.Report).assertGet
      level.appendixPath.exists shouldBe true //appendix is created

      //reopen level and it should contain all the Segment
      level.reopen.segments.map(_.path) shouldBe segmentsBeforeRepair.map(_.path)
    }

    "create empty appendix file is the Level is empty" in {
      //create empty Level
      val level = TestLevel(segmentSize = 10.kb)

      //delete appendix
      IO.walkDelete(level.appendixPath).assertGet
      level.appendixPath.exists shouldBe false

      //repair appendix
      AppendixRepairer(level.rootPath, AppendixRepairStrategy.Report).assertGet
      level.appendixPath.exists shouldBe true //appendix is created

      //reopen level, the Level is empty
      level.reopen.isEmpty shouldBe true
    }

    "report duplicate Segments" in {
      //create empty Level
      val level = TestLevel(segmentSize = 10.kb)

      val keyValues = randomIntKeyStringValues(1000)
      level.putKeyValues(keyValues).assertGet

      level.segmentsCount() should be > 2
      val segmentsBeforeRepair = level.segments
      level.segments.foldLeft(segmentsBeforeRepair.last.path.fileId.assertGet._1 + 1) {
        case (segmentId, segment) =>
          //create a duplicate Segment
          val duplicateSegment = segment.path.getParent.resolve(segmentId.toSegmentFileId)
          segment.copyTo(duplicateSegment).assertGet
          //perform repair
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.Report).failed.assertGet shouldBe a[OverlappingSegmentsException]
          //perform repair with DeleteNext. This will delete the newest duplicate Segment.
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.KeepOld).assertGet
          //newer duplicate Segment is deleted
          duplicateSegment.exists shouldBe false

          //copy again
          segment.copyTo(duplicateSegment).assertGet
          //now use delete previous instead
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.KeepNew).assertGet
          //newer duplicate Segment exists
          duplicateSegment.exists shouldBe true
          //older duplicate Segment is deleted
          segment.existsOnDisk shouldBe false
          segmentId + 1
      }
      //level still contains the same key-values
      level.reopen.segments shouldHaveSameKeyValuesAs segmentsBeforeRepair
    }

    "report overlapping min & max key Segments & delete newer overlapping Segment if DeleteNext is selected" in {
      //create empty Level
      val level = TestLevel(segmentSize = 10.kb)

      val keyValues = randomIntKeyStringValues(1000)
      level.putKeyValues(keyValues).assertGet

      level.segmentsCount() should be > 2
      val segmentsBeforeRepair = level.segments
      level.segments.foldLeft(segmentsBeforeRepair.last.path.fileId.assertGet._1 + 1) {
        case (overlappingSegmentId, segment) =>
          val overlappingLevelSegmentPath = level.rootPath.resolve(overlappingSegmentId.toSegmentFileId)

          def createOverlappingSegment() = {
            val numberOfKeyValuesToOverlap = randomNextInt(3) max 1
            val keyValuesToOverlap = Random.shuffle(segment.getAll(0.1).assertGet.toList).take(numberOfKeyValuesToOverlap)
            //create overlapping Segment
            val overlappingSegment = TestSegment(Slice(keyValuesToOverlap.toArray).updateStats).assertGet
            overlappingSegment.copyTo(overlappingLevelSegmentPath).assertGet
          }

          createOverlappingSegment()
          //perform repair with Report
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.Report).failed.assertGet shouldBe a[OverlappingSegmentsException]
          //perform repair with DeleteNext. This will delete the newest overlapping Segment.
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.KeepOld).assertGet
          //overlapping Segment does not exist.
          overlappingLevelSegmentPath.exists shouldBe false

          //create overlapping Segment again but this time do DeletePrevious
          createOverlappingSegment()
          AppendixRepairer(level.rootPath, AppendixRepairStrategy.KeepNew).assertGet
          //newer overlapping Segment exists
          overlappingLevelSegmentPath.exists shouldBe true
          //older overlapping Segment is deleted
          segment.existsOnDisk shouldBe false

          overlappingSegmentId + 1
      }

      level.reopen.segmentsCount() shouldBe segmentsBeforeRepair.size
    }
  }

}