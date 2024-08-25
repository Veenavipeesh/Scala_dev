object sum_of_array_elements {
def main (args: Array[String]): Unit = {
  val arr = Array(1,2,3,4,5)
  var sum = 0
  print("Array elements are: ")
  for (i <- 0 until arr.length){
    print(arr(i)+" ")
  }
  println("")
  for (j <- 0 until arr.length){
    sum = sum + arr(j)
  }
  println("Sum of array elements is : "+sum)
}
}
