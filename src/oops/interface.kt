package oops

/*
In Kotlin, an interface is a collection of abstract methods and
properties that define a common contract for classes that implement the interface.

An interface is similar to an abstract class,
 but it can be implemented by multiple classes, and it cannot have state.
 Interfaces cannot have fields to hold data (state). They can only have methods (abstract and default)
 you don't want to use abstract keyword this is automatically abstract
 Can have methods that need to be implemented and can also have default methods.
 t's a contract that says "if you use me, you must do these things."

 Property initializers are not allowed in interfaces

             SUMMARY
       In short, use an abstract class when you want to provide a base with some shared behavior
       and use an interface when you want to define a set of capabilities that can be shared across different classes.
 */

 interface MyGame{
     val game:String

     fun download()

 }

 class OnDownload(override val game: String):MyGame{

     override fun download() {
        println("This is overriding testing method")
     }

 }