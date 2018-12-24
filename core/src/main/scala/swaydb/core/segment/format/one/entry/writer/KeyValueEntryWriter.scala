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

import swaydb.core.data.KeyValue
import swaydb.core.segment.format.one.entry.id.GeneratedEntryId
import swaydb.core.util.Bytes._
import swaydb.data.slice.Slice

object KeyValueEntryWriter {

  /**
    * Returns the index bytes and value bytes for the key-value and also the used
    * value offset information for writing the next key-value.
    *
    * @param entryId                 [[GeneratedEntryId]] for this key-value's type.
    * @param compressDuplicateValues Compresses duplicate values if set to true.
    * @return indexEntry, valueBytes, valueOffsetBytes, nextValuesOffsetPosition
    */
  def write(current: KeyValue.WriteOnly,
            entryId: GeneratedEntryId,
            compressDuplicateValues: Boolean): (Slice[Byte], Option[Slice[Byte]], Int, Int) = {
    //the chuck to write for applied functions. This get inserted before the key bytes.
    //The result should also contain the unsigned Int size of the total bytes inserted as the head bytes
    val appliedFunctionsBytes = AppliedFunctionsWriter.write(current) getOrElse Slice.emptyBytes

    current.previous flatMap {
      previous =>
        compress(key = current.key, previous = previous, minimumCommonBytes = 2) map {
          case (_, remainingBytes) if remainingBytes.isEmpty =>

            val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
              ValueWriter.write(
                current = current,
                compressDuplicateValues = compressDuplicateValues,
                entryId = entryId.nonEmptyAppliedFunctions.keyFullyCompressed,
                plusSize = appliedFunctionsBytes.size + sizeOf(current.key.size) //write the size of keys that were compressed.
              )

            //            assert(indexBytes.isFull, s"indexSlice is not full actual: ${indexBytes.written} - expected: ${indexBytes.size}")
            //            valueBytes foreach (valueBytes => assert(valueBytes.isFull, s"valueBytes is not full actual: ${valueBytes.written} - expected: ${valueBytes.size}"))
            val bytes = indexBytes
              .addAll(appliedFunctionsBytes)
              .addIntUnsigned(current.key.size)

            (bytes, valueBytes, valueStartOffset, valueEndOffset)

          case (commonBytes, remainingBytes) =>
            val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
              ValueWriter.write(
                current = current,
                compressDuplicateValues = compressDuplicateValues,
                entryId = entryId.nonEmptyAppliedFunctions.keyPartiallyCompressed,
                plusSize = appliedFunctionsBytes.size + sizeOf(commonBytes) + remainingBytes.size //write the size of keys compressed and also the uncompressed Bytes
              )

            val bytes =
              indexBytes
                .addAll(appliedFunctionsBytes)
                .addIntUnsigned(commonBytes)
                .addAll(remainingBytes)

            (bytes, valueBytes, valueStartOffset, valueEndOffset)
        }
    } getOrElse {
      //no common prefixes or no previous write without compression
      val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
        ValueWriter.write(
          current = current,
          compressDuplicateValues = compressDuplicateValues,
          entryId = entryId.nonEmptyAppliedFunctions.keyUncompressed,
          plusSize = appliedFunctionsBytes.size + current.key.size //write key bytes.
        )

      val bytes =
        indexBytes
          .addAll(appliedFunctionsBytes)
          .addAll(current.key)

      (bytes, valueBytes, valueStartOffset, valueEndOffset)

    }
  }
}
