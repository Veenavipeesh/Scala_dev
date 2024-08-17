object divisibility_by_2or5 {
def main (args: Array[String]): Unit = {
  val num = 25
  val check = num % 2 == 0 || num % 5 == 0
  if(check){
    print("Number is divisible by either 2 or 5")
  }
  else{
    print("Number is not divisible by either 2 or 5")
  }
}
}
