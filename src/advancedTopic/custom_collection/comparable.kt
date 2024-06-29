package advancedTopic.custom_collection

import advancedTopic.person

/*
Comparable<T> is an interface which is used for sorting the objects automatically
its have a one method called compare-to The compareTo method compares the current object
with the specified object other for order. It returns:

 */

data class Person(val name:String,val age:Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {

        return this.age-other.age
    }


}

fun main() {
    val people = listOf(
        Person("alice",30),
        Person("Bob",30)
    )

     val result = people.sorted()
    val compare = Person("Ayan",19)

    val person1 = Person("Ayan",19)
    val person2 = Person("Zarif",18)
    val comparisonResult = person1.compareTo(person2)
    println(comparisonResult)
    println(result)
}

/*
person1.age is 19.
person2.age is 18.
19 - 18 results in 1, a positive number, indicating that person1 (Ayan) is older than person2 (Zarif) and thus "greater than" Zarif in terms of ordering.



 */