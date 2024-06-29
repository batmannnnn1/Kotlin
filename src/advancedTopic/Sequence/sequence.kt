package advancedTopic.Sequence

/*
A Sequence in Kotlin is a way to handle collections of data in a lazy manner,
 meaning that the processing of elements is deferred until it’s actually needed. This can help improve performance,
 especially when dealing with large datasets or multiple chained operations.

 in normal collections each operation like map or filter creates the immediate collection which is not good for memory
but Sequences, on the other hand, perform these operations only when necessary, reducing unnecessary computation and memory usage.

elements are processed one-by-one, only creating the necessary output at the final step. This avoids the overhead of creating multiple intermediate collections,
 resulting in lower memory usage and potentially faster execution, especially for large or complex data transformations.
 */


fun main() {
    val list = listOf(1,2,3,4,5,6)
     val sequence = list.asSequence() // this is how you convert the normal list into the sequence


    // using the sequenceOf

    val sequence1 = sequenceOf(1,2,3,6,5,) // create the new list as a sequence

}