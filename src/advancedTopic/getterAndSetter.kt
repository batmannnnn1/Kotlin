package advancedTopic

import java.util.*

/*
all tho kotlin automatically handle the getter and setter
but we can also handle the manually them
 suppose you want to add the functionality in properties,
 so we use the getter and setter
you can't use the val in set
 */

class User{

    var length:Int = 15
    var width:Int = 15
    var height:Int = 22
       // create the property and then get ya set method for her
        val volume
            get() = length*height*width

    var name:String?=null
        set(value) {
            if (value!=null && value.length>3){
                field = value.trim().uppercase(Locale.getDefault())
                println("Value is good $field")
            }
            else{
                println("value is not enough")
            }
        }
}

fun main() {
    var result = User()
    result.name = "ayan saifi"
    println("${result.name}")
    println("${result.volume}")

}