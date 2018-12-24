
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
sealed abstract class UpdateNonEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object UpdateNonEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4689) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4690) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4691) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4692) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4693) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4694) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4695) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4696) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4697) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4698) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4699) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4700) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4701) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4702) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4703) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4704) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4705) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4706) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4707) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4708) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4709) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4710) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4711) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4712) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4713) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4714) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4715) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4716) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4717) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4718) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4719) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4720) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4721) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4722) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4723) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4724) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4725) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4726) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4727) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4728) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4729) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4730) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4731) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4732) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4733) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4734) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4735) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4736) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4737) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4738) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4739) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4740) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4741) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4742) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4743) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4744) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4745) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4746) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4747) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4748) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4749) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4750) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4751) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4752) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4753) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4754) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4755) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4756) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4757) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4758) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4759) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4760) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4761) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4762) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4763) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4764) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4765) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4766) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4767) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4768) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4769) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4770) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4771) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4772) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4773) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4774) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4775) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4776) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4777) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4778) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4779) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4780) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4781) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4782) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4783) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4784) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4785) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4786) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4787) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4788) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4789) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4790) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4791) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4792) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4793) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4794) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4795) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4796) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4797) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4798) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4799) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4800) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4801) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4802) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4803) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4804) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4805) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4806) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4807) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4808) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4809) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4810) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4811) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4812) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4813) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4814) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4815) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4816) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4817) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4818) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4819) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4820) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4821) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4822) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4823) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4824) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4825) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4826) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4827) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4828) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4829) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4830) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4831) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4832) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4833) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4834) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4835) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4836) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4837) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4838) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4839) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4840) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4841) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4842) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4843) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4844) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4845) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4846) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4847) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4848) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4849) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4850) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4851) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4852) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4853) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4854) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4855) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4856) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4857) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4858) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4859) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4860) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4861) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4862) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4863) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4864) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4865) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4866) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4867) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4868) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4869) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4870) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4871) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4872) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4873) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4874) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4875) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4876) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4877) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4878) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4879) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4880) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4881) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4882) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4883) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4884) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4885) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4886) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4887) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4888) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4889) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4890) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4891) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4892) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4893) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4894) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4895) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4896) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4897) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4898) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4899) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4900) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4901) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4902) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4903) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4904) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4905) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4906) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4907) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4908) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4909) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4910) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4911) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4912) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4913) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4914) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4915) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4916) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4917) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4918) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4919) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4920) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4921) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4922) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4923) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4924) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4925) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4926) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4927) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4928) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4929) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4930) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4931) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4932) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4933) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4934) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4935) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4936) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4937) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4938) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4939) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4940) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4941) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4942) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4943) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4944) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4945) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4946) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4947) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4948) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4949) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4950) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4951) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4952) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4953) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4954) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4955) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4956) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4957) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4958) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4959) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4960) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4961) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4962) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4963) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4964) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4965) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4966) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4967) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4968) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4969) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4970) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4971) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4972) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4973) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4974) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4975) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4976) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4977) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4978) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4979) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4980) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4981) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4982) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4983) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4984) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4985) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4986) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4987) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4988) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4989) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4990) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4991) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4992) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4993) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4994) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4995) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4996) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4997) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(4998) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(4999) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5000) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5001) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5002) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5003) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5004) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5005) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5006) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5007) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5008) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5009) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5010) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5011) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5012) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5013) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5014) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5015) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5016) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5017) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5018) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5019) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5020) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5021) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5022) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5023) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5024) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5025) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5026) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5027) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5028) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5029) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5030) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5031) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5032) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5033) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5034) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5035) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5036) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5037) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5038) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5039) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5040) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5041) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5042) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5043) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5044) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5045) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5046) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5047) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5048) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5049) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5050) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5051) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5052) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5053) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5054) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5055) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5056) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5057) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5058) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5059) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5060) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5061) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5062) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5063) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5064) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5065) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5066) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5067) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5068) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5069) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5070) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5071) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5072) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5073) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5074) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5075) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5076) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5077) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5078) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5079) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5080) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5081) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5082) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5083) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5084) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5085) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5086) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5087) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5088) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5089) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5090) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5091) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5092) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5093) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5094) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5095) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5096) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5097) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5098) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5099) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5100) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5101) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5102) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5103) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5104) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5105) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5106) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5107) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5108) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5109) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5110) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5111) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5112) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5113) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5114) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5115) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5116) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5117) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5118) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5119) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5120) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5121) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5122) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5123) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5124) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5125) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5126) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5127) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5128) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5129) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5130) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5131) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5132) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5133) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5134) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5135) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5136) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5137) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5138) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5139) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5140) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5141) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5142) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5143) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5144) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5145) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5146) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5147) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5148) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5149) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5150) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5151) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5152) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5153) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5154) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5155) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5156) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5157) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5158) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5159) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5160) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5161) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5162) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5163) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5164) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5165) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5166) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5167) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5168) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5169) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5170) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5171) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5172) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5173) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5174) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5175) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5176) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5177) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5178) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5179) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5180) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5181) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5182) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5183) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5184) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5185) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5186) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5187) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5188) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5189) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5190) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5191) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5192) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5193) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5194) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5195) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5196) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5197) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5198) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5199) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5200) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5201) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5202) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5203) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5204) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5205) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5206) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5207) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5208) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5209) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5210) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5211) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5212) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5213) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5214) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5215) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5216) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5217) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5218) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5219) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5220) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5221) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5222) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5223) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5224) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5225) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5226) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5227) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5228) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5229) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5230) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5231) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5232) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5233) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5234) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5235) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5236) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5237) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5238) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5239) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5240) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5241) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5242) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5243) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5244) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5245) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5246) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5247) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5248) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5249) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5250) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5251) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5252) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5253) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5254) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5255) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5256) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5257) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5258) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5259) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5260) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5261) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5262) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5263) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5264) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5265) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5266) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5267) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5268) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5269) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5270) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5271) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5272) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5273) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5274) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5275) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5276) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5277) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5278) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5279) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5280) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5281) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5282) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5283) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5284) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5285) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5286) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5287) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5288) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5289) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5290) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5291) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5292) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5293) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5294) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5295) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5296) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5297) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5298) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5299) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5300) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5301) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5302) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5303) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5304) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5305) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5306) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5307) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5308) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5309) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5310) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5311) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5312) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5313) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5314) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5315) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5316) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5317) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5318) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5319) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5320) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5321) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5322) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5323) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5324) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5325) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5326) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5327) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5328) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5329) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5330) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5331) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5332) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5333) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5334) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5335) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5336) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5337) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5338) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateNonEmptyAppliedFunctionsEntryId(5339) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5340) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5341) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5342) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5343) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5344) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5345) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5346) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5347) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateNonEmptyAppliedFunctionsEntryId(5348) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[UpdateNonEmptyAppliedFunctionsEntryId] = SealedList.list[UpdateNonEmptyAppliedFunctionsEntryId].sortBy(_.id)

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