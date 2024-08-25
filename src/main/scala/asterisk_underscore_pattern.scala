object asterisk_underscore_pattern {
def main(args: Array[String]): Unit = {
  for (i <- 1 to 6){
    for (j <- 1 to i){
      if ( i == 1){
        print("*")
      }
      else{
        if (j == 1){
          print("*")
        }
        else{
          print("_*")
        }
      }
    }
    println(" ")
  }
}
}
