package swaydb.core.segment.format.one.entry.writer

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.CommonAssertions
import swaydb.core.data.{AppliedFunctions, UpdateFunctions}
import swaydb.core.io.reader.Reader
import swaydb.core.segment.format.one.entry.reader.MetaBlock
import swaydb.core.segment.format.one.entry.reader.MetaReader.{EmptyMetaReader, NonEmptyMetaReader}
import swaydb.serializers.Default._
import swaydb.serializers._

class MetaWriterReaderSpec extends WordSpec with Matchers with CommonAssertions {

  "MetaWriter" should {
    "return None for fixed key-value with no functions" in {
      runThis(100.times) {

        val keyValue =
          randomFixedKeyValue(
            key = 1,
            updateFunctions = UpdateFunctions.empty,
            appliedFunctions = AppliedFunctions.empty
          ).toTransient

        MetaWriter.write(keyValue) shouldBe empty
      }

      EmptyMetaReader.read(Reader.empty).assertGetOpt shouldBe empty
    }

    "write fixed key-value with applied function" in {
      runThis(100.times) {

        val appliedFunctions = AppliedFunctions(Seq(randomBytes(randomIntMax(10)), randomBytes(randomIntMax(10)), randomBytes(randomIntMax(10))))

        val keyValue =
          randomFixedKeyValue(
            key = 1,
            updateFunctions = UpdateFunctions.empty,
            appliedFunctions = appliedFunctions
          ).toTransient

        val bytes = MetaWriter.write(keyValue).assertGet
        bytes.isFull shouldBe true

        val metaBlockSize = bytes.readIntUnsigned().assertGet
        metaBlockSize shouldBe bytes.size - 1

        //reading the bytes should return in the meta block returned
        NonEmptyMetaReader.read(Reader(bytes)).assertGet shouldBe MetaBlock(UpdateFunctions.empty, appliedFunctions)
      }
    }

    "write and read meta bytes for Transient.Update with only updateFunctions" in {
      val keyValue =
        randomUpdateKeyValue(
          key = 1,
          updateFunctions = UpdateFunctions(Seq(1, 2))
        )
      val bytes = MetaWriter.write(keyValue.toTransient).assertGet
      bytes.isFull shouldBe true

      //MetaWriter also writes the size of the block.
      //this asserts that the head integer is the actual size of the remaining bytes.
      val metaBlockSize = bytes.readIntUnsigned().assertGet
      metaBlockSize shouldBe bytes.size - 1

      //reading the bytes should return in the meta block returned
      NonEmptyMetaReader.read(Reader(bytes)).assertGet shouldBe MetaBlock(UpdateFunctions(Seq(1, 2)), AppliedFunctions.empty)
    }

    "write and read meta bytes for Transient.Update with only appliedFunctions" in {
      val keyValue =
        randomUpdateKeyValue(
          key = 1,
          appliedFunctions = AppliedFunctions(Seq(1, 2))
        )
      val bytes = MetaWriter.write(keyValue.toTransient).assertGet
      bytes.isFull shouldBe true

      //MetaWriter also writes the size of the block.
      //this asserts that the head integer is the actual size of the remaining bytes.
      val metaBlockSize = bytes.readIntUnsigned().assertGet
      metaBlockSize shouldBe bytes.size - 1

      //reading the bytes should return in the meta block returned
      NonEmptyMetaReader.read(Reader(bytes)).assertGet shouldBe MetaBlock(UpdateFunctions.empty, AppliedFunctions(Seq(1, 2)))
    }

    "write and read meta bytes for Transient.Update with updateFunctions & appliedFunctions" in {
      val keyValue =
        randomUpdateKeyValue(
          key = 1,
          updateFunctions = UpdateFunctions(Seq(1, 2)),
          appliedFunctions = AppliedFunctions(Seq(3, 4))
        )
      val bytes = MetaWriter.write(keyValue.toTransient).assertGet
      bytes.isFull shouldBe true

      //MetaWriter also writes the size of the block.
      //this asserts that the head integer is the actual size of the remaining bytes.
      val metaBlockSize = bytes.readIntUnsigned().assertGet
      metaBlockSize shouldBe bytes.size - 1

      //reading the bytes should return in the meta block returned
      NonEmptyMetaReader.read(Reader(bytes)).assertGet shouldBe MetaBlock(UpdateFunctions(Seq(1, 2)), AppliedFunctions(Seq(3, 4)))
    }
  }

}
