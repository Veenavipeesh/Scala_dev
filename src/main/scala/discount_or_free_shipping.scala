object discount_or_free_shipping {
def main (args: Array[String]): Unit = {
  val purchase_amount = 120
  if (purchase_amount > 150){
    print("You are eligible for a discount !")
  }
  else if(purchase_amount > 100){
    print("You are eligible for free shipping")
  }
}
}
