package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, val age: Int, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", this.age, favoriteMovie)
    def unary_! : String = s"$name, what the heck!"
    def unary_+ : Person = new Person(s"$name", age+1, favoriteMovie)
    def isAlive: Boolean = true
    def learn: String = s"$name learns Scala"
    def apply(): String = s"Hi, my name is $name, I am $age years old and i like $favoriteMovie"
    def apply(n: Int): String = s"$name watch $favoriteMovie $n times"
  }

  val mary = new Person("Mary", 20, "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  //infix notation = operator notation (syntactic sugar)
  //Method with the single parameter can be used in infix notation

  // "operators" in Scala
  val tom = new Person("Tom", age=30, "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  //All operators are methods.

  //prefix notation

  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_prefix only works with -, +, ~, !
  println(!mary)
  println(mary.unary_!)

  //Postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //Apply
  println(mary.apply())
  println(mary()) // equivalent


  /*
  1. Overload the + operator
   mary + "the rockstar" => new person "Mary (the rockstar)",
  2. Add an age to Person class
   Add a unary + operator => new person with the age + 1
   +mary => mary with the age incrementer
  3. Add "learns" method in the Person class => mary learns scala"
   Add a learnsScala method, calls learns method with "Scala"
   Use it in postfix notation.
  4. Overload the apply method
   mary.apply(2) => "Marry watched inception 2 times"
   */
  //Solution 1
  println((mary + "the rockstar")())
  println((mary + "the rockstar").apply())

  //Solution 2
  val new_mary = +mary
  println(new_mary.age)

  //Solution 3
  print(mary learn)

  //Solution 4
  println(mary.apply(2))
}

