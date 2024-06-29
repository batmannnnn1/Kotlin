package oops
/*
 abstract means incomplete
 concrete means complete
 normally which class we use it is concrete

 if you have to use the abstract class use the keyword
 when you're using the abstract class you can't initialize in main function
 you can't use the abstract class method until another class complete the abstract method

     EXAMPLE
     we create the class abstract class called animal
     and two methods one is concrete second is abstract
     now the class is abstract we cannot use this class
     until the another class complete the abstract method the dog



 */

abstract class Animal(){

    fun cat(){
        println("Cat is cute")
    }

    abstract fun dog()


}

 class Dog:Animal() {
     override fun dog() {
         println("street dog is good")
     }
 }

fun main() {
    var result = Dog()
    result.dog()
}