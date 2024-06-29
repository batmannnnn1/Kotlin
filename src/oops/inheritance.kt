package oops
/*
When one class takes(acquire) the properties and behaviours of another class then
this is called Inheritance.

The class that provides the properties and behaviours is Parent class/Base class/Super class

The class that takes the properties and behaviours is Child Class/Derived Class/Sub Class
the inheritance is automatically off in kotlin
you should use the open keyword in parent class

  OVERRIDE TOPIC
  suppose you're not satisfy the parent's method you have to redefined it
  according to your need that's the reason why we use override
 super.home() means we also use the parent's method after this we redefined it
 */

 open class parent(){

     var address = "delhi"

    open fun home(){
         println("This is my house address is $address")
     }
 }

 class son:parent(){

     fun mineToo(){
         println("This is my house too dad ")
     }

     override fun home() {
         super.home()
         println("we can redefined it acc to my needs")
     }
 }

fun main() {
    var result = son()
    println(result.home())
    println(result.mineToo())
}