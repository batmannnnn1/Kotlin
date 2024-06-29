package advancedTopic.monad_like_construct

/*
Analogy: Imagine you have a box of apples, and you want to paint each apple red. After painting, you still have a box of apples, but now they are red.

Usage: map is like applying a function to each item inside a container and keeping the container.
 */

//Example with Lists:
//
//You have a list of numbers [1, 2, 3].
//You want to add 1 to each number.

fun main() {
    val list = listOf(1,2,3,4)
     val map = list.map { it+1 }
    println(map)


    // Example with Nullable:
    //
    //You have an optional number 5.
    //You want to add 1 to the number if it exists.

    val  no:Int? = 2
  val nullableMap = no?.let { it+1 }
    println(nullableMap)
}