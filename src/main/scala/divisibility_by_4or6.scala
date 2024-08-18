object divisibility_by_4or6 {
def main (args: Array[String]): Unit = {
  val num = 24
  if(num % 4 == 0 || num % 6 == 0){
    print("Number is divisible by either 4 or 6")
  }
  else{
    print("Number is not divisible by either 4 or 6 !")
  }
}
}
