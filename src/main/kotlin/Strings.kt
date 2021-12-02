fun main() {
    val myMessage="Happy Birthday! Justin!"
    val anotherMessage="Happy Birthday! Justin!"
//    println(myMessage)
//    println(myMessage.subSequence(16,22))
//    println(myMessage.substring(16,22))
    println(myMessage.compareTo(anotherMessage))
    val str="eloquent"
    println(str.drop(1).dropLast(1))
    println(myMessage.drop(16)) //returns Justin
    println(myMessage.plus( " Yeey!")) //returns Happy Birthday! Justin! Yeey!
    println(myMessage.endsWith("Justin!")) //returns true
    println(myMessage.contentEquals("Happy Birthday! Justin"))//returns false


}