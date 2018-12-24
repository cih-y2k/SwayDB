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

import scala.annotation.implicitNotFound
import scala.util.Try
import swaydb.core.data.KeyValue
import swaydb.core.segment.format.one.entry.id.EntryId
import swaydb.core.util.{Bytes, TryUtil}
import swaydb.data.slice.{Reader, Slice}

@implicitNotFound("Type class implementation not found for AppliedFunctionsReader of type ${T}")
sealed trait AppliedFunctionsReader[-T] {
  def read(indexReader: Reader,
           previous: Option[KeyValue.ReadOnly]): Try[Seq[Slice[Byte]]]
}

object AppliedFunctionsReaders {

  implicit object UnCompressedAppliedFunctionsReader extends AppliedFunctionsReader[EntryId.AppliedFunctions.Empty] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Seq[Slice[Byte]]] =
      TryUtil.successEmptySeqBytes
  }

  implicit object PartiallyCompressedAppliedFunctionsReader extends AppliedFunctionsReader[EntryId.AppliedFunctions.NonEmpty] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Seq[Slice[Byte]]] =
      indexReader.readIntUnsigned() flatMap {
        size =>
          indexReader.read(size) flatMap Bytes.readSeq
      }
  }
}
