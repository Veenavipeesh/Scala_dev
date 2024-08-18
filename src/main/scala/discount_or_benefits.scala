object discount_or_benefits {
def main (args: Array[String]): Unit = {
  var purchase_amount = 180
  var loyalty_card = true
  if(purchase_amount > 200){
    println("You are eligible for a discount!")
  }
  if(loyalty_card){
    print("You are qualifies for membership benefits !")
  }
}
}
