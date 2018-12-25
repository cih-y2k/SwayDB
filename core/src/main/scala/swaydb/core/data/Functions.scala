package swaydb.core.data

import scala.util.{Success, Try}
import swaydb.core.util.Bytes
import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice

sealed trait Functions {
  def functions: Seq[Slice[Byte]]
}

object Functions {
  def write(bytes: Seq[Slice[Byte]]): Slice[Byte] =
    Bytes.write(bytes)

  def write(functions: Functions): Slice[Byte] =
    Bytes.write(functions.functions)

  def requiredBytes(appliedFunctions: Functions): Int =
    Bytes.sizeOf(appliedFunctions.functions)

  implicit class AppliedFunctionsImplicits(functions: Functions) {
    def toBytes(): Slice[Byte] =
      Functions.write(functions)

    def requiredBytes(): Int =
      Functions.requiredBytes(functions)

    def nonEmpty =
      functions.functions.nonEmpty

    def isEmpty =
      functions.functions.isEmpty

  }
}

object AppliedFunctions {
  val empty =
    AppliedFunctions(Seq.empty)

  val emptySuccess =
    Success(empty)

  def read(bytes: Slice[Byte]): Try[AppliedFunctions] =
    Bytes.readSeq(bytes) map (new AppliedFunctions(_))
}

case class AppliedFunctions(functions: Seq[Slice[Byte]]) extends Functions {
  def unslice(): AppliedFunctions =
    AppliedFunctions(functions.unslice())

  def ++(other: AppliedFunctions): AppliedFunctions =
    AppliedFunctions(functions ++ other.functions)

  def existsOne(other: AppliedFunctions)(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
    import keyOrder._
    functions.exists(function => other.functions.exists(_ equiv function))
  }
}

object UpdateFunctions {
  val empty =
    UpdateFunctions(Seq.empty)

  val emptySuccess =
    Success(empty)

  def read(bytes: Slice[Byte]): Try[UpdateFunctions] =
    Bytes.readSeq(bytes) map (new UpdateFunctions(_))
}

case class UpdateFunctions(functions: Seq[Slice[Byte]]) extends Functions {
  def ++(other: UpdateFunctions): UpdateFunctions =
    UpdateFunctions(functions ++ other.functions)

  def unslice(): UpdateFunctions =
    UpdateFunctions(functions.unslice())

  def existsOne(other: UpdateFunctions)(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
    import keyOrder._
    functions.exists(function => other.functions.exists(_ equiv function))
  }
}
