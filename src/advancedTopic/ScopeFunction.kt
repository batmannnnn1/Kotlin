package advancedTopic

/*
Kotlin provides five scope functions that can help make your code more concise and readable.
These functions are let, run, with, apply, and also.
Here’s an explanation of each in an easy-to-understand way:
 */


/*
1. let
Purpose: Perform operations on a non-null object and avoid null checks.

Usage: Use let to execute a block of code only if the object is non-null.
Context Object: it
Returns: The result of the lambda expression.
Example Use Case: When you want to perform operations on an object only if it is not null.
*/


fun demonstrateLet(){
    val name:String? = "Kotlin"
    name?.let {
        println(it) // Prints "Kotlin" if name is not null
        val value = it.length
        println(value) // print length
    }

}


/*

2. run
Purpose: Execute a block of code and return its result. Useful for object initialization and returning a value.

Usage: Use run to operate on an object and return a result.
Context Object: this
Returns: The result of the lambda expression.
Example Use Case: When you need to configure an object and return a value.

 */


fun demonstrateRun(){
    val result = "Java".run {
        println(this)
        length // return the length of the string
    }
    println(result) // print the length of the string
}

/*
3. with
Purpose: Group multiple operations on an object and return a result. Useful for configurations.

Usage: Use with when you want to call multiple methods on an object and return a result.
Context Object: this
Returns: The result of the lambda expression.
Example Use Case: When you need to perform multiple operations on an object.
 */

fun demonstrateWith(){
    val result = with(StringBuilder()){
        append("Kotlin")
        append(" is awesome")
        toString()
    }
    println(result)
}

/*

4. apply
Purpose: Configure an object and return the object itself. Often used for initialization.

Usage: Use apply for object configuration where you want to return the same object.
Context Object: this
Returns: The context object.
Example Use Case: When you need to set up an object.
 */

fun demonstrateApply(){
    val builder = StringBuilder().apply {
        append("Kotlin")
        append(" is awesome")
    }
    println(builder.toString())
}

/*
5. also
Purpose: Perform additional actions on an object and return the object itself. Often used for side-effects like logging.

Usage: Use also to perform some operations on the object while returning the object itself.
Context Object: it
Returns: The context object.
Example Use Case: When you need to perform some side actions like logging.
 */

fun demonstrateAlso(){

    val name = "kotlin"
    name.also {
        println(it) // Prints "Kotlin"
    }
    println(name)// Prints "Kotlin" again, showing that the original object is returned
}

/*
let: Use for nullable objects and when you need to perform an action and return a result.
run: Use for executing code blocks and returning a result.
with: Use for performing multiple operations on an object and returning a result.
apply: Use for configuring an object and returning the object itself.
also: Use for performing additional actions on an object and returning the object itself.
Each function serves a distinct purpose and is useful in different scenarios, making Kotlin code more expressive and concise.
 */

fun main() {
    demonstrateLet()
    demonstrateRun()
    demonstrateWith()
    demonstrateApply()
    demonstrateAlso()
}