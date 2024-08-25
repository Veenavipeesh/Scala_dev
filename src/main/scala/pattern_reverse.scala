object pattern_reverse {
def main(args: Array[String]): Unit = {
  var num=15
  for (i <- 5 to 1 by -1){
    for(j <- i to 1 by -1){
      print(num+ " ")
      num = num - 1
    }
    println(" ")
  }
}
}
