object divisibility_by_5or9 {
def main (args: Array[String]): Unit = {
  val num = 45
  if ( num % 5 == 0 || num % 9 == 0){
    print("Number is divisible by either 5 or 9")
  }
  else{
    print("Number is not divisible by either 5 or 9")
  }
}
}
