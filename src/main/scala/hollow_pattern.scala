object hollow_pattern {
def main (args: Array[String]): Unit = {
  val columns = 6
  val rows = 4
  println("* "*columns)
  for (i <- 1 to rows-2){
    println("*"+" "*(columns) +"*")
  }
  print("* "*columns)
}
}
