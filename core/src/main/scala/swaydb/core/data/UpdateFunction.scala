package swaydb.core.data

import scala.concurrent.duration.Deadline
import swaydb.data.slice.Slice

sealed trait UpdateFunction
object UpdateFunction {
  case class KeyToValue(f: (Slice[Byte], Option[Deadline]) => (Option[Slice[Byte]], Option[Deadline])) extends UpdateFunction
  case class KeyValueToValue(f: (Slice[Byte], Option[Slice[Byte]], Option[Deadline]) => (Option[Slice[Byte]], Option[Deadline])) extends UpdateFunction
}
