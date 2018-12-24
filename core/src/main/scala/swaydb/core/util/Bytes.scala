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

package swaydb.core.util

import swaydb.core.data.KeyValue
import swaydb.core.io.reader.Reader
import swaydb.data.slice.{Reader, Slice}
import swaydb.data.util.{ByteSizeOf, ByteUtil}
import scala.util.{Success, Try}
import PipeOps._
import scala.collection.mutable.ListBuffer

private[swaydb] object Bytes {

  private def commonPrefix(previous: Slice[Byte],
                           next: Slice[Byte]): Int = {
    val min = Math.min(previous.size, next.size)
    var i = 0
    while (i < min && previous(i) == next(i))
      i += 1
    i
  }

  def compress(key: Slice[Byte],
               previous: KeyValue,
               minimumCommonBytes: Int): Option[(Int, Slice[Byte])] =
    compress(
      previous = previous.key,
      next = key,
      minimumCommonBytes = minimumCommonBytes
    )

  def compress(previous: Slice[Byte],
               next: Slice[Byte],
               minimumCommonBytes: Int): Option[(Int, Slice[Byte])] = {
    val commonBytes = Bytes.commonPrefix(previous, next)
    if (commonBytes < minimumCommonBytes)
      None
    else
      Some(commonBytes, next.drop(commonBytes))
  }

  def compressFull(previous: Option[Slice[Byte]],
                   next: Slice[Byte]): Option[Done] =
    previous flatMap {
      previous =>
        compressFull(
          previous = previous,
          next = next
        )
    }

  def compressFull(previous: Slice[Byte],
                   next: Slice[Byte]): Option[Done] =
    if (previous.size < next.size)
      None
    else
      compress(previous, next, next.size) map {
        _ =>
          Done
      }

  def decompress(previous: Slice[Byte],
                 next: Slice[Byte],
                 commonBytes: Int): Slice[Byte] = {
    val missingCommonBytes = previous.slice(0, commonBytes - 1)
    val fullKey = new Array[Byte](commonBytes + next.size)
    var i = 0
    while (i < commonBytes) {
      fullKey(i) = missingCommonBytes(i)
      i += 1
    }
    var x = 0
    while (x < next.size) {
      fullKey(i) = next(x)
      x += 1
      i += 1
    }
    Slice(fullKey)
  }

  def sizeOf(int: Int): Int = {
    var size = 0
    var x = int
    while ((x & 0xFFFFF80) != 0L) {
      size += 1
      x >>>= 7
    }
    size += 1
    size
  }

  def sizeOf(long: Long): Int = {
    var size = 0
    var x = long
    while ((x & 0xFFFFFFFFFFFFFF80L) != 0L) {
      size += 1
      x >>>= 7
    }
    size += 1
    size
  }

  def compressJoin(left: Slice[Byte],
                   right: Slice[Byte]): Slice[Byte] =
    compressJoin(left, right, Slice.emptyBytes)

  def compressJoin(left: Slice[Byte],
                   right: Slice[Byte],
                   tail: Byte): Slice[Byte] =
    compressJoin(left, right, Slice(tail))

  /**
    * Merges the input bytes into a single byte array extracting common bytes.
    *
    * If there are no common bytes the compress will result in 2 more additional bytes.
    *
    * tail bytes are also appended to the the result. When decompressing tail bytes should be stripped.
    */
  def compressJoin(left: Slice[Byte],
                   right: Slice[Byte],
                   tail: Slice[Byte]): Slice[Byte] = {
    val commonBytes = commonPrefix(left, right)
    val rightWithoutCommonBytes =
      if (commonBytes != 0)
        right.drop(commonBytes)
      else
        right

    //if right was fully compressed just store right bytes with commonBytes integer. During read commonBytes int will be checked
    //to see if its the same size as left and the same left bytes will be returned for right as well.
    if (rightWithoutCommonBytes.isEmpty) {
      val compressedSlice = Slice.create[Byte](left.size + sizeOf(commonBytes) + sizeOf(left.size) + tail.size)
      compressedSlice addAll left
      compressedSlice addIntUnsigned commonBytes
      compressedSlice addAll ByteUtil.writeUnsignedIntReversed(left.size) //store key1's byte size to the end to allow further merges with other keys.
      compressedSlice addAll tail
    } else {
      val compressedSlice = Slice.create[Byte](left.size + sizeOf(commonBytes) + sizeOf(rightWithoutCommonBytes.size) + rightWithoutCommonBytes.size + sizeOf(left.size) + tail.size)
      compressedSlice addAll left
      compressedSlice addIntUnsigned commonBytes
      compressedSlice addIntUnsigned rightWithoutCommonBytes.size
      compressedSlice addAll rightWithoutCommonBytes
      compressedSlice addAll ByteUtil.writeUnsignedIntReversed(left.size) //store key1's byte size to the end to allow further merges with other keys.
      compressedSlice addAll tail
    }

  }

  def decompressJoin(bytes: Slice[Byte]): Try[(Slice[Byte], Slice[Byte])] =
    Reader(bytes) ==> {
      reader =>
        for {
          (leftBytesSize, lastBytesRead) <- ByteUtil.readLastUnsignedInt(bytes)
          left <- reader.read(leftBytesSize)
          commonBytes <- reader.readIntUnsigned()
          hasMore <- reader.hasAtLeast(lastBytesRead + 1) //if there are more bytes to read.
          right <-
            if (!hasMore && commonBytes == leftBytesSize) //if right was fully compressed then right == left, return left.
              Success(left)
            else
              reader.readIntUnsigned() flatMap {
                rightSize =>
                  reader.read(rightSize) map {
                    right =>
                      decompress(left, right, commonBytes)
                  }
              }
        } yield {
          (left, right)
        }
    }

  def sizeOfSeq(bytes: Seq[Slice[Byte]]): Int =
    bytes.foldLeft(0) {
      case (size, bytes) =>
        size + bytes.size + sizeOf(bytes.size)
    }

  def writeSeq(bytes: Seq[Slice[Byte]]): Slice[Byte] =
    bytes
      .foldLeft(Slice.create[Byte](sizeOfSeq(bytes))) {
        case (result, bytes) =>
          result
            .addIntUnsigned(bytes.size)
            .addAll(bytes)
      }

  def readSeq(bytes: Slice[Byte]): Try[ListBuffer[Slice[Byte]]] =
    readSeq(Reader(bytes))

  def readSeq(reader: Reader): Try[ListBuffer[Slice[Byte]]] =
    reader.foldLeftTry(ListBuffer.empty[Slice[Byte]]) {
      case (result, reader) =>
        reader.readIntUnsigned() flatMap {
          size =>
            reader.read(size) map {
              bytes =>
                result += bytes
            }
        }
    }

}

object Test extends App {

  (15000 to 100000) foreach {
    i =>
      if (Bytes.sizeOf(i) > 2) {
        println(i)
        System.exit(0)
      }
  }
}
