object odd_or_prime {
def main (args: Array[String]): Unit = {
  val num = 11
  if (num % 2 == 1){
    println("Number is odd")
  }
  if (num > 0){
    if(num != 1){
      if (num == 2 || num == 3){
        print("Number is Prime")
      }
      else {
        var prime_check = true
        for (i <- 2 to num/2){
          if (num % i == 0){
            prime_check = false
            return
          }
        }
        if ( prime_check && num != 1){
          print("Number is prime")
        }
      }
    }
  }
}
}
