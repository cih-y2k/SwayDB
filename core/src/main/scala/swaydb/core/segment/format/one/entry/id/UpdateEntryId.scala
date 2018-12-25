
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
sealed abstract class UpdateEntryId(override val id: Int) extends EntryId(id)
object UpdateEntryId extends GeneratedEntryId {

  override val emptyMeta: EntryId.Meta.Empty = UpdateEntryId.EmptyMeta
  override val nonEmptyMeta: EntryId.Meta.NonEmpty = UpdateEntryId.NonEmptyMeta

  sealed trait EmptyMeta extends Meta.Empty {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = EmptyMeta.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = EmptyMeta.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = EmptyMeta.KeyUncompressed
  }
  object EmptyMeta extends EmptyMeta {

    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with EmptyMeta {
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
            case object NoDeadline extends UpdateEntryId(4024) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4025) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4026) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4027) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4028) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4029) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4030) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4031) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4032) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4033) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4034) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4035) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4036) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4037) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4038) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4039) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4040) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4041) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4042) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4043) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4044) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4045) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4046) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4047) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4048) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4049) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4050) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4051) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4052) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4053) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4054) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4055) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4056) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4057) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4058) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4059) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4060) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4061) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4062) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4063) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4064) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4065) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4066) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4067) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4068) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4069) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4070) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4071) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4072) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4073) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4074) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4075) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4076) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4077) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4078) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4079) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4080) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4081) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4082) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4083) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4084) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4085) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4086) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4087) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4088) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4089) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4090) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4091) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4092) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4093) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4094) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4095) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4096) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4097) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4098) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4099) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4100) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4101) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4102) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4103) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4104) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4105) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4106) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4107) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4108) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4109) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4110) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4111) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4112) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4113) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4114) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4115) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4116) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4117) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4118) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4119) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4120) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4121) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4122) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4123) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4124) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4125) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4126) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4127) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4128) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4129) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4130) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4131) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4132) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4133) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4134) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4135) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4136) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4137) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4138) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4139) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4140) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4141) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4142) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4143) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4144) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4145) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4146) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4147) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4148) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4149) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4150) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4151) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4152) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4153) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4154) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4155) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4156) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4157) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4158) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4159) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4160) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4161) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4162) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4163) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4164) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4165) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4166) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4167) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4168) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4169) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4170) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4171) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4172) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4173) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4174) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4175) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4176) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4177) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4178) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4179) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4180) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4181) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4182) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4183) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4184) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4185) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4186) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4187) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4188) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4189) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4190) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4191) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4192) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4193) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4194) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4195) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4196) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4197) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4198) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4199) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4200) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4201) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4202) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4203) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4204) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4205) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4206) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4207) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4208) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4209) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4210) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4211) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4212) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4213) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4214) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4215) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4216) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4217) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4218) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4219) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4220) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4221) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4222) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4223) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(4224) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(4225) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(4226) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(4227) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(4228) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(4229) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(4230) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(4231) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(4232) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(4233) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(4234) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(4235) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(4236) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(4237) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(4238) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(4239) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(4240) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(4241) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(4242) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(4243) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with EmptyMeta {
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
            case object NoDeadline extends UpdateEntryId(4244) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4245) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4246) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4247) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4248) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4249) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4250) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4251) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4252) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4253) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4254) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4255) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4256) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4257) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4258) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4259) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4260) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4261) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4262) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4263) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4264) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4265) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4266) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4267) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4268) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4269) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4270) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4271) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4272) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4273) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4274) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4275) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4276) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4277) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4278) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4279) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4280) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4281) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4282) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4283) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4284) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4285) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4286) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4287) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4288) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4289) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4290) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4291) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4292) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4293) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4294) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4295) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4296) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4297) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4298) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4299) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4300) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4301) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4302) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4303) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4304) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4305) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4306) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4307) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4308) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4309) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4310) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4311) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4312) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4313) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4314) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4315) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4316) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4317) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4318) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4319) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4320) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4321) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4322) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4323) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4324) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4325) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4326) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4327) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4328) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4329) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4330) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4331) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4332) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4333) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4334) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4335) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4336) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4337) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4338) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4339) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4340) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4341) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4342) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4343) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4344) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4345) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4346) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4347) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4348) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4349) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4350) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4351) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4352) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4353) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4354) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4355) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4356) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4357) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4358) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4359) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4360) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4361) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4362) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4363) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4364) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4365) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4366) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4367) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4368) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4369) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4370) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4371) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4372) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4373) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4374) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4375) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4376) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4377) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4378) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4379) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4380) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4381) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4382) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4383) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4384) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4385) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4386) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4387) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4388) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4389) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4390) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4391) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4392) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4393) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4394) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4395) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4396) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4397) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4398) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4399) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4400) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4401) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4402) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4403) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4404) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4405) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4406) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4407) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4408) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4409) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4410) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4411) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4412) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4413) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4414) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4415) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4416) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4417) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4418) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4419) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4420) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4421) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4422) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4423) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4424) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4425) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4426) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4427) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4428) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4429) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4430) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4431) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4432) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4433) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4434) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4435) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4436) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4437) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4438) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4439) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4440) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4441) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4442) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4443) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(4444) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(4445) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(4446) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(4447) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(4448) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(4449) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(4450) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(4451) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(4452) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(4453) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(4454) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(4455) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(4456) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(4457) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(4458) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(4459) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(4460) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(4461) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(4462) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(4463) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with EmptyMeta {
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
            case object NoDeadline extends UpdateEntryId(4464) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4465) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4466) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4467) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4468) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4469) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4470) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4471) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4472) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4473) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4474) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4475) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4476) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4477) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4478) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4479) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4480) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4481) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4482) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4483) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4484) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4485) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4486) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4487) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4488) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4489) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4490) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4491) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4492) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4493) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4494) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4495) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4496) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4497) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4498) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4499) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4500) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4501) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4502) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4503) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4504) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4505) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4506) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4507) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4508) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4509) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4510) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4511) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4512) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4513) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4514) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4515) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4516) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4517) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4518) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4519) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4520) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4521) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4522) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4523) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4524) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4525) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4526) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4527) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4528) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4529) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4530) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4531) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4532) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4533) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4534) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4535) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4536) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4537) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4538) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4539) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4540) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4541) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4542) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4543) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4544) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4545) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4546) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4547) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4548) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4549) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4550) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4551) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4552) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4553) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4554) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4555) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4556) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4557) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4558) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4559) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4560) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4561) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4562) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4563) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4564) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4565) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4566) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4567) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4568) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4569) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4570) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4571) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4572) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4573) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4574) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4575) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4576) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4577) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4578) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4579) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4580) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4581) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4582) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4583) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4584) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4585) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4586) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4587) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4588) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4589) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4590) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4591) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4592) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4593) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4594) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4595) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4596) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4597) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4598) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4599) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4600) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4601) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4602) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4603) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4604) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4605) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4606) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4607) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4608) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4609) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4610) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4611) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4612) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4613) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4614) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4615) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4616) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4617) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4618) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4619) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4620) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4621) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4622) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4623) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4624) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4625) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4626) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4627) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4628) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4629) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4630) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4631) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4632) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4633) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4634) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4635) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4636) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4637) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4638) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4639) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4640) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4641) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4642) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4643) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4644) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4645) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4646) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4647) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4648) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4649) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4650) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4651) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4652) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4653) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4654) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4655) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4656) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4657) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4658) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4659) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4660) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4661) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4662) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4663) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(4664) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(4665) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(4666) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(4667) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(4668) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(4669) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(4670) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(4671) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(4672) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(4673) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(4674) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(4675) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(4676) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(4677) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(4678) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(4679) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(4680) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(4681) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(4682) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(4683) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4684) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4685) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4686) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4687) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4688) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4689) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4690) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4691) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4692) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4693) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4694) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4695) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4696) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4697) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4698) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4699) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4700) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4701) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4702) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4703) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4704) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4705) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4706) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4707) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4708) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4709) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4710) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4711) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4712) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4713) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4714) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4715) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4716) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4717) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4718) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4719) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4720) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4721) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4722) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4723) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4724) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4725) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4726) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4727) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4728) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4729) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4730) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4731) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4732) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4733) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4734) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4735) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4736) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4737) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4738) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4739) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4740) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4741) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4742) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4743) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4744) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4745) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4746) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4747) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4748) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4749) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4750) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4751) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4752) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4753) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4754) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4755) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4756) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4757) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4758) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4759) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4760) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4761) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4762) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4763) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4764) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4765) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4766) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4767) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4768) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4769) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4770) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4771) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4772) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4773) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4774) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4775) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4776) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4777) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4778) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4779) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4780) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4781) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4782) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4783) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4784) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4785) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4786) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4787) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4788) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4789) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4790) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4791) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4792) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4793) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4794) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4795) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4796) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4797) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4798) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4799) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4800) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4801) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4802) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4803) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4804) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4805) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4806) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4807) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4808) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4809) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4810) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4811) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4812) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4813) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4814) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4815) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4816) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4817) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4818) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4819) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4820) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4821) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4822) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4823) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4824) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4825) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4826) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4827) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4828) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4829) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4830) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4831) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4832) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4833) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4834) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4835) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4836) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4837) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4838) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4839) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4840) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4841) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4842) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4843) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4844) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4845) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4846) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4847) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4848) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4849) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4850) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4851) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4852) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4853) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4854) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4855) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4856) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4857) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4858) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4859) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4860) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4861) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4862) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4863) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4864) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4865) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4866) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4867) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4868) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4869) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4870) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4871) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4872) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4873) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4874) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4875) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4876) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4877) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4878) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4879) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4880) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4881) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4882) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4883) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(4884) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(4885) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(4886) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(4887) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(4888) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(4889) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(4890) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(4891) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(4892) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(4893) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(4894) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(4895) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(4896) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(4897) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(4898) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(4899) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(4900) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(4901) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(4902) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(4903) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with NonEmptyMeta {
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
            case object NoDeadline extends UpdateEntryId(4904) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4905) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4906) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4907) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4908) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4909) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4910) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4911) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4912) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4913) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4914) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4915) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4916) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4917) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4918) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4919) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4920) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4921) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4922) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4923) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4924) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4925) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4926) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4927) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4928) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4929) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4930) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4931) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4932) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4933) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4934) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4935) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4936) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4937) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4938) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4939) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4940) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4941) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4942) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4943) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4944) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4945) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4946) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4947) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4948) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4949) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4950) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4951) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4952) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(4953) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(4954) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4955) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4956) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4957) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4958) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4959) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4960) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4961) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4962) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4963) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(4964) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4965) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4966) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4967) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4968) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4969) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4970) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4971) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4972) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4973) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(4974) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4975) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4976) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4977) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4978) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4979) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4980) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4981) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4982) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4983) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(4984) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4985) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4986) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4987) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4988) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4989) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(4990) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(4991) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(4992) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(4993) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(4994) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(4995) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(4996) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(4997) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(4998) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(4999) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5000) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5001) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5002) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5003) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(5004) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5005) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5006) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5007) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5008) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5009) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5010) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5011) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5012) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5013) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5014) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5015) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5016) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5017) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5018) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5019) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5020) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5021) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5022) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5023) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5024) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5025) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5026) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5027) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5028) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5029) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5030) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5031) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5032) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5033) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5034) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5035) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5036) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5037) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5038) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5039) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5040) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5041) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5042) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5043) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5044) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5045) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5046) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5047) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5048) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5049) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5050) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5051) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5052) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5053) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(5054) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5055) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5056) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5057) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5058) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5059) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5060) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5061) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5062) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5063) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5064) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5065) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5066) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5067) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5068) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5069) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5070) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5071) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5072) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5073) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5074) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5075) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5076) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5077) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5078) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5079) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5080) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5081) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5082) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5083) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5084) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5085) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5086) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5087) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5088) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5089) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5090) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5091) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5092) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5093) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5094) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5095) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5096) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5097) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5098) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5099) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5100) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5101) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5102) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5103) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(5104) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(5105) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(5106) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(5107) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(5108) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(5109) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(5110) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(5111) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(5112) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(5113) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(5114) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(5115) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(5116) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(5117) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(5118) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(5119) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(5120) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(5121) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(5122) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(5123) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with NonEmptyMeta {
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
            case object NoDeadline extends UpdateEntryId(5124) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5125) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5126) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5127) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5128) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5129) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5130) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5131) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5132) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5133) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5134) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5135) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5136) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5137) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5138) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5139) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5140) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5141) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5142) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5143) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5144) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5145) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5146) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5147) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5148) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5149) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5150) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5151) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5152) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5153) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5154) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5155) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5156) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5157) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5158) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5159) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5160) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5161) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5162) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5163) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5164) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5165) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5166) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5167) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5168) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5169) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5170) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5171) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5172) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5173) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(5174) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5175) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5176) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5177) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5178) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5179) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5180) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5181) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5182) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5183) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5184) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5185) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5186) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5187) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5188) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5189) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5190) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5191) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5192) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5193) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5194) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5195) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5196) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5197) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5198) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5199) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5200) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5201) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5202) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5203) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5204) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5205) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5206) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5207) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5208) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5209) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5210) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5211) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5212) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5213) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5214) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5215) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5216) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5217) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5218) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5219) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5220) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5221) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5222) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5223) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(5224) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5225) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5226) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5227) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5228) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5229) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5230) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5231) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5232) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5233) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5234) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5235) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5236) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5237) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5238) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5239) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5240) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5241) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5242) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5243) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5244) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5245) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5246) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5247) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5248) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5249) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5250) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5251) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5252) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5253) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5254) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5255) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5256) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5257) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5258) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5259) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5260) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5261) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5262) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5263) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5264) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5265) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5266) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5267) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5268) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5269) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5270) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5271) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5272) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5273) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends UpdateEntryId(5274) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5275) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5276) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5277) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5278) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5279) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5280) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5281) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5282) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5283) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends UpdateEntryId(5284) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5285) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5286) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5287) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5288) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5289) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5290) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5291) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5292) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5293) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends UpdateEntryId(5294) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5295) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5296) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5297) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5298) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5299) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5300) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5301) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5302) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5303) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends UpdateEntryId(5304) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5305) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5306) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5307) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5308) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5309) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5310) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5311) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5312) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends UpdateEntryId(5313) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends UpdateEntryId(5314) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends UpdateEntryId(5315) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends UpdateEntryId(5316) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends UpdateEntryId(5317) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends UpdateEntryId(5318) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends UpdateEntryId(5319) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends UpdateEntryId(5320) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends UpdateEntryId(5321) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends UpdateEntryId(5322) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends UpdateEntryId(5323) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends UpdateEntryId(5324) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends UpdateEntryId(5325) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends UpdateEntryId(5326) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends UpdateEntryId(5327) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends UpdateEntryId(5328) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends UpdateEntryId(5329) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends UpdateEntryId(5330) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends UpdateEntryId(5331) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends UpdateEntryId(5332) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends UpdateEntryId(5333) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends UpdateEntryId(5334) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends UpdateEntryId(5335) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends UpdateEntryId(5336) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends UpdateEntryId(5337) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends UpdateEntryId(5338) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends UpdateEntryId(5339) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends UpdateEntryId(5340) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends UpdateEntryId(5341) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends UpdateEntryId(5342) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends UpdateEntryId(5343) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[UpdateEntryId] = SealedList.list[UpdateEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}
