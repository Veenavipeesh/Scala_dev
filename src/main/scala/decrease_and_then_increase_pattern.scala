object decrease_and_then_increase_pattern {
def main(args: Array[String]): Unit = {
  for (i <- 5 to 1 by -1){
    for(j <- 1 to 7-i){
      print(" ")
    }
    for (k <- i+(i-1) to 1 by -1){
      print("*")
    }
    println("")
  }
  for (x <- 1 to 4){
    for(y <- 7-x to 1 by -1){
      print(" ")
    }
    for (z <- 1 to x+(x-1)){
      print("*")
    }
    println("")
  }
}
}
