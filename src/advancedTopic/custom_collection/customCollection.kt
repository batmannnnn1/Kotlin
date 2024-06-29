package advancedTopic.custom_collection

/*
kotlin have 3 type of collections list,set and Map
but suppose your requirements doesn't fit with these 3 collections, so
you create your own custom collections

after creating the custom class  you have to extends the Collection class for implementing the override methods and functionality
 */

class MyCollections<T:Comparable<T>>:ArrayList<T>(){

    override fun add(element: T): Boolean {
        if (!contains(element)){ // Check if the element already exists
            super.add(element) // Add the element if it's not a duplicate
            sort()            //  Sort the list after adding the element
            return true     // Indicate that the element was added
        }
        return false
    }

    override fun addAll(elements: Collection<T>): Boolean {
        val added = elements.filter { !contains(it) } // Filter out duplicates
        val result = super.addAll(added)      // Add the unique elements
        sort()
        return result
    }
}
/*
elements.filter { ... }:

filter is a function that creates a new list containing only the elements that match a given condition.
The condition is defined inside the curly braces { ... }.

!contains(it):

contains is a method that checks if the list already contains a specific element.
it refers to the current element being checked from the elements' collection.
!contains(it) means "not contains". So, !contains(it) returns true if the list does not already contain the element it.


 Explanation of super.addAll(added)
super
super is a keyword in Kotlin (and other object-oriented languages) that refers to the superclass of the current object.
 In this case, the superclass is ArrayList<T>, since UniqueSortedList extends ArrayList<T>.

addAll

addAll is a method provided by ArrayList (and other collection classes) that adds all elements from the specified collection to the list.

super.addAll(added)
When you call super.addAll(added), you are invoking the addAll method defined in the superclass (ArrayList) and not the overridden addAll method in the UniqueSortedList class itself.



 

 */

fun main() {
    val myList = MyCollections<Int>()
    myList.add(3)
    myList.add(3)
    myList.add(5)
    myList.add(8)
    myList.add(1)
    myList.add(2)

    println(myList)
}