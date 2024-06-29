package advancedTopic.Sequence

fun main() {
    val list = listOf(1,2,3,4,5,6)

    val result = list.asSequence()
        .map { println("Mapping $it");it*2 }
        .filter { println("Filtering $it"); it%3==0 }
        .toList()

    println(result)


    // Another Example


    val largeList = (1..1_000_000).toList()
    val result1 = largeList.asSequence()
        .map { it*2 }
        .filter { it%3==0 }
        .take(10)
        .toList()


}
/*
asSequence: Converts the list to a sequence.
map: Defines a transformation to multiply each element by 2.
filter: Defines a filter to keep elements divisible by 3.
toList: Triggers the processing.


Notice that each element goes through the entire chain of operations one by one,
rather than processing all elements at each step.

     SECOND EXAMPLE SUMMARY

     Mapping: Each element is multiplied by 2.
Filtering: Each mapped element is checked to see if it is divisible by 3.
Take: Stops processing after finding the first 10 elements that pass the filter


 */