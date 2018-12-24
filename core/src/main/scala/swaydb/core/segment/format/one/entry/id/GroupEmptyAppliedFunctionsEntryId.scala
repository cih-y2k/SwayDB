
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
sealed abstract class GroupEmptyAppliedFunctionsEntryId(override val id: Int) extends EntryId(id)
object GroupEmptyAppliedFunctionsEntryId extends GeneratedEntryId {

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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1322) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1323) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1324) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1325) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1326) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1327) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1328) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1329) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1330) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1331) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1332) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1333) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1334) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1335) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1336) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1337) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1338) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1339) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1340) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1341) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1342) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1343) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1344) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1345) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1346) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1347) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1348) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1349) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1350) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1351) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1352) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1353) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1354) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1355) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1356) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1357) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1358) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1359) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1360) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1361) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1362) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1363) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1364) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1365) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1366) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1367) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1368) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1369) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1370) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1371) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1372) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1373) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1374) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1375) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1376) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1377) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1378) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1379) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1380) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1381) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1382) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1383) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1384) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1385) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1386) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1387) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1388) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1389) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1390) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1391) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1392) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1393) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1394) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1395) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1396) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1397) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1398) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1399) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1400) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1401) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1402) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1403) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1404) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1405) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1406) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1407) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1408) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1409) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1410) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1411) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1412) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1413) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1414) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1415) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1416) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1417) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1418) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1419) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1420) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1421) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1422) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1423) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1424) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1425) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1426) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1427) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1428) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1429) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1430) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1431) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1432) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1433) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1434) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1435) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1436) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1437) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1438) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1439) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1440) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1441) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1442) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1443) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1444) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1445) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1446) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1447) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1448) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1449) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1450) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1451) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1452) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1453) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1454) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1455) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1456) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1457) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1458) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1459) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1460) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1461) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1462) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1463) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1464) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1465) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1466) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1467) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1468) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1469) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1470) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1471) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1472) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1473) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1474) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1475) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1476) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1477) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1478) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1479) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1480) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1481) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1482) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1483) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1484) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1485) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1486) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1487) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1488) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1489) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1490) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1491) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1492) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1493) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1494) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1495) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1496) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1497) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1498) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1499) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1500) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1501) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1502) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1503) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1504) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1505) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1506) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1507) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1508) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1509) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1510) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1511) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1512) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1513) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1514) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1515) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1516) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1517) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1518) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1519) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1520) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1521) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1522) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1523) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1524) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1525) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1526) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1527) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1528) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1529) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1530) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1531) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1532) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1533) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1534) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1535) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1536) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1537) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1538) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1539) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1540) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1541) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1542) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1543) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1544) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1545) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1546) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1547) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1548) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1549) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1550) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1551) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1552) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1553) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1554) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1555) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1556) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1557) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1558) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1559) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1560) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1561) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1562) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1563) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1564) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1565) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1566) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1567) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1568) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1569) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1570) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1571) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1572) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1573) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1574) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1575) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1576) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1577) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1578) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1579) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1580) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1581) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1582) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1583) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1584) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1585) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1586) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1587) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1588) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1589) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1590) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1591) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1592) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1593) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1594) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1595) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1596) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1597) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1598) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1599) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1600) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1601) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1602) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1603) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1604) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1605) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1606) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1607) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1608) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1609) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1610) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1611) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1612) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1613) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1614) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1615) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1616) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1617) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1618) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1619) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1620) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1621) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1622) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1623) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1624) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1625) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1626) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1627) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1628) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1629) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1630) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1631) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1632) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1633) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1634) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1635) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1636) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1637) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1638) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1639) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1640) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1641) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1642) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1643) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1644) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1645) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1646) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1647) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1648) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1649) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1650) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1651) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1652) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1653) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1654) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1655) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1656) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1657) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1658) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1659) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1660) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1661) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1662) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1663) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1664) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1665) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1666) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1667) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1668) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1669) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1670) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1671) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1672) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1673) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1674) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1675) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1676) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1677) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1678) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1679) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1680) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1681) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1682) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1683) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1684) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1685) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1686) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1687) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1688) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1689) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1690) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1691) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1692) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1693) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1694) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1695) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1696) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1697) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1698) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1699) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1700) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1701) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1702) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1703) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1704) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1705) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1706) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1707) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1708) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1709) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1710) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1711) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1712) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1713) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1714) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1715) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1716) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1717) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1718) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1719) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1720) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1721) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1722) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1723) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1724) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1725) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1726) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1727) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1728) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1729) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1730) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1731) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1732) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1733) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1734) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1735) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1736) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1737) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1738) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1739) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1740) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1741) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1742) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1743) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1744) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1745) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1746) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1747) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1748) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1749) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1750) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1751) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1752) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1753) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1754) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1755) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1756) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1757) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1758) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1759) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1760) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1761) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1762) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1763) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1764) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1765) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1766) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1767) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1768) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1769) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1770) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1771) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1772) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1773) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1774) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1775) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1776) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1777) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1778) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1779) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1780) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1781) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1782) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1783) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1784) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1785) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1786) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1787) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1788) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1789) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1790) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1791) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1792) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1793) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1794) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1795) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1796) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1797) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1798) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1799) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1800) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1801) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1802) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1803) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1804) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1805) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1806) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1807) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1808) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1809) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1810) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1811) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1812) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1813) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1814) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1815) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1816) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1817) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1818) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1819) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1820) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1821) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1822) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1823) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1824) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1825) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1826) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1827) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1828) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1829) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1830) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1831) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1832) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1833) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1834) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1835) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1836) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1837) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1838) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1839) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1840) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1841) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1842) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1843) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1844) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1845) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1846) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1847) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1848) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1849) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1850) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1851) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1852) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1853) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1854) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1855) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1856) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1857) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1858) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1859) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1860) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1861) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1862) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1863) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1864) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1865) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1866) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1867) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1868) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1869) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1870) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1871) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1872) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1873) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1874) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1875) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1876) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1877) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1878) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1879) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1880) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1881) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1882) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1883) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1884) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1885) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1886) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1887) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1888) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1889) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1890) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1891) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1892) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1893) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1894) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1895) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1896) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1897) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1898) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1899) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1900) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1901) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1902) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1903) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1904) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1905) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1906) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1907) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1908) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1909) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1910) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1911) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1912) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1913) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1914) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1915) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1916) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1917) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1918) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1919) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1920) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1921) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1922) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1923) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1924) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1925) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1926) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1927) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1928) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1929) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1930) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1931) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1932) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1933) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1934) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1935) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1936) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1937) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1938) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1939) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1940) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1941) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1942) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1943) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1944) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1945) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1946) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1947) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1948) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1949) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1950) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1951) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1952) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1953) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1954) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1955) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1956) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1957) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1958) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1959) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1960) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1961) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1962) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1963) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1964) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1965) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1966) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1967) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1968) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1969) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1970) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1971) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEmptyAppliedFunctionsEntryId(1972) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEmptyAppliedFunctionsEntryId(1973) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEmptyAppliedFunctionsEntryId(1974) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEmptyAppliedFunctionsEntryId(1975) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEmptyAppliedFunctionsEntryId(1976) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEmptyAppliedFunctionsEntryId(1977) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEmptyAppliedFunctionsEntryId(1978) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEmptyAppliedFunctionsEntryId(1979) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEmptyAppliedFunctionsEntryId(1980) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEmptyAppliedFunctionsEntryId(1981) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[GroupEmptyAppliedFunctionsEntryId] = SealedList.list[GroupEmptyAppliedFunctionsEntryId].sortBy(_.id)

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