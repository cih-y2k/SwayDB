package swaydb.core.segment.format.one.entry.reader

import scala.util.{Success, Try}
import swaydb.core.data.{AppliedFunctions, UpdateFunctions}
import swaydb.core.util.Bytes
import swaydb.data.slice.Slice

object MetaBlock {

  val empty =
    MetaBlock(
      updateFunctions = UpdateFunctions.empty,
      appliedFunctions = AppliedFunctions.empty
    )

  val emptySuccess =
    Success(empty)

  /**
    * When both updatedFunction and appliedFunctions exists.
    */
  val functionsMetaId: Int = 0
  /**
    * When only updatedFunctions exists.
    */
  val updatedFunctionMetaId: Int = 1
  /**
    * When only appliedFunctions exists.
    */
  val appliedFunctionMetaId: Int = 2

  def apply(updateFunctionBytes: Slice[Byte],
            appliedFunctionsBytes: Slice[Byte]): Try[MetaBlock] =
    UpdateFunctions.read(updateFunctionBytes) flatMap {
      updateFunctions =>
        AppliedFunctions.read(appliedFunctionsBytes) map {
          appliedFunctions =>
            new MetaBlock(
              updateFunctions = updateFunctions,
              appliedFunctions = appliedFunctions
            )
        }
    }

  def readUpdateFunction(updateFunctionBytes: Slice[Byte]): Try[MetaBlock] =
    UpdateFunctions.read(updateFunctionBytes) map {
      updateFunctions =>
        new MetaBlock(
          updateFunctions = updateFunctions,
          appliedFunctions = AppliedFunctions.empty
        )
    }

  def readAppliedFunction(appliedFunctionBytes: Slice[Byte]): Try[MetaBlock] =
    AppliedFunctions.read(appliedFunctionBytes) map {
      appliedFunctions =>
        new MetaBlock(
          updateFunctions = UpdateFunctions.empty,
          appliedFunctions = appliedFunctions
        )
    }

  def write(appliedFunctions: AppliedFunctions): Option[Slice[Byte]] =
    write(UpdateFunctions.empty, appliedFunctions)

  /**
    * NOTE: The [[sizeOf]] and [[write]] functions should produce the
    * same byte sized output.
    */
  def write(updateFunctions: UpdateFunctions,
            appliedFunctions: AppliedFunctions): Option[Slice[Byte]] =
    if (updateFunctions.nonEmpty && appliedFunctions.nonEmpty) {
      val updateFunctionRequiredBytes = updateFunctions.requiredBytes()
      val appliedFunctionsRequiredBytes = appliedFunctions.requiredBytes()

      val totalRequiredBytes =
        Bytes.sizeOf(functionsMetaId) + //format id bytes
          Bytes.sizeOf(updateFunctionRequiredBytes) +
          updateFunctionRequiredBytes +
          appliedFunctionsRequiredBytes

      //blockSize|id|updateFunctionSize|updateFunctionBytes|appliedFunctionsBytes

      val bytes =
        Slice
          .create[Byte](Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes) //also add the size of the block
          .addIntUnsigned(totalRequiredBytes)
          .addIntUnsigned(functionsMetaId)
          .addIntUnsigned(updateFunctionRequiredBytes)
          .addAll(updateFunctions.toBytes())
          .addAll(appliedFunctions.toBytes())

      Some(bytes)
    } else if (updateFunctions.nonEmpty) {
      val updateFunctionRequiredBytes = updateFunctions.requiredBytes()

      val totalRequiredBytes =
        Bytes.sizeOf(updatedFunctionMetaId) + //format id bytes
          updateFunctionRequiredBytes

      //blockSize|id|updateFunctionBytes

      val bytes =
        Slice
          .create[Byte](Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes) //also add the size of the block
          .addIntUnsigned(totalRequiredBytes)
          .addIntUnsigned(updatedFunctionMetaId)
          .addAll(updateFunctions.toBytes())

      Some(bytes)
    } else if (appliedFunctions.nonEmpty) {
      val appliedFunctionsRequiredBytes = appliedFunctions.requiredBytes()

      val totalRequiredBytes =
        Bytes.sizeOf(appliedFunctionMetaId) + //1 byte for the format
          appliedFunctionsRequiredBytes

      //blockSize|id|appliedFunctionsBytes

      val bytes =
        Slice
          .create[Byte](Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes)
          .addIntUnsigned(totalRequiredBytes)
          .addIntUnsigned(appliedFunctionMetaId)
          .addAll(appliedFunctions.toBytes())

      Some(bytes)
    } else {
      None
    }

  /**
    * NOTE: The [[sizeOf]] and [[write]] functions should produce the
    * same byte sized output.
    */
  def sizeOf(appliedFunctions: AppliedFunctions): Int =
    sizeOf(
      updateFunctions = UpdateFunctions.empty,
      appliedFunctions = appliedFunctions
    )

  /**
    * NOTE: The [[sizeOf]] and [[write]] functions should produce the
    * same byte sized output.
    */
  def sizeOf(updateFunctions: UpdateFunctions,
             appliedFunctions: AppliedFunctions): Int =
    if (updateFunctions.nonEmpty && appliedFunctions.nonEmpty) {
      val updateFunctionRequiredBytes = updateFunctions.requiredBytes()
      val appliedFunctionsRequiredBytes = appliedFunctions.requiredBytes()

      //blockSize|id|updateFunctionSize|updateFunctionBytes|appliedFunctionsBytes
      val totalRequiredBytes =
        Bytes.sizeOf(functionsMetaId) + //format id bytes
          Bytes.sizeOf(updateFunctionRequiredBytes) +
          updateFunctionRequiredBytes +
          appliedFunctionsRequiredBytes

      Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes
    } else if (updateFunctions.nonEmpty) {
      val updateFunctionRequiredBytes = updateFunctions.requiredBytes()

      //blockSize|id|updateFunctionBytes
      val totalRequiredBytes =
        Bytes.sizeOf(updatedFunctionMetaId) + //format id bytes
          updateFunctionRequiredBytes

      Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes
    } else if (appliedFunctions.nonEmpty) {
      val appliedFunctionsRequiredBytes = appliedFunctions.requiredBytes()

      val totalRequiredBytes =
        Bytes.sizeOf(appliedFunctionMetaId) + //1 byte for the format
          appliedFunctionsRequiredBytes

      //blockSize|id|appliedFunctionsBytes
      Bytes.sizeOf(totalRequiredBytes) + totalRequiredBytes
    } else {
      0
    }

}

case class MetaBlock(updateFunctions: UpdateFunctions,
                     appliedFunctions: AppliedFunctions)
