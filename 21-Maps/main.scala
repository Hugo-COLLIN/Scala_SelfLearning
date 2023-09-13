object Maps {
  val myMap: Map[Int, String] =
    Map(801 -> "Max", 802 -> "Tom", 804 -> "Jerry") //When duplicated keys, keep the LAST ONLY
  val myMap2: Map[Int, String] =
    Map(805 -> "Mary")

  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(802))
//    println(myMap(803)) //Exception
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach {key =>
      println(s"key $key")
      println(s"value ${myMap(key)}")
    }

    println(myMap.contains(88888)) // Avoid the exception

    println(myMap ++ myMap2)
    println(myMap.size)
  }
}

// Source: https://youtu.be/Hq91R_QVZ04?si=JNfWWD_Iokf5a2Y5