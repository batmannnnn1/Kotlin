package advancedTopic
/*
 it keyword ->  "it" is a special keyword used in Kotlin for lambda expressions and anonymous functions.
 When you have a lambda expression or an anonymous function, "it" refers to the single parameter of the lambda function if it's not explicitly named.

 this keyword -> "this" in Kotlin works similar to other object-oriented languages. It refers to the current instance of the class you're working in.
 Use "this" to access members (fields, methods) of the current object, especially to disambiguate between parameters and class members with the same name.

 */

fun main() {
    val number = listOf(1,2,354,55)
     val doubled = number.map { it*2 } // "it" refers to each element in the list
    println(doubled)
}
/*
"it" is used in lambda expressions to refer to the current parameter.
"this" is used within classes to refer to the current instance of the class.
 */