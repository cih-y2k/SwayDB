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

import swaydb.core.TestBase
import swaydb.serializers.Default._
import swaydb.{EmptyMap, SubMap, SwayDB, TestBaseEmbedded}

import scala.concurrent.duration._

class SwayDBSubMapFromSpec0 extends SwayDBSubMapFromSpec {
  val keyValueCount: Int = 1000

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.persistent[Int, String](dir = randomDir, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapFromSpec1 extends SwayDBSubMapFromSpec {

  val keyValueCount: Int = 10000

  import swaydb._

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.persistent[Int, String](randomDir, mapSize = 1.byte, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapFromSpec2 extends SwayDBSubMapFromSpec {

  val keyValueCount: Int = 100000

  import swaydb._

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.memory[Int, String](mapSize = 1.byte, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapFromSpec3 extends SwayDBSubMapFromSpec {
  val keyValueCount: Int = 100000

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.memory[Int, String](minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

sealed trait SwayDBSubMapFromSpec extends TestBase with TestBaseEmbedded {

  val keyValueCount: Int

  def newDB(minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds): EmptyMap[Int, String]

  "From" should {

    "return empty on an empty Map" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap").assertGet
      val firstMap: SubMap[Int, String] = rootMap.subMap(2, "first map").assertGet

      firstMap
        .from(2)
        .toList shouldBe empty

    }

    "if the map contains only 1 element" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap").assertGet
      val firstMap: SubMap[Int, String] = rootMap.subMap(2, "first map").assertGet

      firstMap.put(1, "one").assertGet

      firstMap
        .from(2)
        .toList shouldBe empty

      firstMap
        .after(1)
        .toList shouldBe empty

      firstMap
        .from(1)
        .toList should contain only ((1, "one"))

      firstMap
        .fromOrBefore(2)
        .toList should contain only ((1, "one"))

      firstMap
        .fromOrBefore(1)
        .toList should contain only ((1, "one"))

      firstMap
        .after(0)
        .toList should contain only ((1, "one"))

      firstMap
        .fromOrAfter(0)
        .toList should contain only ((1, "one"))

      firstMap.size shouldBe 1

      firstMap.head shouldBe ((1, "one"))
      firstMap.last shouldBe ((1, "one"))
    }

    "Sibling maps" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap1").assertGet

      val subMap1: SubMap[Int, String] = rootMap.subMap(2, "sub map 2").assertGet
      subMap1.put(1, "one").assertGet
      subMap1.put(2, "two").assertGet

      val subMap2: SubMap[Int, String] = rootMap.subMap(3, "sub map three").assertGet
      subMap2.put(3, "three").assertGet
      subMap2.put(4, "four").assertGet

      subMap1.from(3).toList shouldBe empty
      subMap1.after(2).toList shouldBe empty
      subMap1.from(1).toList should contain inOrderOnly((1, "one"), (2, "two"))
      subMap1.fromOrBefore(2).toList should contain only ((2, "two"))
      subMap1.fromOrBefore(1).toList should contain inOrderOnly((1, "one"), (2, "two"))
      subMap1.after(0).toList should contain inOrderOnly((1, "one"), (2, "two"))
      subMap1.fromOrAfter(0).toList should contain inOrderOnly((1, "one"), (2, "two"))
      subMap1.size shouldBe 2
      subMap1.head shouldBe ((1, "one"))
      subMap1.last shouldBe ((2, "two"))

      subMap2.from(5).toList shouldBe empty
      subMap2.after(4).toList shouldBe empty
      subMap2.from(3).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.fromOrBefore(5).toList should contain only ((4, "four"))
      subMap2.fromOrBefore(3).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.after(0).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.fromOrAfter(1).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.size shouldBe 2
      subMap2.head shouldBe ((3, "three"))
      subMap2.last shouldBe ((4, "four"))
    }

    "nested maps" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap1").assertGet

      val subMap1: SubMap[Int, String] = rootMap.subMap(2, "sub map 1").assertGet
      subMap1.put(1, "one").assertGet
      subMap1.put(2, "two").assertGet

      val subMap2: SubMap[Int, String] = subMap1.subMap(3, "sub map 2").assertGet
      subMap2.put(3, "three").assertGet
      subMap2.put(4, "four").assertGet

      subMap1.from(4).toList shouldBe empty
      subMap1.after(3).toList shouldBe empty
      subMap1.from(1).toList should contain inOrderOnly((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.fromOrBefore(2).toList should contain inOrderOnly((2, "two"), (3, "sub map 2"))
      subMap1.fromOrBefore(1).toList should contain inOrderOnly((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.after(0).toList should contain inOrderOnly((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.fromOrAfter(0).toList should contain inOrderOnly((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.size shouldBe 3
      subMap1.head shouldBe ((1, "one"))
      subMap1.last shouldBe ((3, "sub map 2"))

      subMap2.from(5).toList shouldBe empty
      subMap2.after(4).toList shouldBe empty
      subMap2.from(3).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.fromOrBefore(5).toList should contain only ((4, "four"))
      subMap2.fromOrBefore(3).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.after(0).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.fromOrAfter(1).toList should contain inOrderOnly((3, "three"), (4, "four"))
      subMap2.size shouldBe 2
      subMap2.head shouldBe ((3, "three"))
      subMap2.last shouldBe ((4, "four"))
    }
  }
}