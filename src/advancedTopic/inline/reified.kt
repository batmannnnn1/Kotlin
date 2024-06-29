package advancedTopic.inline

/*
         GENERIC
         Generics allow you to create classes, interfaces, and functions that can operate on any type. For example,
         you can have a list that can hold integers, strings, or any other type.


          Type Erasure
         the process by which the compiler removes generic type information after ensuring type safety.
         This means that at runtime, the information about the specific type used in a generic class or function is not available.
         The generic type is replaced with its upper bound (typically Object in Java or Any? in Kotlin).

       However, due to type erasure,
        the generic type T is erased and replaced with Any? (in Kotlin) at runtime:
*/

// In reality, due to type erasure, the type information for generics is not available at runtime.
// The type T is erased and replaced with its upper bound (usually Any? in Kotlin).

 fun<T> printListElements(list:List<T>){
     println("List contain elements: ${list.joinToString("," )}")
 }

/*
In this example, the function printListElements can only print the elements of the list,
 but it doesn't know or print the type of elements because type information is erased at runtime.
 */

 /*
 Example With reified Keyword

reified Keyword: In Kotlin, using reified with inline functions allows type information to be retained at runtime,
enabling type-specific operations.


  */


 inline fun<reified T> printListType(list:List<T>){
  println("List contain elements of type: ${T::class}") // you can't do this without reified keyword

 }




fun main() {
 val list = listOf<Int>(1,2,3)
 val listString = listOf<String>("one","Two","three")
 printListElements(list)
 printListElements(listString)

 printListType(list)
 printListType(listString)



}