object fibanocci_numbers {
def main (args: Array[String]): Unit = {
  var a = 0
  var b = 1
  print(a+" ")
  print(b+" ")
  for(i <- 1 to 8){
    var c = a+b
    a = b
    b = c
    print(c+" ")
  }
}
}
