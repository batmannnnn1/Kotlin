package advancedTopic.Sequence

/*
Intermediate operations return a new sequence and are performed lazily.
 */

fun main() {
    val sequence = sequenceOf(1,2,3,4,5)
    val mappedSequence = sequence.map { it*2 }
    val filteredSequence = sequence.filter { it%2==0 }
}