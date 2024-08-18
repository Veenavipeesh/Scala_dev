object non_negative_and_non_divisible {
def main (args: Array[String]): Unit = {
  var num = 14
  if (num > 0){
    if (num % 7 != 0){
      print("Number is both non-negative and not divisible by 7")
    }
    else{
      print("Number is non-negative, but divisible by 7 !")
    }
  }
  else{
    print("Number is negative!")
  }
}
}
