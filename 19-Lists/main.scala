object Lists {
  // Like an array: Fixed size & same data type collection of elements
  /*
  Differences between Arrays and Lists
    Arrays are mutable, lists are immutable
    List = linked list ; Arrays = flat
   */

  // Declaring a list
  val myList : List[Int] = List(1, 2, 5, 7, 48, 3)
  val names : List[String] = List("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    println(myList)
    println(names)

//    myList(0) = 5; // Impossible

    println(0 :: myList)
    println("Blabla" :: names :: true :: myList)
    println(1 :: 5 :: 9 :: Nil) // Create a list

    println(myList.head) // head = first value
    println(myList.tail) // tail = all elements after the first
    println(myList.isEmpty) // check if list is empty
    println(myList.reverse)
    println(List.fill(5)(2)) // the 2 value 5 times in a new list
    println(myList.max)

    //Iterate over a list
    myList.foreach(println) // display each element

    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)

    for (name <- names) {
      println(name)
    }

    println(names(0)) // not recommended
  }
}

// Source: https://youtu.be/sa32HlWC3f8?si=96NXk1n6zQCo3hVV