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

import swaydb.core.data.{KeyValue, Transient, UpdateFunctions}
import swaydb.core.segment.format.one.entry.reader.MetaBlock
import swaydb.data.slice.Slice

object MetaWriter {

  /**
    * Writes meta block for a key-value.
    *
    * @return returns None if no meta block is required else returns
    *         the meta block for the key-value which currently stores functions information.
    *         NOTE: it also inserts the size of the block as the head bytes.
    */
  def write(current: KeyValue.WriteOnly): Option[Slice[Byte]] =
    current match {
      case update: Transient.Update =>
        MetaBlock.write(
          updateFunctions = update.updateFunctions,
          appliedFunctions = update.appliedFunctions
        )

      case fixed: KeyValue.WriteOnly.Fixed =>
        MetaBlock.write(
          updateFunctions = UpdateFunctions.empty,
          appliedFunctions = fixed.appliedFunctions
        )

      //other key-values do not have meta information yet. They can be added in the future but currently
      //this block for Range and Group is empty.
      case _: KeyValue.WriteOnly.Range | _: KeyValue.WriteOnly.Group =>
        None
    }
}
