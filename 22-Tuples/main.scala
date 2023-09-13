object Tuples {
  //Tuples are immutable
  //A tuple can contain 1 to 22 elements

  val myTuple = (14, 2, "Hi", true)
  val myTuple2 = new Tuple3("yup", 43, false)
  val myTuple3 = new Tuple4(67, "hello", false, (2,3))

  def main(args: Array[String]): Unit = {
    println(myTuple)
    println(myTuple._3)
    println(myTuple._1)
    println(myTuple._2)
//    println(myTuple2._4) //Error

    // Iterate on each element of the tuple
    myTuple.productIterator.foreach {
      i => println(i)
    }

    println(1 -> "Tom")
    println(1 -> "Tom" -> true) //((1,Tom),true)
    println(myTuple3._3)
    println(myTuple3._4._2)

  }
}

// Source: https://youtu.be/ZQQs44OHJLc?si=brvt8h-oq1oac_Im