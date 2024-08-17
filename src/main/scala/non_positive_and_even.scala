object non_positive_and_even {
def main (args: Array[String]): Unit = {
  val num = -5
  if (num < 0){
    if (num % 2 == 0){
      print("Number is both Non-positive and Even ")
    }
    else{
      print("Number is Non-positive, but not Even")
    }
  }
  else{
    print("Number is not Non-Positive!")
  }
}
}
