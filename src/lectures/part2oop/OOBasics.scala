package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()


  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc(5).print
  counter.dec(10).print
}

// constructor
class Person(name: String, val age: Int = 0)  {
  // body,
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")


}

// class parameters are NOT FIELDS

/*
Novel and a Writer
Writer: first name, surname, year
-method fullname

Novel: name, year of release, author
-method authorAge, isWrittenBy(author), copy(new year of release) = new instance of Novel

 */

class Writer(firstName: String, surname: String, val year: Int) {
  def FullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Int = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newyear: Int): Novel = new Novel(name, newyear, author)
}


/*
Counter class
-receives an int value
-method current count
-method to increment/decrement -> new counter
-overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  } // immutability

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }
  def print = println(count)
}
