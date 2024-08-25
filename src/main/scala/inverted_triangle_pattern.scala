object inverted_triangle_pattern {
def main (args: Array[String]): Unit = {
  for (i <- 6 to 1 by -1){
    for (j <- i to 1 by -1){
      print("* ")
    }
    println(" ")
  }
}
}
