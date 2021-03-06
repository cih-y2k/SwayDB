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

import swaydb.serializers.{Serializer, _}

private[swaydb] object BatchImplicits {

  implicit def batchToRequest[K, V](batch: Batch[K, V])(implicit keySerializer: Serializer[K],
                                                        valueSerializer: Serializer[V]): swaydb.data.request.Batch =
    batch match {
      case Data.Put(key, value, deadline) =>
        swaydb.data.request.Batch.Put(key, Some(value), deadline)

      case Data.Remove(key, None, deadline) =>
        swaydb.data.request.Batch.Remove(key, deadline)

      case Data.Remove(from, Some(to), deadline) =>
        swaydb.data.request.Batch.RemoveRange(from, to, deadline)

      case Data.Update(from, Some(to), value) =>
        swaydb.data.request.Batch.UpdateRange(from, to, Some(value))

      case Data.Update(from, None, value) =>
        swaydb.data.request.Batch.Update(from, Some(value))

      case Data.Add(key, deadline) =>
        swaydb.data.request.Batch.Put(key, None, deadline)
    }

  implicit def batchesToRequests[K, V](batches: Iterable[Batch[K, V]])(implicit keySerializer: Serializer[K],
                                                                       valueSerializer: Serializer[V]): Iterable[swaydb.data.request.Batch] =
    batches.map(batch => batchToRequest(batch)(keySerializer, valueSerializer))

  implicit def batchesToRequests[T](batches: Iterable[Batch[T, Nothing]])(implicit serializer: Serializer[T]): Iterable[swaydb.data.request.Batch] =
    batches.map(batch => batchToRequest(batch)(serializer, Default.UnitSerializer))
}
