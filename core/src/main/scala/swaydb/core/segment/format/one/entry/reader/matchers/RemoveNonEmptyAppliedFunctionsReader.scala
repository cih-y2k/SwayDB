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
import swaydb.data.slice.Reader
import scala.util.Try
import swaydb.core.segment.format.one.entry.id.RemoveNonEmptyAppliedFunctionsEntryId

object RemoveNonEmptyAppliedFunctionsReader {

  def read(id: Int,
           indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent]): Try[Persistent] =
	//GENERATED CONDITIONS
		if (id >= RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.NoDeadline.id && id <= RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineUncompressed.id)
			if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.NoDeadline.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyPartiallyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.NoDeadline.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineUncompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyUncompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else if (id >= RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.NoDeadline.id && id <= RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed.id)
			if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.NoDeadline.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveNonEmptyAppliedFunctionsEntryId.NonEmptyAppliedFunctions.KeyFullyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
}
