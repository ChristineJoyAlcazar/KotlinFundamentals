import java.time.LocalDate
import java.time.Period
import java.util.*

fun main() {
//    println("What is your name?")
//    var yourName= readLine()
//    println(yourName)

    //Complex one
//    println("What is your birthdate?")
//    var yourBirthdate= readLine()
//    var date1 = LocalDate.parse(yourBirthdate)
//    var date2 = LocalDate.now()
//    var period = Period.between(date1,date2)
//
//    println("Your age is ${period.years}")

    //Simpler one
    println("What is your birthdate?")
    var yourBirthdate = readLine()
    var date1 = LocalDate.parse(yourBirthdate)
    var date2 = LocalDate.now()

    println("Your age is ${date2.year - date1.year}")

//    println("What is your birthdate?")
//    var yourBirthdate= readLine()
//    var date1= LocalDate.parse(yourBirthdate)
//    var date2 = LocalDate.now()
//    if(date2.dayOfYear-date1.dayOfYear>=0){
//        println("Your age is ${date2.year-date1.year}")
//    }else{
//        println("Your age is ${date2.year-date1.year-1}")
//    }
}