package advancedTopic.delegation

import java.util.*
import kotlin.reflect.KProperty

/*
you can also delegate the property
 */

//These properties are delegated to an instance of HandleDelegation.
// This means that the getter and setter logic for these properties is defined in the HandleDelegation class.
//
class student {
    var firstName: String? by HandleDelegation()
    var lastName: String? by HandleDelegation()

    override fun toString(): String {
        return "$firstName,$lastName"
    }
}

// This class handles the delegation for the firstName and lastName properties.

class HandleDelegation(){

var stringValue:String?=null

   operator fun setValue(thisRef:Any?,property:KProperty<*>,value:String?){
       if (value!=null && value.length>5){
           stringValue = value.trim().uppercase(Locale.getDefault())
       }
   }
   operator fun getValue(thisRef:Any?,property:KProperty<*>):String?{
       return stringValue

   }
}

fun main() {
    var result = student()
    result.firstName = "ayan"
    result.lastName = "ibnIrshad"
    println(result)
}
