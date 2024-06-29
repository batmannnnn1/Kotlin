package oops.other
/*
A sealed class is used when you need a hierarchy of types
that are related but can have different properties.
It’s like having a parent type with several specific subtypes.

Use for a group of related types with possibly different properties.
Example: Different shapes in a drawing app (circle, rectangle, triangle).

              SUMMARY

 use enum class when you have a limited number of fixed options,
and use sealed class when you need to represent a group of related types that can have different properties.
 */

sealed class Shape{
data class Circle(val radius:Double):Shape()
data class Rectangle(val width:Double):Shape()

}
 fun printShape(shape: Shape){
     when(shape){
        is Shape.Circle-> println("Circle with radius ${shape.radius}")
         is Shape.Rectangle -> println("Rectangle with width ${shape.width}")
     }

 }
fun main() {
    val result = Shape.Rectangle(20.0)
    printShape(result)
}