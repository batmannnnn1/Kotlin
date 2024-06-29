package oops.other
/*
data classes are the class that holds data,
In this class some functions are already defined

The compiler automatically derives the following functions :
equals()
hashCode()
toString()
copy()

The primary constructor needs to have at least one parameter.
All primary constructor parameters need to be marked as val or var.
Data classes cannot be abstract, open, sealed or inner.
Data classes may only implement interfaces.

 */
data class User(var name:String,var gmail:String){

    fun detail(){
        println("the name is $name also gmail $gmail")
    }
}

fun main() {
    var result = User("Ayan","saifi822@gmail.com")
    println(result) // in data class toString method automatically call
}