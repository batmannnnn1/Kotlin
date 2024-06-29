package advancedTopic.monad_like_construct

/*
Monad Fundamentals
A monad is a design pattern used in functional programming to handle computations in a context, such as optional values, errors, or lists. A monad typically has the following characteristics:

Type Constructor: Wraps a value in a context.
flatMap (or bind): Chains operations on the wrapped value while keeping it in the context.
map: Applies a function to the wrapped value, transforming it within the context.

Nullable Types (Option/Maybe)
Kotlin uses Nullable types to represent the Option or Maybe monad. A Nullable type can hold a value or be null.
 */

fun divide(a:Int,b:Int):Int?{
    return if (b!=0) a/b else null
}

fun main() {
    val result:Int? = divide(10,2)
    result?.let { println(it) }

    val nullResult:Int? = divide(10,0)
    nullResult?.let { println(it) }
}