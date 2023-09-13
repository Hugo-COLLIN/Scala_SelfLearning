object mapAndFilterMethods {
  val lst = List(1,2,3,5,7,10,13)
  val myMap = Map(1 ->"Tom", 2->"Max",3->"John")

  def main(args: Array[String]): Unit = {
    println(lst.map(_ * 2))//map iterate other each element and apply a function on it
    println(lst.map(x => x * 2))
    println(lst.map(x => x / 0.2))

    println(lst.map(x => "hi" + x)) // + concat
    println(lst.map(x => "hi" * x)) // * write the str the number of time specified
    println(lst.map(x => "hi" * x)) // * write the str the number of time specified
    println(myMap.map(x => "hi" + x)) // * write the str the number of time specified
  }
}

// Source: https://youtu.be/K5alCbt6MoQ?si=Vsa9g7ADODqEDqXW