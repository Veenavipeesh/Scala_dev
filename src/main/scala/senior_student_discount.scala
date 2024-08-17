object senior_student_discount {
def main (args: Array[String]): Unit = {
  val age = 75
  if (age > 60){
    print("You are eligible for senior citizen discount!")
  }
  else if (age < 25){
    print("You are eligible for student discount!")
  }
}
}
