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
import swaydb.core.util.Bytes
import swaydb.data.slice.Slice

object AppliedFunctionsWriter {

  def write(current: KeyValue.WriteOnly): Option[Slice[Byte]] =
    current match {
      case fixed: KeyValue.WriteOnly.Fixed if fixed.appliedFunctions.nonEmpty =>
        val bytes = Bytes.writeSeq(fixed.appliedFunctions)
        val slice = Slice.create[Byte](Bytes.sizeOf(bytes.size) + bytes.size)
        slice
          .addIntUnsigned(bytes.size)
          .addAll(bytes)

        Some(bytes)

      case _: KeyValue.WriteOnly.Range | _: KeyValue.WriteOnly.Group | _: KeyValue.WriteOnly.Fixed =>
        None
    }
}
