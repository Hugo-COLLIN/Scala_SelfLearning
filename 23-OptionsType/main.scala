object OptionsType {
  val lst = List(1,2,3);
  val map = Map(1->"Tom", 2->"Max",3->"John")
  val opt: Option[Int] = None
  val opt2: Option[Int] = Some(55)

  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 6)) //None type
    println(lst.find(_ > 2)) //Some(3) type

    println(map.get(1)) //Some(Tom)

    println(lst.find(_ > 2).get) //Get the value inside Some
    println(map.get(1).get) //println(map(1))

    println(map.get(5).getOrElse("No name found")) // return the value if exists, "No name found" else
    println(map.getOrElse(5, "No name found")) // return the value if exists, "No name found" else
    println(lst.find(_ > 2).getOrElse(5))

    println(opt)
    println(opt.isEmpty)
    println(opt2.isEmpty)
  }
}

// Source: https://youtu.be/EqnXU4_fQmo?si=3ZB5DWn1sDxR0-Hm