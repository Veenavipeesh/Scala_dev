object multiple_of_3and7 {
def main (args: Array[String]): Unit ={
  val num = 27
  if (num % 3 == 0 && num % 7 == 0){
    print("Number is a multiple of both 3 and 7")
  }
  else{
    print("Number is not a multiple of 3 and 7")
  }
}
}
