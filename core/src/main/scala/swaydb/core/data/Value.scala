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
  def appliedFunctions: AppliedFunctions
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
        case Value.Remove(deadline, appliedFunctions) =>
          Memory.Remove(key, deadline, appliedFunctions)

        case Value.Update(value, deadline, updateFunctions, appliedFunctions) =>
          Memory.Update(key, value, deadline, updateFunctions, appliedFunctions)
      }
  }

  implicit class ValueImplicits(value: Value) {
    /**
      * @return An Value key-value with it's byte arrays sliced.
      *         If the sliced byte array is empty, it set the value to None.
      */
    def toMemory(key: Slice[Byte]): Memory.Fixed =
      value match {
        case Remove(deadline, appliedFunctions) =>
          Memory.Remove(key, deadline, appliedFunctions)
        case Put(value, deadline, appliedFunctions) =>
          Memory.Put(key, value, deadline, appliedFunctions)
        case Update(value, deadline, updateFunctions, appliedFunctions) =>
          Memory.Update(key, value, deadline, updateFunctions, appliedFunctions)
      }
  }

  object Remove {
    def apply(deadline: Deadline): Remove =
      new Remove(Some(deadline), AppliedFunctions.empty)

    def apply(deadline: Option[Deadline]): Remove =
      new Remove(deadline, AppliedFunctions.empty)
  }

  case class Remove(deadline: Option[Deadline],
                    appliedFunctions: AppliedFunctions) extends FromValue with RangeValue {

    override val isRemove: Boolean = true

    override def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.exists(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Remove =
      Value.Remove(deadline, appliedFunctions.unslice())
  }

  object Put {
    def apply(value: Slice[Byte]): Put =
      new Put(Some(value), None, AppliedFunctions.empty)

    def apply(value: Slice[Byte], removeAfter: Deadline): Put =
      new Put(Some(value), Some(removeAfter), AppliedFunctions.empty)

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Put =
      new Put(value, removeAfter, AppliedFunctions.empty)

    def apply(value: Slice[Byte], duration: FiniteDuration): Put =
      new Put(Some(value), Some(duration.fromNow), AppliedFunctions.empty)

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Put =
      new Put(value, Some(duration.fromNow), AppliedFunctions.empty)

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Put =
      new Put(value, Some(removeAfter), AppliedFunctions.empty)
  }

  case class Put(value: Option[Slice[Byte]],
                 deadline: Option[Deadline],
                 appliedFunctions: AppliedFunctions) extends FromValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Put =
      Value.Put(value.unslice(), deadline, appliedFunctions.unslice())
  }

  object Update {
    def apply(value: Slice[Byte]): Update =
      new Update(
        value = Some(value),
        deadline = None,
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Slice[Byte], deadline: Option[Deadline]): Update =
      new Update(
        value = Some(value),
        deadline = deadline,
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Slice[Byte], removeAfter: Deadline): Update =
      new Update(
        value = Some(value),
        deadline = Some(removeAfter),
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Update =
      new Update(
        value = value,
        deadline = removeAfter,
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Slice[Byte], duration: FiniteDuration): Update =
      new Update(
        value = Some(value),
        deadline = Some(duration.fromNow),
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Update =
      new Update(
        value = value,
        deadline = Some(duration.fromNow),
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Update =
      new Update(
        value = value,
        deadline = Some(removeAfter),
        updateFunctions = UpdateFunctions.empty,
        appliedFunctions = AppliedFunctions.empty
      )
  }

  case class Update(value: Option[Slice[Byte]],
                    deadline: Option[Deadline],
                    updateFunctions: UpdateFunctions,
                    appliedFunctions: AppliedFunctions) extends FromValue with RangeValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Update =
      Value.Update(
        value = value.unslice(),
        deadline = deadline,
        updateFunctions = updateFunctions.unslice(),
        appliedFunctions = appliedFunctions.unslice()
      )

  }
}
