package advancedTopic

 // Chaining Safe Calls
/*
Chaining safe calls allows you to safely navigate through multiple nullable properties in a single expression.
 Each call will only be executed if the preceding object is not null.

 Let's say you want to get the street name of the person's address.
 If any part of the chain is null, you want to avoid a NullPointerException.
 */

data class Address(val street:String?,val city:String?)
data class Person(val name:String?,val address: Address)

fun main() {
    val person: Person?= Person("Jhon", Address(null,"New York"))

 val street:String? = person?.address?.street // also safe call operator
 val streetOne:String? = person?.address?.street?:"Unknown city" //  Provides a default value if null
    /*
    person?.address: Checks if person is not null. If person is null, the whole expression returns null. If person is not null, it proceeds to check address.
address?.street: If address is not null, it returns the street. If address is null, the whole expression returns null.
this is the also example of safe call operator


     */
    println(streetOne)
}