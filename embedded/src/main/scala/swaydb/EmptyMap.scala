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

import swaydb.data.slice.Slice
import swaydb.data.submap.Table
import swaydb.serializers.Serializer

import scala.util.{Success, Try}

object EmptyMap {

  def apply[K, V](db: SwayDB)(implicit keySerializer: Serializer[K],
                              valueSerializer: Serializer[V],
                              ordering: Ordering[Slice[Byte]]): EmptyMap[K, V] = {
    new EmptyMap[K, V](db)
  }
}
/**
  * An immutable empty Map used as a the head map to create child [[RootMap]]s.
  */

class EmptyMap[K, V](db: SwayDB)(implicit keySerializer: Serializer[K],
                                 valueSerializer: Serializer[V],
                                 ordering: Ordering[Slice[Byte]]) {

  implicit val tableKeySerializer = Table.tableKeySerializer(keySerializer)

  private val map = new Map[Table[K], V](db)

  def rootMap(key: K, value: V): Try[RootMap[K, V]] =
    map.contains(Table.Start(key)) flatMap {
      exists =>
        if (exists) {
          implicit val tableKeySerializer = Table.tableKeySerializer(keySerializer)
          Success(new RootMap[K, V](db, key))
        } else {
          map.batch(
            Batch.Put(Table.Start(key), value),
            Batch.Put(Table.End(key), value)
          ) map {
            _ =>
              implicit val tableKeySerializer = Table.tableKeySerializer(keySerializer)
              new RootMap[K, V](db, key)
          }
        }
    }
}