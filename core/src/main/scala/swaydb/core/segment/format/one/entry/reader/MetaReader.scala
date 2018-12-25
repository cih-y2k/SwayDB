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
import scala.util.{Failure, Try}
import swaydb.core.data.{AppliedFunctions, KeyValue, UpdateFunctions}
import swaydb.core.io.reader.Reader
import swaydb.core.segment.format.one.entry.id.EntryId
import swaydb.core.segment.format.one.entry.writer.MetaWriter
import swaydb.core.util.TryUtil
import swaydb.data.slice.Reader

@implicitNotFound("Type class implementation not found for MetaReader of type ${T}")
sealed trait MetaReader[-T] {
  def read(indexReader: Reader,
           previous: Option[KeyValue.ReadOnly]): Try[Option[MetaBytes]]
}

object MetaReader {

  def readUpdateFunctions(reader: Reader): Try[UpdateFunctions] =
    reader.readIntUnsigned() flatMap {
      size =>
        reader.read(size) flatMap {
          updateFunctions =>
            UpdateFunctions.read(updateFunctions)
        }
    }

  def readAppliedFunctions(reader: Reader): Try[AppliedFunctions] =
    reader.readIntUnsigned() flatMap {
      size =>
        reader.read(size) flatMap {
          updateFunctions =>
            AppliedFunctions.read(updateFunctions)
        }
    }

  def readMetaBlock(formatId: Int, metaBlockReader: Reader) =
    if (formatId == MetaWriter.functionsMetaId)
      readUpdateFunctions(metaBlockReader) flatMap {
        updatedFunctions =>
          readAppliedFunctions(metaBlockReader) map {
            appliedFunctions =>
              Some(
                MetaBytes(
                  updateFunctions = updatedFunctions,
                  appliedFunctions = appliedFunctions
                )
              )
          }
      }
    else if (formatId == MetaWriter.functionsMetaId)
      readAppliedFunctions(metaBlockReader) map {
        appliedFunctions =>
          Some(
            MetaBytes(
              updateFunctions = UpdateFunctions.empty,
              appliedFunctions = appliedFunctions
            )
          )
      }
    else
      Failure(new Exception("Meta.NonEmpty on an empty meta block."))

  implicit object EmptyMetaReader extends MetaReader[EntryId.Meta.Empty] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[MetaBytes]] =
      TryUtil.successNone
  }

  implicit object NonEmptyMetaReader extends MetaReader[EntryId.Meta.NonEmpty] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[MetaBytes]] =
      indexReader.readIntUnsigned() flatMap {
        blockSize =>
          indexReader.read(blockSize) flatMap {
            metaBlock =>
              metaBlock.readIntUnsigned() flatMap {
                formatId =>
                  readMetaBlock(
                    formatId = formatId,
                    metaBlockReader = Reader(metaBlock)
                  )
              }
          }
      }
  }
}
