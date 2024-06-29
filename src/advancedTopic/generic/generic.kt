package advancedTopic.generic
/*
 suppose you're creating the class which takes array also type as an int
 and if you wanna change the array type then you might be creating another array class which takes the string
 but with the help of generic you could use one array class as so many types
 and define the type of array when you're initializing the class
 */

 class ArrayUtil<T>(private val array: Array<T>){

     fun findElement(element:T,foundElement:(index:Int,element:T?)->Unit){ // unit is similar to void keyword which don't return any specific value
         for (i in array.indices){
             if (array[i]==element){ // It checks if the current element in the array (array[i]) is equal to the given element (element).
                 foundElement(i,array[i]) // The lambda function foundElement is called with the current index (i) and the found element (array[i]).
                 return
             }
         }

         foundElement(-1, null)
     }

 }

fun main() {
    val arrayUtil = ArrayUtil<Int>(arrayOf(1,22,333,545))
    arrayUtil.findElement(22){index, element ->
        println("$index , $element")
    }

 val arrayUtil1 = ArrayUtil<String>(arrayOf("ayan","kaif","zarif"))
    arrayUtil1.findElement("zarif"){index, element -> println("$index,$element") }

}