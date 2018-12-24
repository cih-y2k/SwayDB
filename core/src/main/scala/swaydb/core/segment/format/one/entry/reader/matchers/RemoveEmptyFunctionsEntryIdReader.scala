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

import swaydb.core.data.Persistent
import swaydb.core.segment.format.one.entry.reader.DeadlineReaders._
import swaydb.core.segment.format.one.entry.reader.KeyReaders._
import swaydb.core.segment.format.one.entry.reader.matchers.RemoveReader._
import swaydb.core.segment.format.one.entry.reader.AppliedFunctionsReaders._
import swaydb.data.slice.Reader
import scala.util.Try
import swaydb.core.segment.format.one.entry.id.RemoveEntryId

object RemoveEmptyFunctionsEntryIdReader {

  def read(id: Int,
           indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent]): Try[Persistent] =
	//GENERATED CONDITIONS
		if (id >= RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.NoDeadline.id && id <= RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFourCompressed.id)
			if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyPartiallyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else if (id >= RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFiveCompressed.id && id <= RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed.id)
			if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyUncompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.EmptyFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
}
