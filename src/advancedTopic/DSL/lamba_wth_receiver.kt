package advancedTopic.DSL

/*
A "lambda with receiver" in Kotlin lets you call methods and access properties of an object directly inside a lambda.
 Think of it like giving the lambda its own special "buddy" object that it can talk to directly.

We'll define an extension function buildString that takes a lambda with a StringBuilder receiver.
 This will allow us to build strings in a more readable and concise way.

 */

fun buildString(action:StringBuilder.()->Unit):String{
    val stringBuilder = StringBuilder()
    stringBuilder.action() // Execute lambda with stringBuilder as receiver

    return stringBuilder.toString()

}

fun main() {
    val result = buildString {
        append("Hello, ")
        append("world! ")
        appendLine()
        append("This is a ")
        append("StringBuilder DSL example.")

        // Inside the lambda, StringBuilder is the receiver,
    // so we can call its methods (like append and appendLine) directly.
    }
    println(result)

}

/*
After the lambda executes, buildString converts the StringBuilder to a String and returns it.

Extension Function: buildString is an extension function that takes a lambda with a StringBuilder receiver.

Lambda with Receiver: Inside the lambda, you can call StringBuilder methods directly (like append).

Clean and Readable: This approach makes the code for building strings more concise and readable.


Understanding StringBuilder.() -> Unit

StringBuilder:

This is the receiver type of the lambda.
It means that the lambda is designed to operate within the context of a StringBuilder instance.

. (Dot Operator):

This specifies that the lambda will have StringBuilder as its receiver.
Inside the lambda, you can directly call methods and access properties of StringBuilder without needing to prefix them with an instance variable.

 */