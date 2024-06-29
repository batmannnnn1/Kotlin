package oops

/*
The word polymorphism means having many forms. In simple words,
we can define polymorphism as the ability of a message to be displayed in more than one form.

example-> we create the function pass the argument of shape class
and call the find area but the function don't know the exact value
because the vale shape change at runtime

 */

 fun calculateArea(shape: Shape){
     shape.findArea()
 }


 open class Shape{

     open fun findArea(){

         println("Find Area")

     }

 }

 class circle:Shape(){
     override fun findArea() {
         super.findArea()
     }

 }

fun main() {

    var result = circle()
     calculateArea(result)

}