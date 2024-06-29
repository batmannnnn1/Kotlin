package advancedTopic.monad_like_construct

/*
Analogy: Imagine you have a box of apples, and you want to cut each apple into slices and put all the slices back into one big box. The result is a single box with many slices of apples.

Usage: flatMap is like applying a function to each item that also returns a container, and then flattening all the containers into one.
 */

//Example with Lists:

//You have a list of numbers [1, 2, 3].
//You want to transform each number into a list of two numbers
// (the original number and its double) and then combine all the resulting lists into one list.


fun main() {
    val number = listOf(1,2,3,4,5)
    val expandedNumber = number.flatMap { listOf(it,it*2) }
    println(expandedNumber)

      val number1:Int? = 1
     val incremented = number1?.let { increment(it) }
     println(incremented)

}

fun increment(value:Int):Int?{
    return value+1
}

