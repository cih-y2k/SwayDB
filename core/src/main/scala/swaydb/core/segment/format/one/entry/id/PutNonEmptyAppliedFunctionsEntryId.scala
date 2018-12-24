
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
sealed abstract class PutNonEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object PutNonEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

  sealed trait NonEmptyAppliedFunctions extends AppliedFunctions.NonEmpty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = NonEmptyAppliedFunctions.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = NonEmptyAppliedFunctions.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = NonEmptyAppliedFunctions.KeyUncompressed
  }

  object NonEmptyAppliedFunctions extends NonEmptyAppliedFunctions {
    
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with NonEmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyPartiallyCompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyPartiallyCompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyPartiallyCompressed.ValueUncompressed
    }
    object KeyPartiallyCompressed extends KeyPartiallyCompressed {
      sealed trait ValueUncompressed extends Value.Uncompressed with KeyPartiallyCompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(661) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(662) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(663) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(664) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(665) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(666) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(667) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(668) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(669) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(670) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(671) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(672) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(673) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(674) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(675) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(676) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(677) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(678) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(679) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(680) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(681) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(682) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(683) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(684) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(685) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(686) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(687) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(688) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(689) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(690) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(691) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(692) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(693) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(694) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(695) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(696) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(697) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(698) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(699) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(700) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(701) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(702) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(703) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(704) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(705) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(706) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(707) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(708) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(709) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(710) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(711) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(712) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(713) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(714) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(715) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(716) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(717) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(718) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(719) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(720) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(721) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(722) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(723) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(724) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(725) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(726) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(727) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(728) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(729) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(730) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(731) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(732) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(733) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(734) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(735) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(736) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(737) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(738) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(739) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(740) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(741) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(742) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(743) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(744) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(745) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(746) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(747) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(748) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(749) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(750) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(751) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(752) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(753) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(754) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(755) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(756) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(757) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(758) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(759) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(760) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(761) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(762) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(763) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(764) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(765) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(766) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(767) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(768) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(769) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(770) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(771) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(772) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(773) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(774) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(775) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(776) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(777) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(778) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(779) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(780) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(781) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(782) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(783) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(784) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(785) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(786) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(787) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(788) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(789) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(790) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(791) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(792) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(793) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(794) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(795) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(796) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(797) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(798) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(799) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(800) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(801) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(802) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(803) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(804) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(805) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(806) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(807) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(808) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(809) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(810) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(811) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(812) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(813) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(814) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(815) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(816) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(817) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(818) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(819) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(820) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(821) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(822) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(823) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(824) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(825) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(826) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(827) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(828) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(829) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(830) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(831) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(832) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(833) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(834) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(835) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(836) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(837) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(838) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(839) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(840) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(841) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(842) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(843) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(844) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(845) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(846) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(847) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(848) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(849) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(850) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(851) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(852) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(853) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(854) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(855) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(856) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(857) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(858) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(859) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(860) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(861) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(862) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(863) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(864) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(865) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(866) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(867) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(868) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(869) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(870) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyPartiallyCompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(871) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(872) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(873) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(874) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(875) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(876) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(877) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(878) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(879) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(880) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with NonEmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyUncompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyUncompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyUncompressed.ValueUncompressed
    }
    object KeyUncompressed extends KeyUncompressed {

      sealed trait ValueUncompressed extends Value.Uncompressed with KeyUncompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(881) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(882) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(883) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(884) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(885) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(886) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(887) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(888) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(889) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(890) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(891) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(892) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(893) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(894) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(895) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(896) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(897) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(898) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(899) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(900) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(901) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(902) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(903) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(904) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(905) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(906) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(907) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(908) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(909) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(910) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(911) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(912) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(913) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(914) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(915) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(916) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(917) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(918) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(919) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(920) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(921) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(922) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(923) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(924) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(925) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(926) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(927) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(928) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(929) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(930) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(931) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(932) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(933) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(934) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(935) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(936) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(937) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(938) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(939) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(940) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(941) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(942) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(943) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(944) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(945) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(946) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(947) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(948) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(949) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(950) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(951) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(952) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(953) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(954) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(955) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(956) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(957) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(958) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(959) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(960) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(961) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(962) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(963) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(964) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(965) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(966) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(967) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(968) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(969) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(970) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(971) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(972) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(973) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(974) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(975) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(976) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(977) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(978) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(979) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(980) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(981) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(982) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(983) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(984) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(985) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(986) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(987) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(988) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(989) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(990) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(991) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(992) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(993) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(994) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(995) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(996) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(997) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(998) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(999) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1000) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1001) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1002) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1003) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1004) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1005) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1006) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1007) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1008) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1009) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1010) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1011) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1012) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1013) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1014) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1015) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1016) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1017) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1018) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1019) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1020) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1021) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1022) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1023) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1024) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1025) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1026) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1027) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1028) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1029) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1030) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1031) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1032) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1033) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1034) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1035) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1036) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1037) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1038) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1039) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1040) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1041) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1042) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1043) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1044) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1045) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1046) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1047) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1048) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1049) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1050) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1051) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1052) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1053) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1054) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1055) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1056) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1057) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1058) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1059) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1060) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1061) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1062) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1063) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1064) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1065) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1066) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1067) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1068) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1069) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1070) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1071) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1072) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1073) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1074) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1075) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1076) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1077) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1078) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1079) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1080) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1081) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1082) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1083) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1084) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1085) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1086) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1087) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1088) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1089) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1090) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyUncompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1091) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1092) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1093) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1094) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1095) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1096) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1097) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1098) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1099) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1100) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with NonEmptyAppliedFunctions {
      override val noValue: Value.NoValue = KeyFullyCompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyFullyCompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyFullyCompressed.ValueUncompressed
    }
    object KeyFullyCompressed extends KeyFullyCompressed {
      sealed trait ValueUncompressed extends Value.Uncompressed with KeyFullyCompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1101) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1102) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1103) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1104) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1105) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1106) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1107) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1108) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1109) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1110) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1111) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1112) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1113) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1114) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1115) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1116) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1117) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1118) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1119) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1120) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1121) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1122) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1123) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1124) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1125) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1126) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1127) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1128) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1129) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1130) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1131) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1132) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1133) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1134) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1135) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1136) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1137) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1138) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1139) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1140) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1141) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1142) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1143) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1144) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1145) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1146) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1147) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1148) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1149) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1150) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1151) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1152) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1153) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1154) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1155) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1156) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1157) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1158) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1159) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1160) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1161) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1162) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1163) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1164) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1165) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1166) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1167) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1168) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1169) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1170) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1171) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1172) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1173) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1174) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1175) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1176) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1177) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1178) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1179) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1180) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1181) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1182) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1183) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1184) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1185) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1186) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1187) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1188) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1189) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1190) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1191) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1192) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1193) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1194) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1195) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1196) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1197) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1198) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1199) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1200) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1201) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1202) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1203) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1204) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1205) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1206) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1207) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1208) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1209) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1210) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1211) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1212) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1213) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1214) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1215) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1216) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1217) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1218) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1219) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1220) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1221) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1222) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1223) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1224) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1225) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1226) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1227) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1228) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1229) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1230) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1231) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1232) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1233) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1234) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1235) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1236) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1237) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1238) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1239) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1240) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1241) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1242) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1243) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1244) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1245) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1246) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1247) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1248) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1249) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1250) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1251) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1252) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1253) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1254) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1255) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1256) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1257) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1258) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1259) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1260) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1261) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1262) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1263) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1264) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1265) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1266) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1267) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1268) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1269) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1270) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1271) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1272) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1273) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1274) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1275) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1276) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1277) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1278) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1279) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1280) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1281) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1282) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1283) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1284) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1285) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1286) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1287) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1288) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1289) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1290) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1291) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1292) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1293) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1294) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1295) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1296) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1297) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1298) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1299) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1300) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1301) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1302) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1303) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1304) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1305) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1306) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1307) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1308) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1309) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1310) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyFullyCompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends PutNonEmptyAppliedFunctionsEntryId(1311) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends PutNonEmptyAppliedFunctionsEntryId(1312) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends PutNonEmptyAppliedFunctionsEntryId(1313) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends PutNonEmptyAppliedFunctionsEntryId(1314) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends PutNonEmptyAppliedFunctionsEntryId(1315) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends PutNonEmptyAppliedFunctionsEntryId(1316) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends PutNonEmptyAppliedFunctionsEntryId(1317) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends PutNonEmptyAppliedFunctionsEntryId(1318) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends PutNonEmptyAppliedFunctionsEntryId(1319) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends PutNonEmptyAppliedFunctionsEntryId(1320) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[PutNonEmptyAppliedFunctionsEntryId] = SealedList.list[PutNonEmptyAppliedFunctionsEntryId].sortBy(_.id)

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