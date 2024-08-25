object pattern_printing {
def main (args: Array[String]): Unit = {
  for (i <- 1 to 6){
    for(j <- 1 to i){
      print(i+ " ")
    }
    println("")
  }
}
}
