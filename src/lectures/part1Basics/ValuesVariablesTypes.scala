package lectures.part1Basics

object ValuesVariablesTypes extends App {

  val x = 42
  //val x: int = 42 can be used if we dont compiler will infer for ourselves.
  println(x)

  // Vals are immutable

  // Compiler can infer types

  val aString: String = "Hello"
  val anotherstring = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4612
  val aLong: Long = 4627253434343L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables

  var aVariable: Int = 4

  aVariable = 5 // side effects

}
