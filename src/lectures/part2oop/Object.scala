package lectures.part2oop

object Object extends App {

  // Scala does not have class level functionality ("static")

  //COMPANIONS
  object Person { // TYPE + its only instance
    // Class level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    // or we can use apply instead of from then we can direcly call person like method
    def from(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // Instance level functionality
  }


  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = Person
  val john = Person
  val osman = new Person("osman")
  val ayse = new Person("ayse")
  println(mary == john)
  println(osman == ayse)

  val Bobbie = Person.from(osman, ayse)
  //val Bobbie = Person(osman, ayse) if we use .appy() method

  //Scala Applications
  //def main(args: Array[String]): Unit
}
