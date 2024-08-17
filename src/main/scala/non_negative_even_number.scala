object non_negative_even_number {
def main (args: Array[String]): Unit = {
  val num = -8
  val check = (num > 0) || (num % 2 == 0)
  print(check)
}
}
