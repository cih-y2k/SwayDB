package swaydb.core.segment.format.one.entry.reader

import scala.util.Try
import swaydb.core.data.{AppliedFunctions, UpdateFunctions}
import swaydb.data.slice.Slice

object MetaBlock {

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

  def updateFunction(updateFunctionBytes: Slice[Byte]): Try[MetaBlock] =
    UpdateFunctions.read(updateFunctionBytes) map {
      updateFunctions =>
        new MetaBlock(
          updateFunctions = updateFunctions,
          appliedFunctions = AppliedFunctions.empty
        )
    }

  def appliedFunction(appliedFunctionBytes: Slice[Byte]): Try[MetaBlock] =
    AppliedFunctions.read(appliedFunctionBytes) map {
      appliedFunctions =>
        new MetaBlock(
          updateFunctions = UpdateFunctions.empty,
          appliedFunctions = appliedFunctions
        )
    }
}

case class MetaBlock(updateFunctions: UpdateFunctions,
                     appliedFunctions: AppliedFunctions)
