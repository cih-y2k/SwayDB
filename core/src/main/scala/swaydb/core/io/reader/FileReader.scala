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

package swaydb.core.io.reader

import com.typesafe.scalalogging.LazyLogging
import swaydb.core.io.file.DBFile
import swaydb.data.slice.{Reader, Slice}

import scala.util.Try

private[core] class FileReader(file: DBFile) extends Reader with LazyLogging {

  private var position: Int = 0

  def isLoaded: Try[Boolean] =
    file.isLoaded

  override def size: Try[Long] =
    file.fileSize

  def moveTo(newPosition: Long): Reader = {
    position = newPosition.toInt
    this
  }

  def hasMore: Try[Boolean] =
    file.fileSize.map(position <= _)

  def hasAtLeast(size: Long): Try[Boolean] =
    file.fileSize map {
      fileSize =>
        (fileSize - position) >= size
    }

  override def copy(): Reader =
    new FileReader(file)

  override def getPosition: Int = position

  override def get() =
    (file get position) map {
      byte =>
        position += 1
        byte
    }

  override def read(size: Int) =
    file.read(position, size) map {
      bytes =>
        position += size
        bytes
    }

  override def readRemaining(): Try[Slice[Byte]] =
    remaining flatMap read
}