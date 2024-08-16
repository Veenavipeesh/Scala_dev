object odd_negative {
def main (args: Array[String]): Unit = {
  val num = 7
  val check = (num < 0) && (num %2 == 1)
  print(check)
}
}
