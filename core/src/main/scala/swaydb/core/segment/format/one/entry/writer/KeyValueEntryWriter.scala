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
import swaydb.core.segment.format.one.entry.id.{EntryIdBind, GeneratedEntryId}
import swaydb.core.util.Bytes._
import swaydb.data.slice.Slice

object KeyValueEntryWriter {

  /**
    * Returns the index bytes and value bytes for the key-value and also the used
    * value offset information for writing the next key-value.
    *
    * @param bind                    [[GeneratedEntryId]] for this key-value's type.
    * @param compressDuplicateValues Compresses duplicate values if set to true.
    * @return indexEntry, valueBytes, valueOffsetBytes, nextValuesOffsetPosition
    */
  def write[T <: KeyValue.WriteOnly](current: T,
                                     compressDuplicateValues: Boolean)(implicit bind: EntryIdBind[T]): (Slice[Byte], Option[Slice[Byte]], Int, Int) = {
    //the chuck to write for applied functions. This get inserted before the key bytes.
    //The result should also contain the unsigned Int size of the total bytes inserted as the head bytes
    val metaBytes = MetaWriter.write(current)

    current.previous flatMap {
      previous =>
        compress(key = current.fullKey, previous = previous, minimumCommonBytes = 2) map {
          case (_, remainingBytes) if remainingBytes.isEmpty =>

            val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
              ValueWriter.write(
                current = current,
                compressDuplicateValues = compressDuplicateValues,
                entryId = if (metaBytes.isDefined) bind.entryId.nonEmptyMeta.keyFullyCompressed else bind.entryId.emptyMeta.keyFullyCompressed,
                plusSize = metaBytes.map(_.size).getOrElse(0) + sizeOf(current.fullKey.size) //write the size of keys that were compressed.
              )

//            assert(indexBytes.isFull, s"indexSlice is not full actual: ${indexBytes.written} - expected: ${indexBytes.size}")
//            valueBytes foreach (valueBytes => assert(valueBytes.isFull, s"valueBytes is not full actual: ${valueBytes.written} - expected: ${valueBytes.size}"))
//
            val bytes =
              indexBytes
                .addAll(metaBytes.getOrElse(Slice.emptyBytes))
                .addIntUnsigned(current.fullKey.size)

            (bytes, valueBytes, valueStartOffset, valueEndOffset)

          case (commonBytes, remainingBytes) =>
            val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
              ValueWriter.write(
                current = current,
                compressDuplicateValues = compressDuplicateValues,
                entryId = if (metaBytes.isDefined) bind.entryId.nonEmptyMeta.keyPartiallyCompressed else bind.entryId.emptyMeta.keyPartiallyCompressed,
                plusSize = metaBytes.map(_.size).getOrElse(0) + sizeOf(commonBytes) + remainingBytes.size //write the size of keys compressed and also the uncompressed Bytes
              )

            val bytes =
              indexBytes
                .addAll(metaBytes.getOrElse(Slice.emptyBytes))
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
          entryId = if (metaBytes.isDefined) bind.entryId.nonEmptyMeta.keyUncompressed else bind.entryId.emptyMeta.keyUncompressed,
          plusSize = metaBytes.map(_.size).getOrElse(0) + current.fullKey.size //write key bytes.
        )

      val bytes =
        indexBytes
          .addAll(metaBytes.getOrElse(Slice.emptyBytes))
          .addAll(current.fullKey)

      (bytes, valueBytes, valueStartOffset, valueEndOffset)

    }
  }
}
