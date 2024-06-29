package advancedTopic.inline

/*
 An inline function in Kotlin is a type of function in which instead of calling the function and executing the function body,
 the function body is copied and pasted into the function call site rather than creating a separate function object.

  The mostly inline keyword is used in higher-order functions or lambda functions in kotlin.


 */

inline fun measureTime(block:()->Unit):Long{
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis()-startTime


}

/*
he measureTimeMillis the function takes a lambda expression as an argument and returns the time taken to execute the lambda expression. By marking the function as inline,
the function call overhead is eliminated by taking the lambda function body coping and paste into the call site and executing the code,
 which can lead to better performance when measuring the time taken to execute small code blocks.

 */

fun main() {
    val time = measureTime { }

    println("Execution Time:$time ms ")
}

/*
It’s important to note that we should use inline for small functions that are called frequently otherwise,
the bytecode bloat caused by inlining can lead to larger APK sizes and longer compilation times.

it is useful for the situation like you have function with lambda, and you have to call them
frequently instead of calling everytime you should use inline keyword but only for small functions

 */