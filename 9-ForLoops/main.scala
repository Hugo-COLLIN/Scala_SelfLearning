object ForLoop {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,32,8,44,76,8)
    /*
      i       variable
      <-      generator
      1 to 5  range
     */
    for (i <- 1 to 5)         // 1 to 5 incuded
      println(s"i using to $i")     //Some statement

    for (i <- 1.to(5)) {      // 1 to 5 incuded
      println(s"i using to $i")
    }

    for (i <- 1 until 6) {       // there's also a .until() method
      println(s"i using until $i")     // 1 to 5, 6 is excluded
    }

    for (i <- 1 to 5 ; j <- 1 to 3) //Like nested loop => equivalent to for i for j print i, j
      println(s"i and j using multiple ranges $i $j")

    // for on list elements
    for (elt <- list) {
      println(s"elt using lst " + elt)
    }

    // for on list elements + filter with if condition
    for (elt <- list ; if elt < 6) {
      println(s"elt using lst & filtered " + elt)
    }

    // InitialList ---filter---> FinalList
    val result = for {i <- list; if i < 6} yield {
      i * i
    }
    println(s"result = $result")
  }
}

// Source: https://youtu.be/flfARstLqmc?si=ESMWvM_e5AryaX-1