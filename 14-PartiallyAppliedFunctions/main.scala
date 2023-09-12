import java.util.Date

object PartiallyAppliedFunctions {
  def main(args: Array[String]): Unit = {
    val sum = (a:Int, b:Int,c:Int) => a + b + c

    //Partially applied function : use wildcard
    val f = sum(10, 20, _:Int)
    val g = sum(10, _:Int, _:Int)

    println(sum(10,20,30))

    println(f(35))
    println(g(40, 60))

    //------
    val date = new Date
    val newLog = log(date, _:String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")
  }

  //Real-life example
  def log(date: Date, message:String) = {
    println(s"$date   $message")
  }
}

// Source: https://youtu.be/afOjfMiicxI?si=ITEc-W2FZgS4rKon