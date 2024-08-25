object increase_and_then_decrease_pattern {
def main (args: Array[String]): Unit = {
  for (i <- 1 to 5){
    for(j <- 5 to i by -1){
      print(" ")
    }
    for (k <- 1 to i+(i-1)){
      print("*")
    }
    println("")
  }
  for(x <- 4 to 1 by -1){
    for (y <-1 to 6-x){
      print(" ")
    }
    for (z <- x+(x-1) to 1 by -1){
      print("*")
    }
    println("")
  }
}
}
