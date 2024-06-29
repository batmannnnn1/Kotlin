package advancedTopic
/*
   1     NON-NULLABLE TYPE
        by default variable cannot hold the null values

2      NULLABLE TYPE
      If a variable needs to hold a null value,
       it must be explicitly declared as nullable by appending a ? to the type.

3      Safe Call Operator (?.)
      The safe call operator allows you to safely access a property or call a method on a nullable variable.
       If the variable is null, it returns null instead of throwing an exception.

4       Elvis Operator (?:)
        The Elvis operator provides a default value if the expression on the left is null.

5       Non-Null Assertion Operator (!!)
       If you're sure that a nullable variable is not null, you can use !! to forcefully cast it to a non-null type.
       This will throw a KotlinNullPointerException if the variable is null.

6         let Function
       The let function is used to execute a block of code
       only if the nullable variable is not null.

7           Safe Cast (as?)
        The safe cast operator attempts to cast a value
         to a specified type and returns null if the cast fails.

8         late init and by lazy
     For properties that will be initialized later, you can use lateinit or by lazy.
     BY LAZY -> The by lazy keyword in Kotlin is used to create a property that will be initialized only when it is accessed for the first time. This is known as lazy initialization.
                 Initialization Block: The initialization block { "John" } is not executed immediately.
                 The first time lazyName is accessed, the block { "John" } is executed, and the result is stored.
                 Any subsequent accesses to lazyName will return
                 the stored result directly without executing the block again.

 */

 var name:String? = null
  // name = null 1 it shows the compile time error

 var marvel:String?=null // 2 this type

var length:Int? = name?.length // length will be null if name is null

var height:Int = name?.length?:0 //  If name is null, length will be 0

var number:Int = name!!.length //  Will throw an exception if name is null

var number1:Int? = "ayan" as? Int // number1 will be null because "ayan" is not int

lateinit var person:String // lateinit: Used with var properties that will be initialized later.

val personGmail:String by lazy { "John" } // by lazy: Used with val properties that are initialized lazily.

fun main() {
    println(name)
    println(number)
    println(marvel)
    name?.let {
        println("ayan is saifi") // only execute if name is not null
    }
}