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

class SwayDBSubMapIterationSpec0 extends SwayDBSubMapIterationSpec {
  val keyValueCount: Int = 1000

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.persistent[Int, String](dir = randomDir, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapIterationSpec1 extends SwayDBSubMapIterationSpec {

  val keyValueCount: Int = 10000

  import swaydb._

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.persistent[Int, String](randomDir, mapSize = 1.byte, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapIterationSpec2 extends SwayDBSubMapIterationSpec {

  val keyValueCount: Int = 100000

  import swaydb._

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.memory[Int, String](mapSize = 1.byte, minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

class SwayDBSubMapIterationSpec3 extends SwayDBSubMapIterationSpec {
  val keyValueCount: Int = 100000

  override def newDB(minTimeLeftToUpdateExpiration: FiniteDuration): EmptyMap[Int, String] =
    SwayDB.enableExtensions.memory[Int, String](minTimeLeftToUpdateExpiration = minTimeLeftToUpdateExpiration).assertGet
}

sealed trait SwayDBSubMapIterationSpec extends TestBase with TestBaseEmbedded {

  val keyValueCount: Int

  def newDB(minTimeLeftToUpdateExpiration: FiniteDuration = 10.seconds): EmptyMap[Int, String]

  "From" should {

    "if the map contains 1 element" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap").assertGet
      val firstMap: SubMap[Int, String] = rootMap.subMap(2, "first map").assertGet

      firstMap.put(1, "one").assertGet
      firstMap.size shouldBe 1

      firstMap.head shouldBe ((1, "one"))
      firstMap.last shouldBe ((1, "one"))

      firstMap.map(keyValue => (keyValue._1 + 1, keyValue._2)) should contain only ((2, "one"))
      firstMap.foldLeft(List.empty[(Int, String)]) { case (_, keyValue) => List(keyValue) } shouldBe List((1, "one"))
      firstMap.foldRight(List.empty[(Int, String)]) { case (keyValue, _) => List(keyValue) } shouldBe List((1, "one"))
      firstMap mapRight { case keyValue => (keyValue._1 + 1, keyValue._2) } should contain only ((2, "one"))
      firstMap.takeRight(100) should contain only ((1, "one"))
      firstMap.takeRight(1) should contain only ((1, "one"))
      firstMap.take(100) should contain only ((1, "one"))
      firstMap.take(1) should contain only ((1, "one"))
      firstMap.dropRight(1) shouldBe empty
      firstMap.drop(1) shouldBe empty
      firstMap.dropRight(0) should contain only ((1, "one"))
      firstMap.drop(0) should contain only ((1, "one"))
      firstMap.scanRight((-1, "minus")) { case ((key, value), _) => (key, value) } shouldBe List((-1, "minus"), (1, "one"))
    }

    "if the map contains 2 elements" in {
      val db = newDB()

      val rootMap = db.rootMap(1, "rootMap").assertGet
      val firstMap: SubMap[Int, String] = rootMap.subMap(2, "first map").assertGet

      firstMap.put(1, "one").assertGet
      firstMap.put(2, "two").assertGet

      firstMap.size shouldBe 2
      firstMap.head shouldBe ((1, "one"))
      firstMap.last shouldBe ((2, "two"))

      firstMap.map(keyValue => (keyValue._1 + 1, keyValue._2)) shouldBe List((2, "one"), (3, "two"))
      firstMap.foldLeft(List.empty[(Int, String)]) { case (previous, keyValue) => previous :+ keyValue } shouldBe List((1, "one"), (2, "two"))
      firstMap.foldRight(List.empty[(Int, String)]) { case (keyValue, previous) => previous :+ keyValue } shouldBe List((2, "two"), (1, "one"))
      firstMap mapRight { case keyValue => keyValue } shouldBe List((2, "two"), (1, "one"))
      firstMap.takeRight(100) shouldBe List((2, "two"), (1, "one"))
      firstMap.takeRight(2) shouldBe List((2, "two"), (1, "one"))
      firstMap.takeRight(1) should contain only ((2, "two"))
      firstMap.take(100) should contain only((1, "one"), (2, "two"))
      firstMap.take(2) should contain only((1, "one"), (2, "two"))
      firstMap.take(1) should contain only ((1, "one"))
      firstMap.dropRight(1) should contain only ((1, "one"))
      firstMap.drop(1) should contain only ((2, "two"))
      firstMap.dropRight(0) shouldBe List((2, "two"), (1, "one"))
      firstMap.drop(0) shouldBe List((1, "one"), (2, "two"))
      firstMap.reduceRight[(Int, String)] {
        case (left, right) =>
          (left._1 + right._1, left._2 + right._2)
      } shouldBe(3, "onetwo")

      firstMap.reduceRightOption[(Int, String)] {
        case (left, right) =>
          println(left, right)
          (left._1 + right._1, left._2 + right._2)
      }.assertGet shouldBe(3, "onetwo")

      firstMap.scanRight((0, "")) {
        case ((key, value), (key2, value2)) =>
          (key + key2, value + value2)
      } shouldBe List((0, ""), (2, "two"), (3, "onetwo"))
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

      //FIRST MAP ITERATIONS
      subMap1.size shouldBe 2
      subMap1.head shouldBe ((1, "one"))
      subMap1.last shouldBe ((2, "two"))
      subMap1.map(keyValue => (keyValue._1 + 1, keyValue._2)) shouldBe List((2, "one"), (3, "two"))
      subMap1.foldLeft(List.empty[(Int, String)]) { case (previous, keyValue) => previous :+ keyValue } shouldBe List((1, "one"), (2, "two"))
      subMap1.foldRight(List.empty[(Int, String)]) { case (keyValue, previous) => previous :+ keyValue } shouldBe List((2, "two"), (1, "one"))
      subMap1 mapRight { case keyValue => keyValue } shouldBe List((2, "two"), (1, "one"))
      subMap1.takeRight(100) shouldBe List((2, "two"), (1, "one"))
      subMap1.takeRight(2) shouldBe List((2, "two"), (1, "one"))
      subMap1.takeRight(1) should contain only ((2, "two"))
      subMap1.take(100) should contain only((1, "one"), (2, "two"))
      subMap1.take(2) should contain only((1, "one"), (2, "two"))
      subMap1.take(1) should contain only ((1, "one"))
      subMap1.dropRight(1) should contain only ((1, "one"))
      subMap1.drop(1) should contain only ((2, "two"))
      subMap1.dropRight(0) shouldBe List((2, "two"), (1, "one"))
      subMap1.drop(0) shouldBe List((1, "one"), (2, "two"))
      subMap1.reduceRight[(Int, String)] {
        case (left, right) =>
          (left._1 + right._1, left._2 + right._2)
      } shouldBe(3, "onetwo")

      subMap1.reduceRightOption[(Int, String)] {
        case (left, right) =>
          //          println(left, right)
          (left._1 + right._1, left._2 + right._2)
      }.assertGet shouldBe(3, "onetwo")

      subMap1.scanRight((0, "")) {
        case ((key, value), (key2, value2)) =>
          (key + key2, value + value2)
      } shouldBe List((0, ""), (2, "two"), (3, "onetwo"))

      //SECOND MAP ITERATIONS
      subMap2.size shouldBe 2
      subMap2.head shouldBe ((3, "three"))
      subMap2.last shouldBe ((4, "four"))
      subMap2.map(keyValue => (keyValue._1, keyValue._2)) shouldBe List((3, "three"), (4, "four"))
      subMap2.foldLeft(List.empty[(Int, String)]) { case (previous, keyValue) => previous :+ keyValue } shouldBe List((3, "three"), (4, "four"))
      subMap2.foldRight(List.empty[(Int, String)]) { case (keyValue, previous) => previous :+ keyValue } shouldBe List((4, "four"), (3, "three"))
      subMap2 mapRight { case keyValue => keyValue } shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(100) shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(2) shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(1) should contain only ((4, "four"))
      subMap2.take(100) should contain only((3, "three"), (4, "four"))
      subMap2.take(2) should contain only((3, "three"), (4, "four"))
      subMap2.take(1) should contain only ((3, "three"))
      subMap2.dropRight(1) should contain only ((3, "three"))
      subMap2.drop(1) should contain only ((4, "four"))
      subMap2.dropRight(0) shouldBe List((4, "four"), (3, "three"))
      subMap2.drop(0) shouldBe List((3, "three"), (4, "four"))
      subMap2.reduceRight[(Int, String)] {
        case (left, right) =>
          (left._1 + right._1, left._2 + right._2)
      } shouldBe(7, "threefour")

      subMap2.reduceRightOption[(Int, String)] {
        case (left, right) =>
          //          println(left, right)
          (left._1 + right._1, left._2 + right._2)
      }.assertGet shouldBe(7, "threefour")

      subMap2.scanRight((0, "")) {
        case ((key, value), (key2, value2)) =>
          //          println(((key, value), (key2, value2)))
          (key + key2, value + value2)
      } shouldBe List((0, ""), (4, "four"), (7, "threefour"))
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

      //FIRST MAP ITERATIONS
      subMap1.size shouldBe 3
      subMap1.head shouldBe ((1, "one"))
      subMap1.last shouldBe ((3, "sub map 2"))
      subMap1.map(keyValue => (keyValue._1, keyValue._2)) shouldBe List((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.foldLeft(List.empty[(Int, String)]) { case (previous, keyValue) => previous :+ keyValue } shouldBe List((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.foldRight(List.empty[(Int, String)]) { case (keyValue, previous) => previous :+ keyValue } shouldBe List((3, "sub map 2"), (2, "two"), (1, "one"))
      subMap1 mapRight { case keyValue => keyValue } shouldBe List((3, "sub map 2"), (2, "two"), (1, "one"))
      subMap1.takeRight(100) shouldBe List((3, "sub map 2"), (2, "two"), (1, "one"))
      subMap1.takeRight(3) shouldBe List((3, "sub map 2"), (2, "two"), (1, "one"))
      subMap1.takeRight(1) should contain only ((3, "sub map 2"))
      subMap1.take(100) should contain only((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.take(2) should contain only((1, "one"), (2, "two"))
      subMap1.take(1) should contain only ((1, "one"))
      subMap1.dropRight(1) should contain only((1, "one"), (2, "two"))
      subMap1.drop(1) should contain only((2, "two"), (3, "sub map 2"))
      subMap1.dropRight(0) shouldBe List((3, "sub map 2"), (2, "two"), (1, "one"))
      subMap1.drop(0) shouldBe List((1, "one"), (2, "two"), (3, "sub map 2"))
      subMap1.reduceRight[(Int, String)] {
        case (left, right) =>
          (left._1 + right._1, left._2 + right._2)
      } shouldBe(6, "onetwosub map 2")

      subMap1.reduceRightOption[(Int, String)] {
        case (left, right) =>
          //          println(left, right)
          (left._1 + right._1, left._2 + right._2)
      }.assertGet shouldBe(6, "onetwosub map 2")

      subMap1.scanRight((0, "")) {
        case ((key, value), (key2, value2)) =>
          (key + key2, value + value2)
      } shouldBe List((0, ""), (3, "sub map 2"), (5, "twosub map 2"), (6, "onetwosub map 2"))

      //SECOND MAP ITERATIONS
      subMap2.size shouldBe 2
      subMap2.head shouldBe ((3, "three"))
      subMap2.last shouldBe ((4, "four"))
      subMap2.map(keyValue => (keyValue._1, keyValue._2)) shouldBe List((3, "three"), (4, "four"))
      subMap2.foldLeft(List.empty[(Int, String)]) { case (previous, keyValue) => previous :+ keyValue } shouldBe List((3, "three"), (4, "four"))
      subMap2.foldRight(List.empty[(Int, String)]) { case (keyValue, previous) => previous :+ keyValue } shouldBe List((4, "four"), (3, "three"))
      subMap2 mapRight { case keyValue => keyValue } shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(100) shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(2) shouldBe List((4, "four"), (3, "three"))
      subMap2.takeRight(1) should contain only ((4, "four"))
      subMap2.take(100) should contain only((3, "three"), (4, "four"))
      subMap2.take(2) should contain only((3, "three"), (4, "four"))
      subMap2.take(1) should contain only ((3, "three"))
      subMap2.dropRight(1) should contain only ((3, "three"))
      subMap2.drop(1) should contain only ((4, "four"))
      subMap2.dropRight(0) shouldBe List((4, "four"), (3, "three"))
      subMap2.drop(0) shouldBe List((3, "three"), (4, "four"))
      subMap2.reduceRight[(Int, String)] {
        case (left, right) =>
          (left._1 + right._1, left._2 + right._2)
      } shouldBe(7, "threefour")

      subMap2.reduceRightOption[(Int, String)] {
        case (left, right) =>
          //          println(left, right)
          (left._1 + right._1, left._2 + right._2)
      }.assertGet shouldBe(7, "threefour")

      subMap2.scanRight((0, "")) {
        case ((key, value), (key2, value2)) =>
          //          println(((key, value), (key2, value2)))
          (key + key2, value + value2)
      } shouldBe List((0, ""), (4, "four"), (7, "threefour"))
    }
  }
}