object multiple_range_check {
def main (args: Array[String]): Unit = {
  val num = 25
  val check = (num >= 1 && num <= 10)||(num>=20 && num <= 30)
  print(check)
}
}
