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

package swaydb.core.segment.format.one.entry.writer

import swaydb.core.data.{KeyValue, Transient}
import swaydb.core.segment.format.one.entry.id.EntryId
import swaydb.core.util.Bytes
import swaydb.core.util.Bytes._
import swaydb.data.slice.Slice

object AppliedFunctionsWriter {

  /**
    * @return indexEntry, valueBytes, valueOffsetBytes, nextValuesOffsetPosition
    */
  def write(current: KeyValue.WriteOnly,
            entryId: EntryId,
            compressDuplicateValues: Boolean): (Slice[Byte], EntryId.AppliedFunctions) =
//    current match {
//      case fixed: KeyValue.WriteOnly.Fixed if fixed.appliedFunctions.nonEmpty =>
//        KeyWriter.write(
//          current = current,
//          appliedFunctionsBytes = Bytes.writeSeq(fixed.appliedFunctions),
//          entryId = A
//        )
//
//        (Bytes.writeSeq(fixed.appliedFunctions), EntryId.
//          ???
//      case _: KeyValue.WriteOnly.Range | _: KeyValue.WriteOnly.Group | _: KeyValue.WriteOnly.Fixed =>
//        val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
//          ValueWriter.write(
//            current = current,
//            compressDuplicateValues = compressDuplicateValues,
//            id = entryId.keyPartiallyCompressed,
//            plusSize = sizeOf(commonBytes) + remainingBytes.size //write the size of keys compressed and also the uncompressed Bytes
//          )
//        (indexBytes.addIntUnsigned(commonBytes).addAll(remainingBytes), valueBytes, valueStartOffset, valueEndOffset)
//    }
  ???

}
