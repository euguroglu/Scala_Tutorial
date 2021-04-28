package part1Basics

object Expressions extends App{

  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>(right shift with zero extension)

  println(1 == x)
  // == != > >= <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= += /=
  println(aVariable)

  // Instructions (Do) vs Expressions (Value)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //if expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
 // Never use while loops in scala
 // Everything in scala is an expression

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  //side effects: println(), whiles, reassiging

  //Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  println(aCodeBlock)
 // val anotherValue = z + 1 (z is not visible outside above code block)
 // So this expression gives error

 //1.Differences between "hello world" vs println("hello world") ?
 //2.

  val someValue = {
    2 < 3
  }
  println(someValue)
  val someOtherValue = {
    if(someValue) 239 else 984
    42
  }
  println(someOtherValue)
}
