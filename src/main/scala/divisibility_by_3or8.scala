object divisibility_by_3or8 {
def main (args: Array[String]): Unit = {
  val num = 25
  val check = (num % 3 == 0 || num % 8 == 0)
  if(check){
    print("Number is divisible by either 3 or 8 !")
  }
  else{
    print("Number is not divisible by 3 or 8!")
  }
}
}
