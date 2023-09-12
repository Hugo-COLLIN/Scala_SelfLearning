object HigherOrderFunctions {
  // HigherOrderFunctions = Function that (manipulate) take and return functions

  def math(x:Double, y:Double, f: (Double, Double) => Double): Double = f(x, y)

  def math2(x:Double, y:Double, z:Double, f: (Double, Double) => Double): Double = f(f(x, y),z)

  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x,y)=>x+y)
    println(result)

    println(math(50, 20, (x,y)=>x*y))
    println(math(50, 20, (x,y)=>x max y))
    println(math(50, 20, (x,y)=>x min y))

    println(math2(50, 20, 10, (x,y)=>x+y))
    println(math2(50, 20, 10, _+_)) // _ is a Wildcard => first + second argument
    println(math2(50, 20, 10, _ max _)) // _ is a Wildcard => first + second argument

  }
}

// Source: https://youtu.be/ohKDVmCMKEg?si=sE6OTJb87mDollnt