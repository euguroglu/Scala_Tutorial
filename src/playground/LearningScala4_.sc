// Data structures

// Tuples
// Immutable lists

val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
println(captainStuff)

// Refer to the individual fields with a ONE-BASED index
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val pricardsShip = "Picard" -> "Enterprise-D"
println(pricardsShip._2)

val aBunchOfStuff = ("Kirk", 1964, true)

// Lists
// Like a tuple but more functionality
// Must be of same type

val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")

println(shipList(1))
// zero-based
println(shipList(0))

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {println(ship)}

val backwardShip = shipList.map( (ship:String) => {ship.reverse})
for (ship <- backwardShip) {println(ship)}

// reduce() to combine together all the items in a collection using some function ve provide

val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce( (x: Int, y: Int) => x + y)
println(sum)

// filter() remove stuff

val iHateFives = numberList.filter( (x: Int) => x!= 5)

val iHateThrees = numberList.filter(_ != 3)

// Concanate lists

val moreNumbers = List(6, 7, 8)
val lotsOfNumvers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted = reversed.sorted
val lotsOfDuplicates = numberList ++ numberList
val distinctValues = lotsOfDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasThree = iHateThrees.contains(3)

// Maps
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine")
println(shipMap("Picard"))
println(shipMap.contains("Archer"))
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archersShip)

// Exercise
/*
Create a list of the numbers 1-20 your job is to print out numbers
that are evenly divisible by three Scala's modula operator like other
languages is %, which gives you the reaminder after division. Do this
first by iterating through all the items in the list and testing each
one as you go, Then do it again by using a filter function on the list
instead
 */

val exerciseList = (1 to 20 toList)
for (i <- exerciseList) {
  if (i%3==0) println(i)
}

// example val iHateFives = numberList.filter( (x: Int) => x!= 5)

println(exerciseList.filter( (x: Int) => x%3==0))