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

package swaydb.core.map.serializer

import org.scalatest.{Matchers, WordSpec}
import scala.concurrent.duration._
import swaydb.core.data.Value
import swaydb.core.{CommonAssertions, TryAssert}
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._

class ValueSerializerForLevelZeroSpec extends WordSpec with Matchers with TryAssert with CommonAssertions {

  import ValueSerializers.LevelZero._

  "Serialize Remove for LevelZero" should {

    "Remove None" in {
      val value = Value.Remove(None)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Remove](bytes).assertGet shouldBe value
    }

    "Remove Some" in {
      val value = Value.Remove(10.seconds.fromNow)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Remove](bytes).assertGet shouldBe value
    }
  }

  "Serialize Put for LevelZero" should {

    "Put None None" in {
      val value = Value.Put(None, None)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value
    }

    "Put Some None" in {
      val value = Value.Put(1)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value
    }

    "Put None Some" in {
      val value = Value.Put(None, Some(10.seconds.fromNow))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value
    }

    "Put Some Some" in {
      val value = Value.Put(1, 10.seconds.fromNow)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value
    }
  }

  "Serialize Update for LevelZero" should {

    "Update None None" in {
      val value = Value.Update(None, None)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
    }

    "Update Some None" in {
      val value = Value.Update(1)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
    }

    "Update None Some" in {
      val value = Value.Update(None, Some(10.seconds.fromNow))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
    }

    "Update Some Some" in {
      val value = Value.Update(1, 10.seconds.fromNow)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)
      ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
    }
  }

  "random" in {
    runThis(100.times) {
      val fromValue = randomFromValue()

      fromValue match {
        case value: Value.Remove =>
          val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

          ValueSerializer.write(value)(bytes)
          ValueSerializer.read[Value.Remove](bytes).assertGet shouldBe value

        case value: Value.Put =>
          val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

          ValueSerializer.write(value)(bytes)
          ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value

        case value: Value.Update =>
          val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

          ValueSerializer.write(value)(bytes)
          ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
      }
    }
  }

}
