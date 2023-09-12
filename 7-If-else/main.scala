object Demo {
  def main(args: Array[String]): Unit = {
    val x = 20
    val y = 30
    var res = ""

    // Short if-else
    if (x == 20 && y <= 30)
      println("x is equal to 20")
    else
      println("x is NOT equal to 20")

    //If-else with blocks
    if (x == 20 || y > 30) {
      res = "x is equal to 20"
    } else {
      res = "x is NOT equal to 20"
    }
    println(res)

    // Single line evaluation (ternary operator?)
    val res2 = if(x == 20) "x is equal to 20" else "x is NOT equal to 20"
    println(res2)

    //Inside the println
    println(if(x == 20) "x is equal to 20" else "x is NOT equal to 20")


  }
}

// Source: https://youtu.be/JYDhVgKfauk?si=WkNtrz3C_CZVBmW8