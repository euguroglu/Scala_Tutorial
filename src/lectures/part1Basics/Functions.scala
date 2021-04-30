package lectures.part1Basics

// extends App added to
object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction()) //parameterless functions can be defined without parenthesis

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  println(aFunctionWithSideEffects("Hello"))

  //Exercises

  /*
      1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
      2. Factorial function 1 * 2* 3 * .. * n
      3. A Fibonacci function
       f(1) = 1
       f(2) = 1
       f(n) = f(n - 1) + f(n - 2)
      4. Tests if a number is prime.
  */
  // Solution 1
  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(aGreetingFunction("Enes", 32))

  // Solution 2
  def aFactorialFunction(anInteger: Int): Int = {
    if (anInteger == 1 || anInteger == 0) 1
    else anInteger * aFactorialFunction(anInteger - 1: Int)
  }

  println(aFactorialFunction(4))

  // Solution 3
  def aFibonacciFunction(anInteger: Int): Int = {
    if (anInteger == 1 || anInteger == 2) 1
    else aFibonacciFunction(anInteger - 1) + aFibonacciFunction(anInteger - 2)
  }

  print(aFibonacciFunction(8))

  // Solution 4
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
