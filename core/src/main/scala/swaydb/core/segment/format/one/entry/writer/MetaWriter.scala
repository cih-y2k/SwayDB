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
import swaydb.core.util.Bytes
import swaydb.data.slice.Slice

object MetaWriter {

  val functionsMetaId: Int = 0
  val fixedMetaId: Int = 1

  /**
    * Writes meta block for a key-value.
    *
    * @return returns None if no meta block is required else returns
    *         the meta block for the key-value which currently stores functions information.
    *         NOTE: it also inserts the size of the block as the head bytes.
    */
  def write(current: KeyValue.WriteOnly): Option[Slice[Byte]] =
    current match {
      case update: Transient.Update if update.updateFunctions.nonEmpty && update.appliedFunctions.nonEmpty =>
        val updateFunctionRequiredBytes = update.updateFunctions.requiredBytes()
        val appliedFunctionsRequiredBytes = update.appliedFunctions.requiredBytes()

        val requiredBytes =
          Bytes.sizeOf(functionsMetaId) + //format id bytes
            Bytes.sizeOf(updateFunctionRequiredBytes) +
            updateFunctionRequiredBytes +
            Bytes.sizeOf(appliedFunctionsRequiredBytes) +
            appliedFunctionsRequiredBytes

        val bytes =
          Slice
            .create[Byte](Bytes.sizeOf(requiredBytes) + requiredBytes) //also add the size of the block
            .addIntUnsigned(requiredBytes)
            .addIntUnsigned(functionsMetaId)
            .addIntUnsigned(updateFunctionRequiredBytes)
            .addAll(update.updateFunctions.toBytes())
            .addIntUnsigned(appliedFunctionsRequiredBytes)
            .addAll(update.appliedFunctions.toBytes())

        Some(bytes)

      case fixed: KeyValue.WriteOnly.Fixed if fixed.appliedFunctions.nonEmpty =>
        val appliedFunctionsRequiredBytes = fixed.appliedFunctions.requiredBytes()

        val requiredBytes =
          Bytes.sizeOf(fixedMetaId) + //1 byte for the format
            Bytes.sizeOf(appliedFunctionsRequiredBytes) +
            appliedFunctionsRequiredBytes

        val bytes =
          Slice
            .create[Byte](Bytes.sizeOf(requiredBytes) + requiredBytes)
            .addIntUnsigned(requiredBytes)
            .addIntUnsigned(fixedMetaId)
            .addIntUnsigned(appliedFunctionsRequiredBytes)
            .addAll(fixed.appliedFunctions.toBytes())

        Some(bytes)

      case _: KeyValue.WriteOnly.Range | _: KeyValue.WriteOnly.Group | _: KeyValue.WriteOnly.Fixed =>
        None
    }
}
