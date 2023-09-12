object MatchExpressions {
  def main(args: Array[String]): Unit = {
    val age = 19;
    val age2 = "60";
    val i = 7;

    // Match expression = like a switch

    // Use math as statement
    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 56 => println(age)
      case _ => println("default")  //default case
    }

    // Use math as expression
    val result = age2 match {
      case "31" => age2
      case "60" => age2
      case "6" => age2
      case _ => "default"  //default case
    }
    println(result)


    i match {
      case 0|2|4|6|8 => println("even")
      case 1|3|5|7|9 => println("odd")
    }

    i match {
      case x if x % 2 == 0 => println("even")
      case x if x % 2 != 0 => println("odd")
    }
  }
}

// Source: https://youtu.be/GuGRsmuczWU?si=MqLY0dau8jL8-uiB