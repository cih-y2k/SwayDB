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

package swaydb.core.segment.format.one.entry.reader

import swaydb.core.data.Persistent
import swaydb.core.segment.SegmentException
import swaydb.core.segment.format.one.entry.id._
import swaydb.core.segment.format.one.entry.reader.matchers._
import swaydb.data.slice.{Reader, Slice}
import scala.util.{Failure, Try}
import swaydb.data.order.KeyOrder

object EntryReader {

  def read(indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent])(implicit keyOrder: KeyOrder[Slice[Byte]]): Try[Persistent] =
    indexReader.readIntUnsigned() flatMap {
      id =>
        PutEntryId.contains(id) map {
          id =>
            PutEmptyFunctionsEntryIdReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            ) orElse {
              PutNonEmptyFunctionsEntryIdReader.read(
                id = id,
                indexReader = indexReader,
                valueReader = valueReader,
                indexOffset = indexOffset,
                nextIndexOffset = nextIndexOffset,
                nextIndexSize = nextIndexSize,
                previous = previous
              )
            }
        } orElse {
          GroupEntryId.contains(id) map {
            id =>
              GroupEmptyFunctionsEntryIdReader.read(
                id = id,
                indexReader = indexReader,
                valueReader = valueReader,
                indexOffset = indexOffset,
                nextIndexOffset = nextIndexOffset,
                nextIndexSize = nextIndexSize,
                previous = previous
              ) orElse {
                GroupNonEmptyFunctionsEntryIdReader.read(
                  id = id,
                  indexReader = indexReader,
                  valueReader = valueReader,
                  indexOffset = indexOffset,
                  nextIndexOffset = nextIndexOffset,
                  nextIndexSize = nextIndexSize,
                  previous = previous
                )
              }
          }
        } orElse {
          UpdateEntryId.contains(id) map {
            id =>
              UpdateEmptyFunctionsEntryIdReader.read(
                id = id,
                indexReader = indexReader,
                valueReader = valueReader,
                indexOffset = indexOffset,
                nextIndexOffset = nextIndexOffset,
                nextIndexSize = nextIndexSize,
                previous = previous
              ) orElse {
                UpdateNonEmptyFunctionsEntryIdReader.read(
                  id = id,
                  indexReader = indexReader,
                  valueReader = valueReader,
                  indexOffset = indexOffset,
                  nextIndexOffset = nextIndexOffset,
                  nextIndexSize = nextIndexSize,
                  previous = previous
                )
              }
          }
        } orElse {
          RemoveEntryId.contains(id) map {
            id =>
              RemoveEmptyFunctionsEntryIdReader.read(
                id = id,
                indexReader = indexReader,
                valueReader = valueReader,
                indexOffset = indexOffset,
                nextIndexOffset = nextIndexOffset,
                nextIndexSize = nextIndexSize,
                previous = previous
              ) orElse {
                RemoveNonEmptyFunctionsEntryIdReader.read(
                  id = id,
                  indexReader = indexReader,
                  valueReader = valueReader,
                  indexOffset = indexOffset,
                  nextIndexOffset = nextIndexOffset,
                  nextIndexSize = nextIndexSize,
                  previous = previous
                )
              }
          }
        } orElse {
          RangeEntryId.contains(id) map {
            id =>
              RangeEmptyFunctionsEntryIdReader.read(
                id = id,
                indexReader = indexReader,
                valueReader = valueReader,
                indexOffset = indexOffset,
                nextIndexOffset = nextIndexOffset,
                nextIndexSize = nextIndexSize,
                previous = previous
              ) orElse {
                RangeNonEmptyFunctionsEntryIdReader.read(
                  id = id,
                  indexReader = indexReader,
                  valueReader = valueReader,
                  indexOffset = indexOffset,
                  nextIndexOffset = nextIndexOffset,
                  nextIndexSize = nextIndexSize,
                  previous = previous
                )
              }
          }
        } getOrElse {
          Failure(SegmentException.InvalidEntryId(id))
        }
    }
}
