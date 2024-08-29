object first_string_program {
def main (args: Array[String]): Unit = {
  val word = "Mohan is a good boy"
  val arr_word = word.split(" ")
  println("The given string is : "+word)
  println("The count of each word in the given string is : ")
  for (i <- 0 until arr_word.length){
    var count = 0
    val each_word = arr_word(i)
    for (j <- 0 until each_word.length){
      count = count + 1
    }
    println(each_word+":"+count)
  }
}
}
