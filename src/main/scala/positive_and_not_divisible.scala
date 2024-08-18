object positive_and_not_divisible {
def main (args: Array[String]): Unit = {
  val num = 7
  if ( num >0){
    if( num % 4 != 0){
      print("Number is both positive and not divisible by 4")
    }
    else{
      print("Number is positive, but divisible by 4!")
    }
  }
  else{
    print("Number is not positive!")
  }
}
}
