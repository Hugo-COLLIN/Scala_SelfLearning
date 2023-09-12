object Currying {
  //Currying: Transform a multiple arguments function into a single argument function

  def add (x:Int, y:Int) = x + y
  def add2 (x:Int) = (y:Int) => x + y  //Curryied function
  def add3 (x:Int) (y:Int) = x + y            //Currying simpler syntax

  def main(args: Array[String]): Unit = {
    println(add(20, 10))
    println(add2(20)(10)) //Curryied function

    val sum40 = add2(40)
    println(sum40(100))

    println(add3(100)(200))
    val sum50 = add3(50)_ // the underscore means later argument
    println(sum50(300))

  }
}

// Source: https://youtu.be/YEudoVTR02o?si=j0Y_70ILk0PrUrGl