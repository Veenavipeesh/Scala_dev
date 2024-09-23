object word_check {
def main(args: Array[String]): Unit = {
  println("Enter the sentence or paragraph to check the word existence: ")
  var sentence = scala.io.StdIn.readLine()
  println("Enter the word to check: ")
  val word = scala.io.StdIn.readLine()
  val wordsArray = sentence.split(" ")
  var word_count = 0
  println(wordsArray.mkString(","))
  for(i <- 0 until wordsArray.length){
    if(word == wordsArray(i)){
      word_count = word_count+1
    }
  }
  println("word " +word+ " is " +word_count+ " times in the given sentence")
}
}
