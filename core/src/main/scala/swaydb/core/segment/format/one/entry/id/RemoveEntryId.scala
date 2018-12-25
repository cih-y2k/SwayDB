
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
sealed abstract class RemoveEntryId(override val id: Int) extends EntryId(id)
object RemoveEntryId extends GeneratedEntryId {

  override val emptyMeta: EntryId.Meta.Empty = RemoveEntryId.EmptyMeta
  override val nonEmptyMeta: EntryId.Meta.NonEmpty = RemoveEntryId.NonEmptyMeta

  sealed trait EmptyMeta extends Meta.Empty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = EmptyMeta.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = EmptyMeta.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = EmptyMeta.KeyUncompressed
  }
  object EmptyMeta extends EmptyMeta {
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with EmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2642) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2643) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2644) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2645) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2646) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2647) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2648) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2649) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2650) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2651) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with EmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2652) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2653) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2654) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2655) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2656) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2657) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2658) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2659) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2660) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2661) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with EmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2662) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2663) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2664) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2665) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2666) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2667) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2668) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2669) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2670) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2671) with Deadline.Uncompressed with NoValue
      }
    }
  }

  sealed trait NonEmptyMeta extends Meta.NonEmpty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = NonEmptyMeta.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = NonEmptyMeta.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = NonEmptyMeta.KeyUncompressed
  }
  object NonEmptyMeta extends NonEmptyMeta {
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with NonEmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2672) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2673) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2674) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2675) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2676) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2677) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2678) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2679) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2680) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2681) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with NonEmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2682) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2683) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2684) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2685) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2686) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2687) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2688) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2689) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2690) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2691) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with NonEmptyMeta {
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
        case object NoDeadline extends RemoveEntryId(2692) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(2693) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(2694) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(2695) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(2696) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(2697) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(2698) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(2699) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(2700) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(2701) with Deadline.Uncompressed with NoValue
      }
    }
  }


  override def keyIdsList: List[RemoveEntryId] = SealedList.list[RemoveEntryId].sortBy(_.id)

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