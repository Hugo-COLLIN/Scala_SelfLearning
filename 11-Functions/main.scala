object ScalaFunctions {

  def add(x:Int, y:Int):Int = {
    return x + y
  }

  def sub(x: Int, y: Int): Int = {
    x - y
  }

  def mult(x: Int, y: Int): Int = x * y

  def div(x: Int, y: Int) = x / y

  object Math {
    def hello(x: Int, y: String): Unit = {
      println(s"Hello: $x $y")
    }

    def square(x: Int) = x*x
  }

  def main(args: Array[String]): Unit = {
    println(add(3,2))
    println(sub(3,2))
    println(mult(3,2))
    println(div(3,2))

    println(Math.hello(3, "Blu"))
    println(Math.square(3))
    println(Math square 3)  //sugar syntax, only when 1 argument
  }
}

// Source: https://youtu.be/GuGRsmuczWU?si=MqLY0dau8jL8-uiB