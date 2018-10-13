///*
// * Copyright (C) 2018 Simer Plaha (@simerplaha)
// *
// * This file is a part of SwayDB.
// *
// * SwayDB is free software: you can redistribute it and/or modify
// * it under the terms of the GNU Affero General Public License as
// * published by the Free Software Foundation, either version 3 of the
// * License, or (at your option) any later version.
// *
// * SwayDB is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU Affero General Public License for more details.
// *
// * You should have received a copy of the GNU Affero General Public License
// * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
// */
//
//package swaydb.table
//
//import java.util.concurrent.ConcurrentSkipListSet
//
//import swaydb.core.TestBase
//import swaydb.data.slice.Slice
//import swaydb.order.KeyOrder
//import swaydb.serializers.Default._
//import swaydb.serializers._
//
//import scala.collection.JavaConverters._
//
//class TableSpec extends TestBase {
//
//  val skipList = new ConcurrentSkipListSet[Slice[Byte]](Table.ordering(Ordering.by(_.readInt())))
//
//  "NestOrder.startNested" should {
//    "return start, item, end key entries" in {
//      val rootTable = Table.buildTable(10)
//
//      skipList.add(rootTable.start)
////      skipList.add(rootTable.row)
////      skipList.add(rootTable.subTable)
//      skipList.add(rootTable.end)
//
//      println(rootTable)
//
//      val subTableEntry1 = Table.buildSubTableRow(subTableId = 20, table = rootTable)
//      println(subTableEntry1)
//      skipList.add(subTableEntry1)
//
//      val subTable1 = Table.buildTable(20)
//
//      val rowEntry = Table.buildRowKey(1, subTable1)
//      skipList.add(rowEntry)
//      skipList.add(subTable1.start)
////      skipList.add(subTable1.row)
////      skipList.add(subTable1.subTable)
//      skipList.add(subTable1.end)
//
//      val subTableEntry2 = Table.buildSubTableRow(subTableId = 30, table = subTable1)
//      println(subTableEntry2)
//      skipList.add(subTableEntry2)
//
//      val subTable2 = Table.buildTable(30)
//
//      skipList.add(subTable2.start)
////      skipList.add(subTable2.row)
////      skipList.add(subTable2.subTable)
//      skipList.add(subTable2.end)
//
//      println
//
//      skipList.asScala foreach println
//
//    }
//
//  }
//
//}
