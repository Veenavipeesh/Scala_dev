object student_discount_or_free_trial {
def main (args: Array[String]): Unit = {
  var age_of_person = 22
  var free_trial = true
  if (age_of_person < 25){
    println("You are eligible for student discount")
    if (free_trial){
      print("You are qualifies for a free trial as well !")
    }
  }
  else if(free_trial){
    print("You are eligible for a free trial !")
  }
}
}
