package part1Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion  extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))

  // This approach has side effects because all factorial
  // numbers will be kept in the memory which will limit our recursive iteration number
  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION
    // Use recursive call as the last expression we can put @tailrec beginning of the function to
    // and compiler wil warn us if code is not tail recursive
    factorialHelper(n, 1)
  }

  println(anotherFactorial(5000))
  // When you need loops use tail recursion

  /*
  1. Concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive
   */
  // Solution 1

    def ConcatFunc(n: Int, aString: String): String = {
      def ConcatHelper(x: Int, accumulator: String): String =
        if (x == 1) accumulator
        else ConcatHelper(x - 1, accumulator + " " + accumulator)

      ConcatHelper(n, aString)
  }
  println(ConcatFunc(2, "HELLO"))

  // Solution 1- alternative
  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n-1, aString + accumulator)

  println(concatenateTailRec("hello", 3, ""))

  // Solution 2

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }
println(isPrime(2003))

  // Solution 3

  def aFibonacciFunctionRec(n: Int): Int = {
    def FibonacciHelper(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else FibonacciHelper(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else FibonacciHelper(2, 1, 1)
  }

  println(aFibonacciFunctionRec(8))


}
