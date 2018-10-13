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

package swaydb

import swaydb.data.accelerate.Level0Meter
import swaydb.data.compaction.LevelMeter
import swaydb.data.request
import swaydb.data.slice.Slice
import swaydb.table.Table
import swaydb.table.Table._

import scala.concurrent.duration._
import scala.util.{Success, Try}

private[swaydb] class SwayDBTable(raw: SwayDBRaw)(implicit ordering: Ordering[Slice[Byte]]) extends SwayDB {

  import ordering._

  def subTable(key: Slice[Byte],
               value: Option[Slice[Byte]])(implicit table: Table): Try[(Table, Level0Meter)] = {
    val subTableEntry = Table.buildSubTableRow(key, table)
    contains(subTableEntry) flatMap {
      exists =>
        if (exists) {
          Success(Table.buildTable(key), raw.level0Meter)
        } else {
          val subTableBatch = request.Batch.Put(subTableEntry, value, None)

          val subTable = Table.buildTable(key)
          val tableStart = request.Batch.Put(subTable.start, value, None)
          val tableEnd = request.Batch.Put(subTable.end, value, None)

          raw.batch(Seq(subTableBatch, tableStart, tableEnd)) map {
            meter =>
              (subTable, meter)
          }
        }
    }
  }

  def put(key: Slice[Byte])(implicit table: Table) =
    raw.put(buildRowKey(key))

  def put(key: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table) =
    raw.put(buildRowKey(key), value)

  def put(key: Slice[Byte], value: Option[Slice[Byte]], expireAt: Deadline)(implicit table: Table): Try[Level0Meter] =
    raw.put(buildRowKey(key), value, expireAt)

  def update(key: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table): Try[Level0Meter] =
    raw.update(buildRowKey(key), value)

  def update(from: Slice[Byte], to: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table): Try[Level0Meter] =
    raw.update(buildRowKey(from), buildRowKey(to), value)

  def expire(key: Slice[Byte], at: Deadline)(implicit table: Table): Try[Level0Meter] =
    raw.expire(buildRowKey(key), at)

  def expire(from: Slice[Byte], to: Slice[Byte], at: Deadline)(implicit table: Table): Try[Level0Meter] =
    raw.expire(buildRowKey(from), buildRowKey(to), at)

  def remove(key: Slice[Byte])(implicit table: Table) =
    raw.remove(buildRowKey(key))

  def remove(from: Slice[Byte], to: Slice[Byte])(implicit table: Table): Try[Level0Meter] =
    raw.remove(buildRowKey(from), buildRowKey(to))

  def batch(entries: Iterable[request.Batch])(implicit table: Table) =
    entries map {
      case entry: request.Batch.Put =>
        entry.copy(key = buildRowKey(entry.key))

      case entry: request.Batch.Remove =>
        entry.copy(key = buildRowKey(entry.key))

      case entry @ request.Batch.Update(key, value) =>
        entry.copy(key = buildRowKey(entry.key))

      case entry: request.Batch.RemoveRange =>
        entry.copy(fromKey = buildRowKey(entry.fromKey), toKey = buildRowKey(entry.toKey))

      case entry: request.Batch.UpdateRange =>
        entry.copy(fromKey = buildRowKey(entry.fromKey), toKey = buildRowKey(entry.toKey))
    } andThen {
      entries =>
        raw.batch(entries)
    }

  private def assertBeforeTableEnd(keyValue: (Slice[Byte], Option[Slice[Byte]]))(implicit table: Table): Option[(Slice[Byte], Option[Slice[Byte]])] =
    if (keyValue._1 >= table.end)
      None
    else
      Some(keyValue)

  private def assertBeforeTableEnd(key: Slice[Byte])(implicit table: Table): Option[Slice[Byte]] =
    if (key >= table.end)
      None
    else
      Some(key)

  private def assertAfterTableStart(keyValue: (Slice[Byte], Option[Slice[Byte]]))(implicit table: Table): Option[(Slice[Byte], Option[Slice[Byte]])] =
    if (keyValue._1 <= table.start)
      None
    else
      Some(keyValue)

  private def assertAfterTableStart(key: Slice[Byte])(implicit table: Table): Option[Slice[Byte]] =
    if (key <= table.start)
      None
    else
      Some(key)

  def head(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    raw
      .after(table.start)
      .map(_.flatMap(assertBeforeTableEnd))
      .map(_.map(dropTableBytes))

  def last(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    raw
      .before(table.end)
      .map(_.flatMap(assertAfterTableStart))
      .map(_.map(dropTableBytes))

  def keyValueCount(implicit table: Table): Try[Int] =
    raw.keyValueCount

  def contains(key: Slice[Byte])(implicit table: Table): Try[Boolean] =
    raw.contains(buildRowKey(key))

  def mightContain(key: Slice[Byte])(implicit table: Table): Try[Boolean] =
    raw.mightContain(buildRowKey(key))

  def get(key: Slice[Byte])(implicit table: Table): Try[Option[Option[Slice[Byte]]]] =
    raw.get(buildRowKey(key))

  def getKey(key: Slice[Byte])(implicit table: Table): Try[Option[Slice[Byte]]] =
    raw
      .getKey(buildRowKey(key))
      .map(_.map(dropTableBytes))

  def getKeyValue(key: Slice[Byte])(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    raw
      .getKeyValue(buildRowKey(key))
      .map(_.map(dropTableBytes))

  def beforeKey(key: Slice[Byte])(implicit table: Table) =
    raw
      .beforeKey(buildRowKey(key))
      .map(_.flatMap(assertAfterTableStart))
      .map(_.map(dropTableBytes))

  def before(key: Slice[Byte])(implicit table: Table) =
    raw
      .before(buildRowKey(key))
      .map(_.flatMap(assertAfterTableStart))
      .map(_.map(dropTableBytes))

  def afterKey(key: Slice[Byte])(implicit table: Table) =
    raw
      .afterKey(buildRowKey(key))
      .map(_.flatMap(assertBeforeTableEnd))
      .map(_.map(dropTableBytes))

  def after(key: Slice[Byte])(implicit table: Table) =
    raw
      .after(buildRowKey(key))
      .map(_.flatMap(assertBeforeTableEnd))
      .map(_.map(dropTableBytes))

  def headKey(implicit table: Table): Try[Option[Slice[Byte]]] =
    raw
      .afterKey(table.start)
      .map(_.flatMap(assertBeforeTableEnd))
      .map(_.map(dropTableBytes))

  def lastKey(implicit table: Table): Try[Option[Slice[Byte]]] =
    raw
      .beforeKey(table.end)
      .map(_.flatMap(assertAfterTableStart))
      .map(_.map(dropTableBytes))

  def sizeOfSegments: Long =
    raw.sizeOfSegments

  def level0Meter: Level0Meter =
    raw.level0Meter

  def level1Meter: LevelMeter =
    raw.level1Meter

  def levelMeter(levelNumber: Int): Option[LevelMeter] =
    raw.levelMeter(levelNumber)

  def valueSize(key: Slice[Byte]): Try[Option[Int]] =
    raw.valueSize(key)

  def deadline(key: Slice[Byte]): Try[Option[Deadline]] =
    raw.deadline(key)
}