fun main(){

    // when branch is more than one use when statement instead of if-else condition
    // when is like switch statement

    println("Enter your marks")
    val marks = readln().toInt()
    val grade:Char = when(marks){
        in 91..100-> 'A' // this is use for range
        in 80..90-> 'B'
        in 70..79->'C'
        else -> 'F'

    }

    println("The grade is $grade")
}