package advancedTopic
/*
Lambdas is a anonymous function which can be used as a values
first parameter , return type and then body
 */

 // Basic Lambda Expression
   val multiply:(Int,Int)-> Int = {
       a,b-> a*b // first type , return and then arguments and body
   }

// IF LAMBDA HAVE SINGLE PARAMETER

 val sum:(Int)->Int={
     it+it //  If a lambda has only one parameter, it can be used instead of naming the parameter.

 }

 // LAMBDAS CAN BE PASSED AS ARGUMENTS TO FUNCTION

 fun subtract(a:Int,b:Int,operation:(Int,Int)->Int):Int{ // also Higher order function
 // function name , type , and return type
     return operation(a,b)
 }
/*
Functions often need to perform different operations. Instead of writing multiple functions,
 you can pass a lambda to specify the operation.
 */
fun operate(a:Int,b:Int,operation: (Int, Int) -> Int):Int{

    return operation(a,b)
}

fun main() {

//    println(multiply(500,500))
//    println(sum(5))

    var result = subtract(5,10){x,y->x-y} // arguments and body
    println(result)

    var result1 = operate(10,10){x,y->x/y}
    println(result1)
}