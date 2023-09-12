object StringInterpolation {
  def main(args: Array[String]): Unit = {
    /*
        Interpolation types:
        - s: interpreted string
        - f: allow types for variables inside the string
        - raw: special symbols are not interpreted in the string
     */

    val name = "mark"
    val age = 20

    println(name + " is " + age + " years old")
    println(s"$name is $age years old")         // $variable
    println(f"$name%s is $age%d years old")     // precise variables types with %type

    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")                 // string is not interpreted and rendered as is
  }
}

// Source: https://youtu.be/_tLEX80p5-k?si=w-YSC0tYASKXX8Nv