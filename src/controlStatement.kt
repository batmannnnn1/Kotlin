fun main() {

    println("Enter your name")
    val name = readln() // readln is used for taking input from the user
    println("Hello,$name")

    // control statements

    println("Enter a number")
    var number1 = readln().toInt()
    println("Enter a number again")
    var number2 = readln().toInt()

    if (number1 > 0) {
        println("number $number1 is positive")
    } else {
        println("number $number1 is negative")
    }


    // we can use if statement also as an expression

    val no = if (number1 > number2)
        number1
    else
        number2

    println("the max number is $no")

    // summary if number1 is greater than number2 so the value assigned in no variable is number1
    // else number2 assigned in no variable

}