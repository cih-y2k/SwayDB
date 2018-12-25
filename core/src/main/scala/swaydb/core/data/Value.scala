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

package swaydb.core.data

import scala.concurrent.duration.{Deadline, FiniteDuration}
import swaydb.data.slice.Slice

private[swaydb] sealed trait Value {

  //@formatter:off
  def isRemove: Boolean
  def notRemove: Boolean = !isRemove
  def deadline: Option[Deadline]
  def hasTimeLeft(): Boolean
  def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean
  def unslice: Value
  //@formatter:on

  def isOverdue(): Boolean =
    !hasTimeLeft()
}

private[swaydb] object Value {

  private[swaydb] sealed trait FromValue extends Value {
    def unslice: FromValue
  }
  private[swaydb] sealed trait RangeValue extends Value {
    def unslice: RangeValue
  }

  implicit class RangeValueImplicits(value: Value.RangeValue) {
    /**
      * @return An Value key-value with it's byte arrays sliced.
      *         If the sliced byte array is empty, it set the value to None.
      */

    def toMemory(key: Slice[Byte]): Memory.Fixed =
      value match {
        case Value.Remove(deadline) =>
          Memory.Remove(key, deadline)

        case Value.Update(value, deadline) =>
          Memory.Update(key, value, deadline)
      }
  }

  implicit class ValueImplicits(value: Value) {
    /**
      * @return An Value key-value with it's byte arrays sliced.
      *         If the sliced byte array is empty, it set the value to None.
      */
    def toMemory(key: Slice[Byte]): Memory.Fixed =
      value match {
        case Remove(deadline) =>
          Memory.Remove(key, deadline)
        case Put(value, deadline) =>
          Memory.Put(key, value, deadline)
        case Update(value, deadline) =>
          Memory.Update(key, value, deadline)
      }
  }

  object Remove {
    def apply(deadline: Deadline): Remove =
      new Remove(Some(deadline))

    def apply(deadline: Option[Deadline]): Remove =
      new Remove(deadline)
  }

  case class Remove(deadline: Option[Deadline]) extends FromValue with RangeValue {

    override val isRemove: Boolean = true

    override def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.exists(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Remove =
      this
  }

  object Put {
    def apply(value: Slice[Byte]): Put =
      new Put(Some(value), None)

    def apply(value: Slice[Byte], removeAfter: Deadline): Put =
      new Put(Some(value), Some(removeAfter))

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Put =
      new Put(value, removeAfter)

    def apply(value: Slice[Byte], duration: FiniteDuration): Put =
      new Put(Some(value), Some(duration.fromNow))

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Put =
      new Put(value, Some(duration.fromNow))

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Put =
      new Put(value, Some(removeAfter))
  }

  case class Put(value: Option[Slice[Byte]],
                 deadline: Option[Deadline]) extends FromValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Put =
      copy(value = value.unslice())
  }

  object Update {
    def apply(value: Slice[Byte]): Update =
      new Update(
        value = Some(value),
        deadline = None
      )

    def apply(value: Slice[Byte], deadline: Option[Deadline]): Update =
      new Update(
        value = Some(value),
        deadline = deadline
      )

    def apply(value: Slice[Byte], removeAfter: Deadline): Update =
      new Update(
        value = Some(value),
        deadline = Some(removeAfter)
      )

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Update =
      new Update(
        value = value,
        deadline = removeAfter
      )

    def apply(value: Slice[Byte], duration: FiniteDuration): Update =
      new Update(
        value = Some(value),
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Update =
      new Update(
        value = value,
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Update =
      new Update(
        value = value,
        deadline = Some(removeAfter)
      )
  }

  case class Update(value: Option[Slice[Byte]],
                    deadline: Option[Deadline]) extends FromValue with RangeValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Update =
      copy(value = value.unslice())

  }
}
