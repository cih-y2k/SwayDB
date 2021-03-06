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

package swaydb.core.util

trait Benchmark {

  def benchmark[R](message: String)(benchmarkThis: => R): R = {
    println(s"Started benchmark: $message.")
    val startTime = System.nanoTime()
    val result = benchmarkThis
    val endTime = System.nanoTime()
    println(((endTime - startTime) / 1000000000.0: Double) + " seconds.")
    println
    result
  }
}

object Benchmark extends Benchmark {
  def apply[R](message: String)(benchmarkThis: => R): R =
    benchmark[R](message)(benchmarkThis)
}