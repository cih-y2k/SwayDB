
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
sealed abstract class RangeEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object RangeEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

  sealed trait EmptyAppliedFunctions extends AppliedFunctions.Empty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = EmptyAppliedFunctions.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = EmptyAppliedFunctions.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = EmptyAppliedFunctions.KeyUncompressed
  }

  object EmptyAppliedFunctions extends EmptyAppliedFunctions {
    
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with EmptyAppliedFunctions {
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2706) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2707) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2708) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2709) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2710) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2711) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2712) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2713) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2714) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2715) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2716) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2717) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2718) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2719) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2720) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2721) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2722) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2723) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2724) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2725) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2726) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2727) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2728) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2729) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2730) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2731) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2732) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2733) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2734) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2735) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2736) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2737) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2738) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2739) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2740) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2741) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2742) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2743) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2744) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2745) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2746) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2747) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2748) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2749) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2750) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2751) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2752) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2753) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2754) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2755) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2756) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2757) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2758) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2759) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2760) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2761) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2762) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2763) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2764) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2765) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2766) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2767) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2768) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2769) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2770) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2771) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2772) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2773) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2774) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2775) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2776) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2777) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2778) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2779) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2780) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2781) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2782) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2783) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2784) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2785) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2786) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2787) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2788) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2789) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2790) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2791) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2792) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2793) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2794) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2795) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2796) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2797) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2798) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2799) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2800) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2801) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2802) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2803) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2804) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2805) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2806) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2807) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2808) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2809) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2810) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2811) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2812) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2813) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2814) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2815) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2816) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2817) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2818) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2819) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2820) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2821) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2822) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2823) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2824) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2825) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2826) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2827) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2828) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2829) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2830) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2831) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2832) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2833) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2834) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2835) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2836) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2837) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2838) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2839) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2840) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2841) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2842) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2843) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2844) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2845) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2846) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2847) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2848) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2849) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2850) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2851) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2852) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2853) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2854) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2855) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2856) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2857) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2858) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2859) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2860) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2861) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2862) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2863) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2864) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2865) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2866) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2867) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2868) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2869) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2870) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2871) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2872) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2873) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2874) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2875) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2876) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2877) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2878) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2879) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2880) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2881) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2882) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2883) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2884) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2885) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2886) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2887) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2888) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2889) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2890) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2891) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2892) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2893) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2894) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2895) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2896) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2897) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2898) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2899) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2900) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2901) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2902) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2903) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2904) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2905) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2906) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2907) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2908) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2909) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2910) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2911) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2912) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2913) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2914) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2915) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2916) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2917) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2918) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2919) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2920) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2921) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2922) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2923) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2924) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2925) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with EmptyAppliedFunctions {
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2926) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2927) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2928) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2929) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2930) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2931) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2932) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2933) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2934) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2935) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2936) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2937) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2938) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2939) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2940) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2941) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2942) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2943) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2944) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2945) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2946) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2947) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2948) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2949) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2950) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2951) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2952) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2953) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2954) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2955) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2956) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2957) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2958) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2959) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2960) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2961) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2962) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2963) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2964) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2965) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2966) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2967) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2968) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2969) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2970) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2971) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2972) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2973) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2974) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2975) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2976) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2977) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2978) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2979) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2980) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2981) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2982) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2983) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2984) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2985) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2986) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2987) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2988) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2989) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(2990) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(2991) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(2992) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(2993) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(2994) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(2995) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(2996) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(2997) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(2998) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(2999) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3000) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3001) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3002) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3003) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3004) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3005) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3006) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3007) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3008) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3009) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3010) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3011) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3012) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3013) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3014) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3015) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3016) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3017) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3018) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3019) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3020) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3021) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3022) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3023) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3024) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3025) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3026) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3027) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3028) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3029) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3030) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3031) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3032) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3033) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3034) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3035) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3036) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3037) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3038) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3039) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3040) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3041) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3042) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3043) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3044) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3045) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3046) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3047) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3048) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3049) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3050) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3051) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3052) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3053) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3054) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3055) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3056) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3057) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3058) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3059) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3060) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3061) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3062) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3063) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3064) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3065) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3066) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3067) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3068) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3069) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3070) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3071) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3072) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3073) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3074) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3075) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3076) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3077) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3078) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3079) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3080) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3081) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3082) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3083) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3084) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3085) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3086) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3087) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3088) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3089) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3090) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3091) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3092) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3093) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3094) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3095) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3096) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3097) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3098) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3099) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3100) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3101) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3102) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3103) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3104) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3105) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3106) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3107) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3108) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3109) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3110) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3111) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3112) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3113) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3114) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3115) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3116) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3117) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3118) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3119) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3120) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3121) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3122) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3123) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3124) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3125) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3126) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3127) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3128) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3129) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3130) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3131) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3132) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3133) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3134) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3135) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3136) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3137) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3138) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3139) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3140) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3141) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3142) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3143) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3144) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3145) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with EmptyAppliedFunctions {
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3146) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3147) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3148) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3149) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3150) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3151) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3152) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3153) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3154) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3155) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3156) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3157) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3158) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3159) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3160) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3161) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3162) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3163) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3164) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3165) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3166) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3167) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3168) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3169) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3170) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3171) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3172) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3173) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3174) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3175) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3176) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3177) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3178) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3179) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3180) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3181) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3182) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3183) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3184) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3185) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3186) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3187) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3188) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3189) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3190) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3191) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3192) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3193) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3194) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3195) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3196) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3197) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3198) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3199) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3200) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3201) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3202) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3203) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3204) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3205) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3206) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3207) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3208) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3209) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3210) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3211) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3212) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3213) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3214) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3215) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3216) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3217) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3218) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3219) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3220) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3221) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3222) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3223) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3224) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3225) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3226) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3227) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3228) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3229) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3230) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3231) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3232) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3233) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3234) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3235) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3236) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3237) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3238) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3239) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3240) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3241) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3242) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3243) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3244) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3245) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3246) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3247) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3248) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3249) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3250) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3251) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3252) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3253) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3254) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3255) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3256) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3257) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3258) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3259) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3260) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3261) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3262) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3263) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3264) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3265) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3266) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3267) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3268) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3269) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3270) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3271) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3272) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3273) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3274) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3275) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3276) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3277) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3278) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3279) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3280) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3281) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3282) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3283) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3284) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3285) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3286) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3287) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3288) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3289) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3290) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3291) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3292) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3293) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3294) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3295) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3296) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3297) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3298) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3299) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3300) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3301) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3302) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3303) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3304) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3305) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3306) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3307) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3308) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3309) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3310) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3311) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3312) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3313) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3314) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3315) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3316) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3317) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3318) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3319) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3320) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3321) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3322) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3323) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3324) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3325) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3326) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3327) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3328) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3329) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3330) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3331) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3332) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3333) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3334) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3335) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3336) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3337) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3338) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3339) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3340) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3341) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3342) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3343) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3344) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3345) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3346) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3347) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3348) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3349) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3350) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3351) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3352) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3353) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3354) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3355) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends RangeEmptyAppliedFunctionsEntryId(3356) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends RangeEmptyAppliedFunctionsEntryId(3357) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends RangeEmptyAppliedFunctionsEntryId(3358) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends RangeEmptyAppliedFunctionsEntryId(3359) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends RangeEmptyAppliedFunctionsEntryId(3360) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends RangeEmptyAppliedFunctionsEntryId(3361) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends RangeEmptyAppliedFunctionsEntryId(3362) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends RangeEmptyAppliedFunctionsEntryId(3363) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends RangeEmptyAppliedFunctionsEntryId(3364) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends RangeEmptyAppliedFunctionsEntryId(3365) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[RangeEmptyAppliedFunctionsEntryId] = SealedList.list[RangeEmptyAppliedFunctionsEntryId].sortBy(_.id)

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