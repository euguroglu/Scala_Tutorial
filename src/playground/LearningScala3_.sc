// Functions

// Format def <function name> (parameter name: type..) : return type = { }

def squareIt (x: Int): Int = {
  x * x
}

def cubeIt (x: Int): Int = {
  x * x * x
}

println(squareIt(3))
println(cubeIt(3))

def transformInt(x: Int, f: Int => Int): Int = {
  f(x)
}

val result = transformInt(2, cubeIt)

transformInt(3, x => x * x * x)

transformInt(10, x => x / 2)

transformInt(2, x => {val y = x * 2; y * y})

def toUpper(x: String): String = {
  x.toUpperCase()
}

println(toUpper("hello"))

def toUpper2(x: String, f: String => String): String = {
  f(x)
}

toUpper2("hayda", x => x.toUpperCase())