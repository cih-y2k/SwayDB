
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
sealed abstract class UpdateEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object UpdateEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4028) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4029) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4030) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4031) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4032) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4033) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4034) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4035) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4036) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4037) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4038) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4039) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4040) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4041) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4042) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4043) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4044) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4045) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4046) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4047) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4048) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4049) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4050) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4051) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4052) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4053) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4054) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4055) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4056) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4057) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4058) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4059) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4060) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4061) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4062) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4063) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4064) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4065) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4066) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4067) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4068) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4069) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4070) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4071) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4072) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4073) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4074) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4075) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4076) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4077) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4078) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4079) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4080) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4081) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4082) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4083) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4084) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4085) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4086) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4087) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4088) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4089) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4090) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4091) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4092) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4093) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4094) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4095) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4096) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4097) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4098) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4099) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4100) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4101) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4102) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4103) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4104) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4105) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4106) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4107) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4108) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4109) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4110) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4111) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4112) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4113) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4114) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4115) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4116) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4117) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4118) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4119) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4120) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4121) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4122) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4123) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4124) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4125) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4126) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4127) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4128) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4129) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4130) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4131) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4132) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4133) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4134) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4135) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4136) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4137) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4138) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4139) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4140) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4141) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4142) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4143) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4144) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4145) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4146) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4147) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4148) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4149) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4150) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4151) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4152) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4153) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4154) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4155) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4156) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4157) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4158) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4159) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4160) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4161) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4162) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4163) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4164) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4165) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4166) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4167) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4168) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4169) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4170) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4171) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4172) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4173) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4174) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4175) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4176) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4177) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4178) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4179) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4180) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4181) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4182) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4183) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4184) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4185) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4186) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4187) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4188) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4189) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4190) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4191) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4192) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4193) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4194) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4195) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4196) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4197) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4198) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4199) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4200) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4201) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4202) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4203) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4204) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4205) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4206) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4207) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4208) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4209) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4210) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4211) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4212) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4213) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4214) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4215) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4216) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4217) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4218) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4219) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4220) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4221) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4222) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4223) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4224) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4225) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4226) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4227) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4228) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4229) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4230) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4231) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4232) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4233) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4234) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4235) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4236) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4237) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4238) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4239) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4240) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4241) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4242) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4243) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4244) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4245) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4246) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4247) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4248) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4249) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4250) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4251) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4252) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4253) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4254) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4255) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4256) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4257) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4258) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4259) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4260) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4261) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4262) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4263) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4264) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4265) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4266) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4267) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4268) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4269) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4270) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4271) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4272) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4273) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4274) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4275) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4276) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4277) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4278) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4279) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4280) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4281) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4282) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4283) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4284) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4285) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4286) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4287) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4288) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4289) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4290) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4291) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4292) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4293) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4294) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4295) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4296) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4297) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4298) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4299) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4300) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4301) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4302) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4303) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4304) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4305) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4306) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4307) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4308) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4309) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4310) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4311) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4312) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4313) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4314) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4315) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4316) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4317) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4318) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4319) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4320) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4321) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4322) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4323) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4324) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4325) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4326) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4327) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4328) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4329) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4330) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4331) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4332) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4333) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4334) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4335) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4336) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4337) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4338) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4339) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4340) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4341) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4342) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4343) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4344) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4345) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4346) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4347) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4348) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4349) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4350) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4351) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4352) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4353) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4354) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4355) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4356) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4357) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4358) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4359) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4360) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4361) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4362) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4363) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4364) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4365) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4366) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4367) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4368) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4369) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4370) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4371) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4372) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4373) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4374) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4375) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4376) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4377) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4378) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4379) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4380) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4381) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4382) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4383) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4384) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4385) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4386) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4387) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4388) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4389) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4390) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4391) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4392) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4393) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4394) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4395) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4396) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4397) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4398) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4399) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4400) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4401) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4402) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4403) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4404) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4405) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4406) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4407) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4408) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4409) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4410) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4411) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4412) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4413) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4414) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4415) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4416) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4417) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4418) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4419) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4420) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4421) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4422) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4423) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4424) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4425) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4426) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4427) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4428) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4429) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4430) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4431) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4432) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4433) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4434) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4435) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4436) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4437) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4438) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4439) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4440) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4441) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4442) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4443) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4444) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4445) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4446) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4447) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4448) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4449) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4450) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4451) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4452) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4453) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4454) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4455) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4456) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4457) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4458) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4459) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4460) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4461) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4462) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4463) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4464) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4465) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4466) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4467) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4468) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4469) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4470) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4471) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4472) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4473) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4474) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4475) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4476) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4477) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4478) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4479) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4480) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4481) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4482) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4483) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4484) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4485) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4486) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4487) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4488) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4489) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4490) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4491) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4492) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4493) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4494) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4495) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4496) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4497) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4498) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4499) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4500) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4501) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4502) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4503) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4504) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4505) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4506) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4507) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4508) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4509) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4510) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4511) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4512) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4513) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4514) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4515) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4516) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4517) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4518) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4519) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4520) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4521) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4522) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4523) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4524) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4525) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4526) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4527) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4528) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4529) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4530) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4531) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4532) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4533) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4534) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4535) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4536) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4537) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4538) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4539) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4540) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4541) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4542) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4543) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4544) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4545) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4546) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4547) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4548) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4549) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4550) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4551) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4552) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4553) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4554) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4555) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4556) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4557) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4558) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4559) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4560) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4561) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4562) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4563) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4564) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4565) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4566) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4567) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4568) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4569) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4570) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4571) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4572) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4573) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4574) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4575) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4576) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4577) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4578) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4579) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4580) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4581) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4582) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4583) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4584) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4585) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4586) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4587) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4588) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4589) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4590) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4591) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4592) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4593) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4594) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4595) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4596) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4597) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4598) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4599) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4600) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4601) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4602) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4603) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4604) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4605) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4606) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4607) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4608) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4609) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4610) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4611) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4612) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4613) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4614) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4615) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4616) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4617) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4618) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4619) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4620) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4621) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4622) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4623) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4624) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4625) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4626) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4627) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4628) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4629) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4630) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4631) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4632) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4633) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4634) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4635) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4636) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4637) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4638) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4639) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4640) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4641) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4642) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4643) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4644) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4645) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4646) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4647) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4648) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4649) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4650) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4651) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4652) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4653) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4654) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4655) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4656) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4657) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4658) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4659) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4660) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4661) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4662) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4663) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4664) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4665) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4666) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4667) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4668) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4669) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4670) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4671) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4672) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4673) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4674) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4675) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4676) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4677) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEmptyAppliedFunctionsEntryId(4678) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEmptyAppliedFunctionsEntryId(4679) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEmptyAppliedFunctionsEntryId(4680) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEmptyAppliedFunctionsEntryId(4681) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEmptyAppliedFunctionsEntryId(4682) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEmptyAppliedFunctionsEntryId(4683) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEmptyAppliedFunctionsEntryId(4684) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEmptyAppliedFunctionsEntryId(4685) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEmptyAppliedFunctionsEntryId(4686) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEmptyAppliedFunctionsEntryId(4687) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[UpdateEmptyAppliedFunctionsEntryId] = SealedList.list[UpdateEmptyAppliedFunctionsEntryId].sortBy(_.id)

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