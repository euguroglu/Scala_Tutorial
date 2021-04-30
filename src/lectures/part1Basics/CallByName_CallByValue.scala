package lectures.part1Basics

object CallByName_CallByValue extends App {

  def calledByValue(x: Long): Unit = {
    println("by value:" + x)
    println("by value:" + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name:" + x)
    println("by name:" + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
  Difference explanied below:
    println(171099420628300)
    println(171099420628300)

    println(System.nanoTime())
    println(System.nanoTime())
   */

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())
}
