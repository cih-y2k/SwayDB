package swaydb.core.function

import swaydb.core.data.UpdateFunction
import swaydb.data.slice.Slice

trait CacheFunction {
  def get(functionId: Slice[Byte]): Option[UpdateFunction]
}

object CacheFunction {

  def

}
