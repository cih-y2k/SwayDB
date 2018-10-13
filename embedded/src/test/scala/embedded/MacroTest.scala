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

package embedded

import swaydb.SwayDB
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._

object MacroTest extends App {
  //  val outputDir =
  //    Paths.get(System.getProperty("user.dir")).resolve("functions")
  //
  //  val settings = new Settings(System.err.println)
  //  val out = settings.outdir.tryToSet(List(outputDir.toString))
  //  println("out.size: " + out.size)
  //  out foreach println

  val db = SwayDB.memory[Slice[Byte], Slice[Byte]]().get

  //  (1 to 10) foreach {
  //    i =>
  //      db.put(i, i.toString).get
  //  }

//  db.put(1, "Hello 1").get
//  db.put(2, "Hello 2").get
//  db.put(3, "Hello 3").get
//
//  println(db.get(1).get)
//  println(db.get(2).get)
//  println(db.get(3).get)

  val subMap = db.subMap(11, 20).get
  val subMap2 = subMap.subMap(22, 40).get

//  subMap.put(4, "four").get
//
//  println(db.get(4).get)
//
//  println(subMap.getKey(4))

  //  println(subMap.get(4).get)

  subMap foreach println

  //  import scala.meta._
  //
  //  val code = "1 + _"
  //
  //  FunctionCompiler.compileFunction(code, Some(Seq("Int")), "Int").get
  //
  //  val function = "input => input + 1"
  //
  //  println(code.parse[Stat].get.structure)

}