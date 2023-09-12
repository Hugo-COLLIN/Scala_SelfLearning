import java.util.Date

object Closures {
  //Closure: Function that uses variables declared outside this function

  /*
    Pural closure: vars used in the closure can't be changed (it's a val)
    Impural closure: vars used in the closure can be changed (it's a var)
   */

  private var num = 10
  val add = (x:Int) => x + num // impural closure because num is var

  val addNum = (x:Int) => {
    num = x + num
    num
  }

  def main(args: Array[String]): Unit = {
    println(add(20))

    num = 100
    println(add(20)) // new value of num is used in the function

    println(addNum(30))
    println(addNum(30))
  }
}

// Source: https://youtu.be/Be6HXqHrU-s?si=1i-qPBfidHER1us1