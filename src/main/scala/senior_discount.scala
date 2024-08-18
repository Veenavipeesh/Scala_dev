object senior_discount {
def main (args: Array[String]): Unit= {
  val age = 70
  val new_customer = false
  if(age > 65 && !new_customer){
    print("You are eligible for senior citizen discount")
  }
  else{
    print("You are not eligible!")
  }
}
}
