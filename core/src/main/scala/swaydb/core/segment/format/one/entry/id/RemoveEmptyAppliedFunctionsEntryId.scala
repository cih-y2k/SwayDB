
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

package swaydb.core.segment.format.one.entry.id

/** ******************************************
  * ************ GENERATED CLASS *************
  * ******************************************/

import swaydb.core.segment.format.one.entry.id.EntryId._
import swaydb.core.util.PipeOps._
import swaydb.macros.SealedList

/**
  * This code is not used in actual production.
  *
  * It is a base template class for generating IDs for all other key-value type using
  * [[swaydb.core.segment.format.one.entry.generators.IdsGenerator]] which gives all key-values types unique ids.
  *
  * will remove that line for the target generated class.
  */
sealed abstract class RemoveEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object RemoveEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

  sealed trait EmptyAppliedFunctions extends AppliedFunctions.Empty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = EmptyAppliedFunctions.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = EmptyAppliedFunctions.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = EmptyAppliedFunctions.KeyUncompressed
  }

  object EmptyAppliedFunctions extends EmptyAppliedFunctions {
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with EmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyPartiallyCompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyPartiallyCompressed extends KeyPartiallyCompressed {
      sealed trait NoValue extends Value.NoValue with KeyPartiallyCompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEmptyAppliedFunctionsEntryId(2644) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEmptyAppliedFunctionsEntryId(2645) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEmptyAppliedFunctionsEntryId(2646) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEmptyAppliedFunctionsEntryId(2647) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEmptyAppliedFunctionsEntryId(2648) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEmptyAppliedFunctionsEntryId(2649) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEmptyAppliedFunctionsEntryId(2650) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEmptyAppliedFunctionsEntryId(2651) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEmptyAppliedFunctionsEntryId(2652) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEmptyAppliedFunctionsEntryId(2653) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with EmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyUncompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyUncompressed extends KeyUncompressed {
      sealed trait NoValue extends Value.NoValue with KeyUncompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEmptyAppliedFunctionsEntryId(2654) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEmptyAppliedFunctionsEntryId(2655) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEmptyAppliedFunctionsEntryId(2656) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEmptyAppliedFunctionsEntryId(2657) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEmptyAppliedFunctionsEntryId(2658) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEmptyAppliedFunctionsEntryId(2659) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEmptyAppliedFunctionsEntryId(2660) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEmptyAppliedFunctionsEntryId(2661) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEmptyAppliedFunctionsEntryId(2662) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEmptyAppliedFunctionsEntryId(2663) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with EmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyFullyCompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyFullyCompressed extends KeyFullyCompressed {
      sealed trait NoValue extends Value.NoValue with KeyFullyCompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEmptyAppliedFunctionsEntryId(2664) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEmptyAppliedFunctionsEntryId(2665) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEmptyAppliedFunctionsEntryId(2666) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEmptyAppliedFunctionsEntryId(2667) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEmptyAppliedFunctionsEntryId(2668) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEmptyAppliedFunctionsEntryId(2669) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEmptyAppliedFunctionsEntryId(2670) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEmptyAppliedFunctionsEntryId(2671) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEmptyAppliedFunctionsEntryId(2672) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEmptyAppliedFunctionsEntryId(2673) with Deadline.Uncompressed with NoValue
      }
    }
  }

  override def keyIdsList: List[RemoveEmptyAppliedFunctionsEntryId] = SealedList.list[RemoveEmptyAppliedFunctionsEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Option[Int] =
    if (id >= headId && id <= lastId)
      Some(id)
    else
      None
}