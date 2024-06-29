package advancedTopic.monad_like_construct

import java.lang.ArithmeticException

/*
Result is a monad-like construct for handling operations that can succeed or fail.
 It is particularly useful for error handling.
 */

fun divide1(a:Int,b:Int):Result<Int>{
    return if (b!=0) Result.success(a/b) else Result.failure(ArithmeticException("Divide by Zero"))
}

fun main() {
    val result:Result<Int> = divide1(10,2)
    result.fold(
        onSuccess = { println(it) },
        onFailure = { println(it.message) }

    )

  val failureResult:Result<Int> = divide1(10,0)
    failureResult.fold(
        onSuccess = { println(it) },
        onFailure = { println(it.message) }
    )

}

/*
Kotlin provides several constructs that behave like monads, such as Nullable types, Result, and List.
These constructs allow you to handle optional values, errors, and collections in a functional and expressive way. By understanding and using operations
like map and flatMap, you can effectively work with monad-like structures in Kotlin, leading to cleaner and more maintainable code. Additionally,
you can create custom monad-like classes to encapsulate specific behaviors and leverage monadic patterns in your applications.
 */