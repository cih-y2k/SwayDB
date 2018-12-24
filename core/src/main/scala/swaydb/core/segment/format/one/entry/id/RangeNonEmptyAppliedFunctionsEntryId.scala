
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
sealed abstract class RangeNonEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object RangeNonEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3367) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3368) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3369) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3370) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3371) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3372) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3373) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3374) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3375) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3376) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3377) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3378) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3379) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3380) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3381) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3382) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3383) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3384) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3385) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3386) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3387) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3388) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3389) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3390) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3391) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3392) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3393) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3394) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3395) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3396) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3397) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3398) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3399) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3400) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3401) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3402) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3403) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3404) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3405) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3406) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3407) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3408) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3409) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3410) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3411) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3412) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3413) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3414) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3415) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3416) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3417) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3418) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3419) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3420) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3421) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3422) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3423) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3424) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3425) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3426) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3427) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3428) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3429) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3430) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3431) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3432) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3433) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3434) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3435) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3436) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3437) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3438) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3439) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3440) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3441) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3442) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3443) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3444) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3445) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3446) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3447) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3448) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3449) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3450) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3451) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3452) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3453) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3454) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3455) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3456) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3457) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3458) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3459) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3460) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3461) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3462) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3463) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3464) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3465) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3466) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3467) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3468) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3469) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3470) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3471) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3472) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3473) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3474) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3475) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3476) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3477) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3478) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3479) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3480) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3481) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3482) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3483) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3484) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3485) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3486) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3487) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3488) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3489) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3490) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3491) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3492) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3493) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3494) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3495) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3496) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3497) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3498) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3499) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3500) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3501) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3502) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3503) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3504) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3505) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3506) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3507) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3508) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3509) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3510) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3511) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3512) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3513) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3514) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3515) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3516) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3517) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3518) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3519) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3520) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3521) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3522) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3523) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3524) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3525) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3526) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3527) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3528) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3529) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3530) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3531) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3532) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3533) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3534) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3535) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3536) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3537) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3538) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3539) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3540) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3541) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3542) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3543) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3544) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3545) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3546) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3547) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3548) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3549) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3550) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3551) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3552) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3553) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3554) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3555) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3556) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3557) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3558) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3559) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3560) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3561) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3562) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3563) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3564) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3565) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3566) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3567) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3568) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3569) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3570) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3571) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3572) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3573) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3574) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3575) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3576) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3577) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3578) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3579) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3580) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3581) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3582) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3583) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3584) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3585) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3586) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3587) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3588) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3589) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3590) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3591) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3592) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3593) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3594) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3595) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3596) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3597) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3598) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3599) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3600) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3601) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3602) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3603) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3604) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3605) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3606) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3607) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3608) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3609) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3610) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3611) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3612) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3613) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3614) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3615) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3616) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3617) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3618) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3619) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3620) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3621) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3622) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3623) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3624) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3625) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3626) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3627) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3628) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3629) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3630) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3631) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3632) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3633) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3634) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3635) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3636) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3637) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3638) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3639) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3640) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3641) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3642) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3643) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3644) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3645) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3646) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3647) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3648) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3649) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3650) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3651) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3652) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3653) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3654) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3655) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3656) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3657) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3658) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3659) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3660) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3661) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3662) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3663) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3664) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3665) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3666) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3667) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3668) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3669) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3670) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3671) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3672) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3673) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3674) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3675) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3676) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3677) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3678) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3679) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3680) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3681) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3682) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3683) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3684) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3685) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3686) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3687) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3688) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3689) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3690) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3691) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3692) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3693) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3694) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3695) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3696) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3697) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3698) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3699) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3700) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3701) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3702) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3703) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3704) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3705) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3706) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3707) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3708) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3709) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3710) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3711) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3712) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3713) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3714) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3715) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3716) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3717) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3718) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3719) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3720) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3721) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3722) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3723) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3724) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3725) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3726) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3727) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3728) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3729) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3730) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3731) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3732) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3733) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3734) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3735) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3736) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3737) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3738) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3739) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3740) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3741) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3742) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3743) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3744) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3745) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3746) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3747) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3748) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3749) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3750) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3751) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3752) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3753) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3754) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3755) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3756) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3757) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3758) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3759) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3760) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3761) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3762) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3763) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3764) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3765) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3766) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3767) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3768) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3769) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3770) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3771) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3772) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3773) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3774) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3775) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3776) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3777) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3778) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3779) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3780) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3781) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3782) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3783) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3784) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3785) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3786) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3787) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3788) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3789) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3790) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3791) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3792) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3793) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3794) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3795) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3796) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3797) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3798) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3799) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3800) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3801) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3802) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3803) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3804) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3805) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3806) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3807) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3808) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3809) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3810) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3811) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3812) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3813) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3814) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3815) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3816) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3817) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3818) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3819) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3820) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3821) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3822) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3823) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3824) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3825) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3826) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3827) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3828) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3829) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3830) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3831) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3832) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3833) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3834) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3835) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3836) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3837) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3838) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3839) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3840) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3841) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3842) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3843) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3844) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3845) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3846) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3847) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3848) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3849) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3850) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3851) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3852) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3853) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3854) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3855) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3856) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3857) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3858) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3859) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3860) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3861) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3862) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3863) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3864) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3865) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3866) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3867) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3868) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3869) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3870) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3871) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3872) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3873) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3874) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3875) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3876) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3877) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3878) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3879) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3880) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3881) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3882) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3883) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3884) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3885) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3886) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3887) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3888) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3889) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3890) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3891) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3892) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3893) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3894) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3895) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3896) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3897) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3898) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3899) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3900) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3901) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3902) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3903) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3904) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3905) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3906) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3907) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3908) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3909) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3910) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3911) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3912) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3913) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3914) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3915) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3916) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3917) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3918) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3919) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3920) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3921) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3922) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3923) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3924) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3925) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3926) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3927) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3928) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3929) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3930) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3931) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3932) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3933) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3934) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3935) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3936) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3937) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3938) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3939) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3940) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3941) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3942) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3943) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3944) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3945) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3946) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3947) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3948) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3949) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3950) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3951) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3952) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3953) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3954) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3955) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3956) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3957) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3958) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3959) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3960) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3961) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3962) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3963) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3964) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3965) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3966) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3967) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3968) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3969) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3970) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3971) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3972) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3973) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3974) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3975) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3976) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3977) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3978) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3979) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3980) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3981) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3982) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3983) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3984) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3985) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3986) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3987) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3988) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3989) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3990) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3991) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3992) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3993) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3994) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3995) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(3996) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(3997) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3998) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(3999) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4000) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4001) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4002) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4003) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4004) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4005) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(4006) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(4007) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4008) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4009) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4010) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4011) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4012) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4013) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4014) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4015) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(4016) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeNonEmptyAppliedFunctionsEntryId(4017) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4018) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4019) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4020) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4021) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4022) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4023) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4024) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeNonEmptyAppliedFunctionsEntryId(4025) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeNonEmptyAppliedFunctionsEntryId(4026) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[RangeNonEmptyAppliedFunctionsEntryId] = SealedList.list[RangeNonEmptyAppliedFunctionsEntryId].sortBy(_.id)

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