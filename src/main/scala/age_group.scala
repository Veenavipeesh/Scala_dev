object age_group {
def main (args: Array[String]): Unit = {
  val age = 15
  if (age < 13){
    print("You are in CHILD age group")
  }
  else if (age >= 13 && age <= 19){
    print("You are in TEENAGER age group")
  }
  else if (age >= 20){
    print("You are in ADULT age group")
  }
}
}
