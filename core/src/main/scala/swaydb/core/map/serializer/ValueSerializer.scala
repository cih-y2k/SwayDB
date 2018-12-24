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

package swaydb.core.map.serializer

import swaydb.core.data.Value
import swaydb.core.io.reader.Reader
import swaydb.core.util.{Bytes, TryUtil}
import swaydb.core.util.TimeUtil._
import swaydb.data.slice.{Reader, Slice}
import swaydb.data.util.ByteSizeOf
import scala.annotation.implicitNotFound
import scala.concurrent.duration.Deadline
import scala.util.Try

@implicitNotFound("Type class implementation not found for ValueSerializer of type ${T}")
trait ValueSerializer[T] {

  def write(value: T, bytes: Slice[Byte]): Unit

  def read(reader: Reader): Try[T]

  def read(bytes: Slice[Byte]): Try[T] =
    read(Reader(bytes))

  def bytesRequired(value: T): Int
}

object ValueSerializers {

  object LevelZero {

    def readDeadlineLevelZero(reader: Reader): Try[Option[Deadline]] =
      reader.readLong() map {
        deadline =>
          if (deadline == 0)
            None
          else
            deadline.toDeadlineOption
      }

    def readAppliedFunctionsLevelZero(reader: Reader): Try[Seq[Slice[Byte]]] =
      reader.readInt() flatMap {
        appliedFunction =>
          if (appliedFunction == 0)
            TryUtil.successEmptySeqBytes
          else
            reader.read(appliedFunction).flatMap(Bytes.readSeq)
      }

    implicit object RemoveSerializerLevelZero extends ValueSerializer[Value.Remove] {

      override def write(value: Value.Remove, bytes: Slice[Byte]): Unit =
        bytes
          .addLong(value.deadline.toNanos)
          .addInt(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Remove): Int =
        ByteSizeOf.long +
          ByteSizeOf.int +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Remove] =
        readDeadlineLevelZero(reader) flatMap {
          deadline =>
            readAppliedFunctionsLevelZero(reader) map {
              appliedFunctions =>
                Value.Remove(deadline, appliedFunctions)
            }
        }
    }

    implicit object PutSerializerLevelZero extends ValueSerializer[Value.Put] {

      override def write(value: Value.Put, bytes: Slice[Byte]): Unit =
        bytes
          .addInt(value.value.map(_.size).getOrElse(0))
          .addAll(value.value.getOrElse(Slice.emptyBytes))
          .addLong(value.deadline.toNanos)
          .addInt(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Put): Int =
        ByteSizeOf.int +
          value.value.map(_.size).getOrElse(0) +
          ByteSizeOf.long +
          ByteSizeOf.int +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Put] =
        reader.readInt() flatMap {
          valueLength =>
            if (valueLength == 0)
              readDeadlineLevelZero(reader) flatMap {
                deadline =>
                  readAppliedFunctionsLevelZero(reader) map {
                    appliedFunctions =>
                      Value.Put(None, deadline, appliedFunctions)
                  }
              }
            else
              reader.read(valueLength) flatMap {
                value =>
                  readDeadlineLevelZero(reader) flatMap {
                    deadline =>
                      readAppliedFunctionsLevelZero(reader) map {
                        appliedFunctions =>
                          Value.Put(Some(value), deadline, appliedFunctions)
                      }
                  }
              }
        }
    }

    implicit object UpdateSerializerLevelZero extends ValueSerializer[Value.Update] {

      override def write(value: Value.Update, bytes: Slice[Byte]): Unit =
        bytes
          .addInt(value.value.map(_.size).getOrElse(0))
          .addAll(value.value.getOrElse(Slice.emptyBytes))
          .addLong(value.deadline.toNanos)
          .addInt(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Update): Int =
        ByteSizeOf.int +
          value.value.map(_.size).getOrElse(0) +
          ByteSizeOf.long +
          ByteSizeOf.int +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Update] =
        reader.readInt() flatMap {
          valueLength =>
            if (valueLength == 0)
              readDeadlineLevelZero(reader) flatMap {
                deadline =>
                  readAppliedFunctionsLevelZero(reader) map {
                    appliedFunctions =>
                      Value.Update(None, deadline, ???, appliedFunctions)
                  }
              }
            else
              reader.read(valueLength) flatMap {
                value =>
                  readDeadlineLevelZero(reader) flatMap {
                    deadline =>
                      readAppliedFunctionsLevelZero(reader) map {
                        appliedFunctions =>
                          Value.Update(Some(value), deadline, ???, appliedFunctions)
                      }
                  }
              }
        }
    }
  }

  object Levels {

    def readDeadlineLevels(reader: Reader): Try[Option[Deadline]] =
      reader.readLongUnsigned() map {
        deadline =>
          if (deadline == 0)
            None
          else
            deadline.toDeadlineOption
      }

    def readAppliedFunctionsLevels(reader: Reader): Try[Seq[Slice[Byte]]] =
      reader.readIntUnsigned() flatMap {
        appliedFunction =>
          if (appliedFunction == 0)
            TryUtil.successEmptySeqBytes
          else
            reader.read(appliedFunction).flatMap(Bytes.readSeq)
      }

    implicit object PutSerializerLevels extends ValueSerializer[Value.Put] {

      override def write(value: Value.Put, bytes: Slice[Byte]): Unit =
        bytes
          .addIntUnsigned(value.value.map(_.size).getOrElse(0))
          .addAll(value.value.getOrElse(Slice.emptyBytes))
          .addLongUnsigned(value.deadline.toNanos)
          .addIntUnsigned(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Put): Int =
        Bytes.sizeOf(value.value.map(_.size).getOrElse(0)) +
          value.value.map(_.size).getOrElse(0) +
          Bytes.sizeOf(value.deadline.toNanos) +
          Bytes.sizeOf(Bytes.sizeOfSeq(value.appliedFunctions)) +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Put] =
        reader.readIntUnsigned() flatMap {
          valueLength =>
            if (valueLength == 0)
              readDeadlineLevels(reader) flatMap {
                deadline =>
                  readAppliedFunctionsLevels(reader) map {
                    appliedFunctions =>
                      Value.Put(None, deadline, appliedFunctions)
                  }
              }
            else
              reader.read(valueLength) flatMap {
                value =>
                  readDeadlineLevels(reader) flatMap {
                    deadline =>
                      readAppliedFunctionsLevels(reader) map {
                        appliedFunctions =>
                          Value.Put(Some(value), deadline, appliedFunctions)
                      }
                  }
              }
        }
    }

    implicit object RemoveSerializerLevels extends ValueSerializer[Value.Remove] {

      override def write(value: Value.Remove, bytes: Slice[Byte]): Unit =
        bytes
          .addLongUnsigned(value.deadline.toNanos)
          .addIntUnsigned(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Remove): Int =
        Bytes.sizeOf(value.deadline.toNanos) +
          Bytes.sizeOf(Bytes.sizeOfSeq(value.appliedFunctions)) +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Remove] =
        readDeadlineLevels(reader) map {
          deadline =>
            Value.Remove(deadline)
        }
    }

    implicit object UpdateSerializerLevels extends ValueSerializer[Value.Update] {

      override def write(value: Value.Update, bytes: Slice[Byte]): Unit =
        bytes
          .addIntUnsigned(value.value.map(_.size).getOrElse(0))
          .addAll(value.value.getOrElse(Slice.emptyBytes))
          .addLongUnsigned(value.deadline.toNanos)
          .addIntUnsigned(Bytes.sizeOfSeq(value.appliedFunctions))
          .addAll(Bytes.writeSeq(value.appliedFunctions))

      override def bytesRequired(value: Value.Update): Int =
        Bytes.sizeOf(value.value.map(_.size).getOrElse(0)) +
          value.value.map(_.size).getOrElse(0) +
          Bytes.sizeOf(value.deadline.toNanos) +
          Bytes.sizeOf(Bytes.sizeOfSeq(value.appliedFunctions)) +
          Bytes.sizeOfSeq(value.appliedFunctions)

      override def read(reader: Reader): Try[Value.Update] =
        reader.readIntUnsigned() flatMap {
          valueLength =>
            if (valueLength == 0)
              readDeadlineLevels(reader) flatMap {
                deadline =>
                  readAppliedFunctionsLevels(reader) map {
                    appliedFunctions =>
                      Value.Update(None, deadline, ???, appliedFunctions)
                  }
              }
            else
              reader.read(valueLength) flatMap {
                value =>
                  readDeadlineLevels(reader) flatMap {
                    deadline =>
                      readAppliedFunctionsLevels(reader) map {
                        appliedFunctions =>
                          Value.Update(Some(value), deadline, ???, appliedFunctions)
                      }
                  }
              }
        }
    }
  }
}

object ValueSerializer {

  def write[T](value: T)(bytes: Slice[Byte])(implicit serializer: ValueSerializer[T]): Unit =
    serializer.write(value, bytes)

  def read[T](value: Slice[Byte])(implicit serializer: ValueSerializer[T]): Try[T] =
    serializer.read(value)

  def read[T](reader: Reader)(implicit serializer: ValueSerializer[T]): Try[T] =
    serializer.read(reader)

  def bytesRequired[T](value: T)(implicit serializer: ValueSerializer[T]): Int =
    serializer.bytesRequired(value)
}
