package feat

fun operand(a:Int,b:Int,operator:(Int,Int)->Int):Int{

    return operator(a,b)
}


fun main() {
    println("Hello Kotlin User!")
    var result = operand(5,5){a,b->a+b}
    println(result)

}
