object prime_and_odd {
def main (args: Array[String]): Unit = {
  val num = 13
  if(num < 2){
    if(num % 2 == 1 && num >0){
      print("Number is both prime and odd")
    }
    else{
      print("Number is not prime")
    }
  }
  else if (num == 2 || num == 3){
    if(num % 2 ==1){
     print("Number is prime and odd")
    }
    else{
      print("only prime, not odd")
    }
  }
  else{
    var prime_check = true
    var odd_check = true
    for (i <- 2 to (num/2)){
      if (num % i == 0) {
        prime_check = false
        if(num % 2 == 0){
          odd_check = false
          print("Number is not prime and odd !")
          return
        }
      }
    }
    if(prime_check && odd_check){
     print("Number is both Prime and odd!")
    }
  }
}
}
