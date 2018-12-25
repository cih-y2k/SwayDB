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
import swaydb.core.segment.format.one.entry.id.RemoveEntryId
import swaydb.core.segment.format.one.entry.reader.MetaReader._
import swaydb.core.segment.format.one.entry.reader.DeadlineReaders._
import swaydb.core.segment.format.one.entry.reader.KeyReaders._
import swaydb.core.segment.format.one.entry.reader.matchers.RemoveReader._
import swaydb.data.slice.Reader

object RemoveNonEmptyMetaEntryIdReader {

  def read(id: Int,
           indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent]): Try[Persistent] =
	//GENERATED CONDITIONS
		if (id >= RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.NoDeadline.id && id <= RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFourCompressed.id)
			if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyPartiallyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else if (id >= RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFiveCompressed.id && id <= RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineUncompressed.id)
			if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyUncompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.NoDeadline.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.NoDeadline, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineOneCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineOneCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineTwoCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineTwoCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineThreeCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineThreeCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFourCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFourCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFiveCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFiveCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineSixCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineSixCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineSevenCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineSevenCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFullyCompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineFullyCompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else if (id == RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineUncompressed.id) reader(RemoveEntryId.NonEmptyMeta.KeyFullyCompressed.NoValue.DeadlineUncompressed, indexReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
			else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
		else scala.util.Failure(new Exception(this.getClass.getSimpleName + " - Reader not implemented for id: " + id))
}
