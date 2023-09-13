object Sets {
  //Set is like a list but can't have duplicate values ; not ordered
  //Immutable set
  val mySet : Set[Int] = Set(1, 2, 5, 5, 8) //5 is only 1 time in the set
  val mySet2 : Set[Int] = Set(1,9,33,7,1)
  //Mutable set
  var myMutableSet : scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 2, 5, 5, 8) //5 is only 1 time in the set

  val names : Set[String] = Set("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    println(mySet)
    println(mySet + 10)

    println(mySet(8)) // 8 is the value, NOT the index like in lists
    println(names("Maxxx")) // 8 is the value, NOT the index like in lists

    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)

    println(mySet.max)
    println(mySet.min)

    //Concatenate sets
    println(mySet ++ mySet2)  //Union
    println(mySet.++(mySet2)) //Union

    println(mySet.&(mySet2)) // Intersection of the 2 sets
    println(mySet.intersect(mySet2)) // Intersection of the 2 sets

    //Iterate on sets
    mySet.foreach(println)
    for (name <- names)
      {
        println(name)
      }
  }
}

// Source: https://youtu.be/l1pFcHa82L8?si=qV9pdrHENMxYuHX-