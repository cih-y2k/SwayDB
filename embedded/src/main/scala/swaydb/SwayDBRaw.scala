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

import swaydb.core.CoreAPI
import swaydb.core.data.{Memory, Value}
import swaydb.core.map.MapEntry
import swaydb.core.map.serializer.LevelZeroMapEntryWriter
import swaydb.data.accelerate.Level0Meter
import swaydb.data.compaction.LevelMeter
import swaydb.data.request
import swaydb.data.slice.Slice
import swaydb.table.Table

import scala.concurrent.duration._
import scala.util.{Failure, Try}

private[swaydb] class SwayDBRaw(api: CoreAPI) extends SwayDB {

  def put(key: Slice[Byte])(implicit table: Table): Try[Level0Meter] =
    api.put(key)

  def put(key: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table): Try[Level0Meter] =
    api.put(key, value)

  def put(key: Slice[Byte], value: Option[Slice[Byte]], expireAt: Deadline)(implicit table: Table): Try[Level0Meter] =
    api.put(key, value, expireAt)

  def update(key: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table): Try[Level0Meter] =
    api.update(key, value)

  def update(from: Slice[Byte], to: Slice[Byte], value: Option[Slice[Byte]])(implicit table: Table): Try[Level0Meter] =
    api.update(from, to, value)

  def expire(key: Slice[Byte], at: Deadline)(implicit table: Table): Try[Level0Meter] =
    api.remove(key, at)

  def expire(from: Slice[Byte], to: Slice[Byte], at: Deadline)(implicit table: Table): Try[Level0Meter] =
    api.remove(from, to, at)

  def remove(key: Slice[Byte])(implicit table: Table): Try[Level0Meter] =
    api.remove(key)

  def remove(from: Slice[Byte], to: Slice[Byte])(implicit table: Table): Try[Level0Meter] =
    api.remove(from, to)

  def batch(entries: Iterable[request.Batch])(implicit table: Table): Try[Level0Meter] =
    entries.foldLeft(Option.empty[MapEntry[Slice[Byte], Memory.SegmentResponse]]) {
      case (mapEntry, batchEntry) =>
        val nextEntry =
          batchEntry match {
            case request.Batch.Put(key, value, expire) =>
              MapEntry.Put[Slice[Byte], Memory.Put](key, Memory.Put(key, value, expire))(LevelZeroMapEntryWriter.Level0PutWriter)

            case request.Batch.Remove(key, expire) =>
              MapEntry.Put[Slice[Byte], Memory.Remove](key, Memory.Remove(key, expire))(LevelZeroMapEntryWriter.Level0RemoveWriter)

            case request.Batch.Update(key, value) =>
              MapEntry.Put[Slice[Byte], Memory.Update](key, Memory.Update(key, value))(LevelZeroMapEntryWriter.Level0UpdateWriter)

            case request.Batch.RemoveRange(fromKey, toKey, expire) =>
              (MapEntry.Put[Slice[Byte], Memory.Range](fromKey, Memory.Range(fromKey, toKey, None, Value.Remove(expire)))(LevelZeroMapEntryWriter.Level0RangeWriter): MapEntry[Slice[Byte], Memory.SegmentResponse]) ++
                MapEntry.Put[Slice[Byte], Memory.Remove](toKey, Memory.Remove(toKey, expire))(LevelZeroMapEntryWriter.Level0RemoveWriter)

            case request.Batch.UpdateRange(fromKey, toKey, value) =>
              (MapEntry.Put[Slice[Byte], Memory.Range](fromKey, Memory.Range(fromKey, toKey, None, Value.Update(value, None)))(LevelZeroMapEntryWriter.Level0RangeWriter): MapEntry[Slice[Byte], Memory.SegmentResponse]) ++
                MapEntry.Put[Slice[Byte], Memory.Update](toKey, Memory.Update(toKey))(LevelZeroMapEntryWriter.Level0UpdateWriter)
          }
        Some(mapEntry.map(_ ++ nextEntry) getOrElse nextEntry)
    } map {
      entry =>
        api.put(entry)
    } getOrElse Failure(new Exception("Cannot write empty batch"))

  def head(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.head

  def last(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.last

  def keyValueCount(implicit table: Table): Try[Int] =
    api.bloomFilterKeyValueCount

  def contains(key: Slice[Byte])(implicit table: Table): Try[Boolean] =
    api contains key

  def mightContain(key: Slice[Byte])(implicit table: Table): Try[Boolean] =
    api mightContain key

  def get(key: Slice[Byte])(implicit table: Table): Try[Option[Option[Slice[Byte]]]] =
    api.get(key)

  def getKey(key: Slice[Byte])(implicit table: Table): Try[Option[Slice[Byte]]] =
    api.getKey(key)

  def getKeyValue(key: Slice[Byte])(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.getKeyValue(key)

  def beforeKey(key: Slice[Byte])(implicit table: Table): Try[Option[Slice[Byte]]] =
    api.beforeKey(key)

  def before(key: Slice[Byte])(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.before(key)

  def afterKey(key: Slice[Byte])(implicit table: Table): Try[Option[Slice[Byte]]] =
    api.afterKey(key)

  def after(key: Slice[Byte])(implicit table: Table): Try[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.after(key)

  def headKey(implicit table: Table): Try[Option[Slice[Byte]]] =
    api.headKey

  def lastKey(implicit table: Table): Try[Option[Slice[Byte]]] =
    api.lastKey

  def sizeOfSegments: Long =
    api.sizeOfSegments

  def level0Meter: Level0Meter =
    api.level0Meter

  def level1Meter: LevelMeter =
    api.level1Meter

  def levelMeter(levelNumber: Int): Option[LevelMeter] =
    api.levelMeter(levelNumber)

  def valueSize(key: Slice[Byte]): Try[Option[Int]] =
    api.valueSize(key)

  def deadline(key: Slice[Byte]): Try[Option[Deadline]] =
    api.deadline(key)
}