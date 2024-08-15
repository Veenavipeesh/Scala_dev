object odd_check_with_and {
def main(args:Array[String]):Unit={
  var num = 24
  var num_check = num%2 == 1 && num/3 != 0
  print(num_check)
}
}
