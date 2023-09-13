import Array._

object Arrays {
  // Fixed size & same data type collection of elements

  // Declaring an array
  val myArray:Array[Int] = new Array[Int](4)
  val myArray2 = new Array[String](5)
  val myArray3 = Array(1,2,3,4,5)

  def main(args: Array[String]): Unit = {
    myArray(0) = 20
    myArray(1) = 7
    myArray(2) = 15

//    println(myArray) // Not showing elements but reference
    for (x <- myArray)
      println(x)

    for (i <- 0 until myArray.length) // i <- myArray.indices
      println(myArray(i))

    for (i <- myArray2.indices)
      println(myArray2(i))

    println(myArray3.length)

    val result = concat(myArray, myArray3)
    for (x <- result) println(x)

//    myArray.

  }
}

// Source: https://youtu.be/Br7-ry5swIg?si=pEv-4q07YIOH44Uz