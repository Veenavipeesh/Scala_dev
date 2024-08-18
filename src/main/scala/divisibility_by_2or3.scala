object divisibility_by_2or3 {
def main (args: Array[String]): Unit = {
  val num = 9
  if (num % 2 == 0 || num % 3 == 0){
    print("Number is divisible by either 2 or 3")
  }
  else{
    print("Number is not divisible by either 2 or 3")
  }
}
}
