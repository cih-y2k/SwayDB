package swaydb.core.data

import scala.concurrent.duration.Deadline
import swaydb.data.slice.Slice

sealed trait UpdateCommand

object UpdateCommand {
  case class Set(id: Slice[Byte], value: Option[Slice[Byte]]) extends UpdateCommand
  case class Apply(id: Slice[Byte], function: Slice[Byte]) extends UpdateCommand
}
