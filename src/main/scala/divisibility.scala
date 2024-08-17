object divisibility {
def main (args: Array[String]): Unit = {
  val num = 37
  val check = (num % 5 == 0) && (num % 7 == 0)
  print(check)
}
}
