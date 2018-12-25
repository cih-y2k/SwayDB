
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
sealed abstract class GroupEntryId(override val id: Int) extends EntryId(id)
object GroupEntryId extends GeneratedEntryId {

  override val emptyMeta: EntryId.Meta.Empty = GroupEntryId.EmptyMeta
  override val nonEmptyMeta: EntryId.Meta.NonEmpty = GroupEntryId.NonEmptyMeta

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
            case object NoDeadline extends GroupEntryId(1321) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1322) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1323) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1324) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1325) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1326) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1327) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1328) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1329) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1330) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1331) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1332) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1333) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1334) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1335) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1336) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1337) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1338) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1339) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1340) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1341) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1342) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1343) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1344) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1345) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1346) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1347) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1348) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1349) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1350) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1351) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1352) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1353) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1354) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1355) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1356) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1357) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1358) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1359) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1360) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1361) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1362) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1363) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1364) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1365) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1366) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1367) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1368) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1369) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1370) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1371) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1372) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1373) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1374) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1375) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1376) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1377) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1378) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1379) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1380) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1381) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1382) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1383) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1384) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1385) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1386) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1387) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1388) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1389) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1390) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1391) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1392) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1393) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1394) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1395) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1396) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1397) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1398) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1399) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1400) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1401) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1402) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1403) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1404) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1405) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1406) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1407) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1408) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1409) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1410) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1411) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1412) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1413) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1414) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1415) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1416) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1417) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1418) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1419) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1420) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1421) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1422) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1423) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1424) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1425) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1426) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1427) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1428) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1429) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1430) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1431) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1432) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1433) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1434) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1435) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1436) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1437) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1438) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1439) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1440) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1441) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1442) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1443) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1444) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1445) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1446) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1447) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1448) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1449) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1450) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1451) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1452) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1453) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1454) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1455) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1456) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1457) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1458) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1459) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1460) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1461) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1462) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1463) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1464) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1465) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1466) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1467) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1468) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1469) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1470) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1471) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1472) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1473) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1474) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1475) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1476) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1477) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1478) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1479) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1480) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1481) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1482) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1483) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1484) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1485) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1486) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1487) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1488) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1489) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1490) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1491) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1492) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1493) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1494) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1495) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1496) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1497) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1498) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1499) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1500) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1501) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1502) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1503) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1504) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1505) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1506) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1507) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1508) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1509) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1510) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1511) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1512) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1513) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1514) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1515) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1516) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1517) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1518) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1519) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1520) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(1521) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(1522) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(1523) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(1524) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(1525) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(1526) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(1527) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(1528) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(1529) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(1530) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(1531) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(1532) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(1533) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(1534) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(1535) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(1536) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(1537) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(1538) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(1539) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(1540) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1541) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1542) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1543) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1544) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1545) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1546) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1547) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1548) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1549) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1550) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1551) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1552) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1553) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1554) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1555) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1556) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1557) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1558) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1559) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1560) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1561) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1562) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1563) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1564) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1565) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1566) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1567) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1568) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1569) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1570) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1571) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1572) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1573) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1574) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1575) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1576) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1577) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1578) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1579) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1580) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1581) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1582) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1583) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1584) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1585) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1586) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1587) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1588) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1589) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1590) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1591) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1592) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1593) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1594) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1595) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1596) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1597) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1598) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1599) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1600) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1601) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1602) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1603) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1604) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1605) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1606) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1607) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1608) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1609) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1610) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1611) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1612) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1613) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1614) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1615) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1616) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1617) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1618) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1619) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1620) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1621) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1622) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1623) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1624) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1625) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1626) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1627) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1628) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1629) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1630) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1631) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1632) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1633) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1634) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1635) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1636) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1637) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1638) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1639) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1640) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1641) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1642) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1643) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1644) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1645) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1646) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1647) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1648) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1649) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1650) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1651) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1652) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1653) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1654) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1655) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1656) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1657) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1658) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1659) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1660) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1661) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1662) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1663) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1664) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1665) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1666) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1667) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1668) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1669) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1670) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1671) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1672) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1673) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1674) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1675) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1676) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1677) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1678) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1679) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1680) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1681) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1682) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1683) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1684) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1685) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1686) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1687) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1688) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1689) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1690) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1691) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1692) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1693) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1694) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1695) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1696) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1697) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1698) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1699) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1700) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1701) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1702) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1703) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1704) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1705) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1706) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1707) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1708) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1709) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1710) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1711) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1712) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1713) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1714) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1715) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1716) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1717) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1718) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1719) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1720) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1721) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1722) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1723) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1724) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1725) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1726) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1727) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1728) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1729) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1730) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1731) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1732) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1733) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1734) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1735) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1736) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1737) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1738) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1739) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1740) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(1741) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(1742) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(1743) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(1744) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(1745) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(1746) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(1747) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(1748) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(1749) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(1750) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(1751) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(1752) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(1753) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(1754) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(1755) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(1756) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(1757) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(1758) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(1759) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(1760) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1761) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1762) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1763) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1764) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1765) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1766) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1767) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1768) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1769) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1770) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1771) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1772) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1773) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1774) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1775) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1776) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1777) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1778) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1779) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1780) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1781) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1782) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1783) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1784) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1785) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1786) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1787) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1788) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1789) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1790) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1791) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1792) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1793) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1794) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1795) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1796) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1797) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1798) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1799) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1800) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1801) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1802) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1803) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1804) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1805) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1806) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1807) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1808) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1809) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1810) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1811) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1812) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1813) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1814) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1815) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1816) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1817) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1818) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1819) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1820) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1821) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1822) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1823) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1824) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1825) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1826) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1827) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1828) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1829) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1830) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1831) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1832) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1833) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1834) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1835) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1836) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1837) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1838) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1839) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1840) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1841) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1842) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1843) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1844) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1845) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1846) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1847) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1848) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1849) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1850) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1851) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1852) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1853) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1854) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1855) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1856) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1857) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1858) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1859) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1860) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1861) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1862) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1863) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1864) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1865) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1866) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1867) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1868) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1869) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1870) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1871) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1872) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1873) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1874) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1875) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1876) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1877) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1878) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1879) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1880) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1881) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1882) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1883) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1884) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1885) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1886) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1887) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1888) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1889) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1890) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1891) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1892) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1893) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1894) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1895) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1896) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1897) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1898) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1899) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1900) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1901) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1902) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1903) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1904) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1905) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1906) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1907) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1908) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1909) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1910) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1911) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1912) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1913) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1914) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1915) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1916) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1917) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1918) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1919) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1920) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1921) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1922) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1923) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1924) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1925) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1926) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1927) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1928) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1929) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1930) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1931) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1932) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1933) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1934) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1935) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1936) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1937) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1938) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1939) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1940) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1941) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1942) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1943) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1944) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1945) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1946) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1947) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1948) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1949) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1950) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1951) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1952) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1953) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1954) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1955) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1956) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1957) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1958) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1959) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1960) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(1961) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(1962) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(1963) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(1964) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(1965) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(1966) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(1967) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(1968) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(1969) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(1970) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(1971) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(1972) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(1973) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(1974) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(1975) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(1976) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(1977) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(1978) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(1979) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(1980) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1981) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1982) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1983) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1984) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1985) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1986) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1987) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1988) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1989) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1990) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1991) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1992) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1993) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1994) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1995) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1996) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1997) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1998) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1999) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2000) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2001) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2002) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2003) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2004) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2005) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2006) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2007) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2008) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2009) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2010) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2011) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2012) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2013) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2014) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2015) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2016) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2017) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2018) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2019) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2020) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2021) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2022) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2023) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2024) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2025) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2026) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2027) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2028) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2029) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2030) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2031) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2032) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2033) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2034) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2035) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2036) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2037) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2038) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2039) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2040) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2041) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2042) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2043) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2044) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2045) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2046) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2047) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2048) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2049) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2050) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2051) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2052) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2053) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2054) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2055) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2056) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2057) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2058) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2059) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2060) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2061) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2062) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2063) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2064) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2065) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2066) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2067) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2068) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2069) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2070) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2071) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2072) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2073) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2074) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2075) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2076) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2077) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2078) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2079) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2080) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2081) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2082) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2083) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2084) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2085) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2086) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2087) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2088) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2089) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2090) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2091) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2092) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2093) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2094) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2095) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2096) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2097) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2098) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2099) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2100) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2101) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2102) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2103) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2104) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2105) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2106) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2107) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2108) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2109) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2110) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2111) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2112) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2113) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2114) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2115) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2116) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2117) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2118) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2119) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2120) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2121) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2122) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2123) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2124) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2125) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2126) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2127) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2128) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2129) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2130) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2131) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2132) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2133) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2134) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2135) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2136) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2137) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2138) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2139) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2140) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2141) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2142) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2143) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2144) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2145) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2146) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2147) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2148) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2149) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2150) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2151) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2152) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2153) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2154) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2155) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2156) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2157) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2158) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2159) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2160) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2161) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2162) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2163) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2164) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2165) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2166) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2167) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2168) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2169) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2170) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2171) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2172) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2173) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2174) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2175) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2176) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2177) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2178) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2179) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2180) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(2181) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(2182) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(2183) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(2184) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(2185) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(2186) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(2187) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(2188) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(2189) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(2190) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(2191) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(2192) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(2193) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(2194) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(2195) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(2196) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(2197) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(2198) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(2199) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(2200) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2201) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2202) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2203) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2204) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2205) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2206) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2207) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2208) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2209) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2210) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2211) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2212) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2213) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2214) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2215) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2216) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2217) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2218) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2219) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2220) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2221) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2222) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2223) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2224) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2225) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2226) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2227) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2228) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2229) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2230) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2231) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2232) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2233) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2234) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2235) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2236) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2237) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2238) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2239) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2240) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2241) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2242) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2243) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2244) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2245) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2246) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2247) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2248) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2249) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2250) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2251) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2252) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2253) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2254) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2255) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2256) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2257) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2258) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2259) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2260) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2261) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2262) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2263) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2264) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2265) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2266) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2267) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2268) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2269) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2270) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2271) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2272) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2273) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2274) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2275) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2276) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2277) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2278) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2279) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2280) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2281) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2282) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2283) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2284) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2285) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2286) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2287) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2288) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2289) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2290) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2291) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2292) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2293) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2294) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2295) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2296) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2297) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2298) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2299) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2300) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2301) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2302) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2303) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2304) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2305) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2306) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2307) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2308) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2309) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2310) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2311) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2312) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2313) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2314) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2315) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2316) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2317) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2318) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2319) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2320) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2321) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2322) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2323) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2324) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2325) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2326) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2327) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2328) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2329) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2330) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2331) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2332) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2333) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2334) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2335) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2336) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2337) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2338) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2339) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2340) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2341) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2342) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2343) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2344) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2345) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2346) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2347) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2348) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2349) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2350) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2351) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2352) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2353) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2354) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2355) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2356) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2357) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2358) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2359) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2360) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2361) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2362) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2363) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2364) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2365) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2366) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2367) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2368) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2369) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2370) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2371) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2372) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2373) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2374) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2375) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2376) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2377) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2378) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2379) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2380) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2381) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2382) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2383) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2384) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2385) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2386) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2387) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2388) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2389) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2390) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2391) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2392) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2393) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2394) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2395) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2396) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2397) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2398) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2399) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2400) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(2401) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(2402) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(2403) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(2404) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(2405) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(2406) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(2407) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(2408) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(2409) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(2410) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(2411) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(2412) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(2413) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(2414) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(2415) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(2416) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(2417) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(2418) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(2419) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(2420) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2421) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2422) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2423) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2424) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2425) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2426) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2427) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2428) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2429) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2430) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2431) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2432) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2433) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2434) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2435) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2436) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2437) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2438) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2439) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2440) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2441) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2442) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2443) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2444) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2445) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2446) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2447) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2448) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2449) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2450) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2451) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2452) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2453) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2454) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2455) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2456) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2457) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2458) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2459) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2460) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2461) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2462) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2463) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2464) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2465) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2466) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2467) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2468) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2469) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2470) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2471) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2472) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2473) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2474) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2475) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2476) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2477) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2478) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2479) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2480) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2481) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2482) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2483) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2484) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2485) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2486) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2487) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2488) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2489) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2490) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2491) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2492) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2493) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2494) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2495) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2496) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2497) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2498) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2499) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2500) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2501) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2502) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2503) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2504) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2505) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2506) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2507) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2508) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2509) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2510) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2511) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2512) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2513) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2514) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2515) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2516) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2517) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2518) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2519) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2520) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2521) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2522) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2523) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2524) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2525) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2526) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2527) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2528) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2529) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2530) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2531) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2532) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2533) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2534) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2535) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2536) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2537) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2538) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2539) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2540) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2541) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2542) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2543) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2544) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2545) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2546) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2547) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2548) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2549) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2550) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2551) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2552) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2553) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2554) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2555) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2556) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2557) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2558) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2559) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2560) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2561) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2562) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2563) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2564) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2565) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2566) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2567) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2568) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2569) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2570) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(2571) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2572) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2573) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2574) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2575) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2576) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2577) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2578) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2579) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(2580) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(2581) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2582) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2583) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2584) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2585) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2586) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2587) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2588) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2589) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(2590) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(2591) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2592) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2593) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2594) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2595) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2596) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2597) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2598) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2599) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(2600) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(2601) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(2602) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2603) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2604) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(2605) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2606) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(2607) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2608) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2609) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(2610) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(2611) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(2612) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(2613) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(2614) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(2615) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(2616) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(2617) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(2618) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(2619) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(2620) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(2621) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(2622) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(2623) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(2624) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(2625) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(2626) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(2627) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(2628) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(2629) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(2630) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(2631) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(2632) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(2633) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(2634) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(2635) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(2636) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(2637) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(2638) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(2639) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(2640) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[GroupEntryId] = SealedList.list[GroupEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}
