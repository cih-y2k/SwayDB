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

package swaydb.core.segment.format.one.entry.reader.matchers

import scala.util.Try
import swaydb.core.data.Persistent
import swaydb.core.segment.format.one.entry.id.EntryId
import swaydb.core.segment.format.one.entry.reader._
import swaydb.data.slice.Reader

object RemoveReader {

  def reader[T <: EntryId](id: T,
                           indexReader: Reader,
                           indexOffset: Int,
                           nextIndexOffset: Int,
                           nextIndexSize: Int,
                           previous: Option[Persistent])(implicit keyReader: KeyReader[T],
                                                         deadlineReader: DeadlineReader[T]): Try[Persistent.Remove] =
    deadlineReader.read(indexReader, previous) flatMap {
      deadline =>
        keyReader.read(indexReader, previous) map {
          key =>
            Persistent.Remove(
              _key = key,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              deadline = deadline
            )
        }

    }

}
