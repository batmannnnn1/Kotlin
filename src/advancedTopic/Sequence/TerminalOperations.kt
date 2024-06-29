package advancedTopic.Sequence

/*
triggers the operation

The toList function in Kotlin is used to convert a sequence or any other iterable collection into a List. When you apply toList to a sequence,
it triggers the processing of all the intermediate operations defined on that sequence and collects the resulting elements into a list.

 */

fun main() {
    val sequence = sequenceOf(1,2,3,4,5,6)
    val list = sequence.toList()
    val count = sequence.count() // Counts the element in the sequence

}