package oops
/*
In Kotlin, setter is used to set the value of any variable and getter is used to get the value.

Getters and Setters are auto-generated in the code.

we can create own implementation of getter and setters
 */

 class getandSet(){

     var name:String= ""

         get() {
             println("this is our get method")
             return field
         }

         set(value) {
             field = value
             println("This is our set method")
         }



 }


fun main() {

    var result = getandSet()
    result.name
}