object array {
def main(args: Array[String]): Unit = {
  var array = Array(1,2,3,4,5)
  println("Given array elements are :")
  for (i <- 0 until array.length){
    println(array(i))
  }
}
}
