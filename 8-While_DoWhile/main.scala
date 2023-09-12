object WhileDoWhile {
  def main(args: Array[String]): Unit = {
    var x = 0
    var y = 0

    // While loop
    while (x < 10) {
      println(s"x = $x")
      x += 1
    }


    // Do-while loop, code executed at least once, even if the condition is false
    do {
      println(s"y = $y")
      y += 1
    } while(y < 10)
  }
}

// Source: https://youtu.be/LzL9EPrwGZA?si=kA14wW1BGT3yKhkE