object odd_and_not_divisible {
def main (args: Array[String]): Unit = {
  val num = 15
  if ( num % 2 == 1) {
    if (num % 4 != 0){
      print("Number is odd and not divisible by 4")
    }
    else{
      print("Number is odd, but is divisible by 4")
    }
  }
  else{
    print("Number is not odd")
  }
}
}
