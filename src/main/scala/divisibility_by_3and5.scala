object divisibility_by_3and5 {
def main (args: Array[String]): Unit = {
  val num = 15
  if (num % 5 == 0 && num % 3 == 0){
    print("Number is divisible by both 3 and 5")
  }
  else {
    print("Number is not divisible by 3 and 5!")
  }
}
}
