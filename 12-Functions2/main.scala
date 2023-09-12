object ScalaFunctions2 {
  object Math {
    // default values for parameters
    def +(x: Int = 45, y: Int = 15): Int = {
      x + y
    }
    def **(x: Int) = x*x
  }

  def print(x: Int, y:Int): Unit = { // Unit when no value returned
    println(x+y)
  }

  def main(args: Array[String]): Unit = {
    //Anonymous function
    var add = (x: Int, y: Int) => x+y

    println(Math.+())
    println(Math.+(52))
    println(Math ** 3)

    print(6,9)

    println(add(500, 300))
  }
  // default operators (+ - etc.) are functions in Scala
}

// Source: https://youtu.be/CHc_hzNKYOI?si=bPDqD1LtAD5G8WlB