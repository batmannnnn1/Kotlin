package advancedTopic.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/*
Delegates that are predefined in Kotlin Standard Library.
1 LAZY-> if you don't want to initialize the properties or class object initially
or want to initialize when needed to use by lazy

2 OBSERVABLE  DELEGATE -> if you want to observe the changes in properties use this
3 VETO-ABLE DELEGATE -> if you want to assign the value in certain condition
 means if your conditions are true then assign the value
 */

class HeavyStudent{
    init {
        println("This is heavy initialize")
    }
}

class Student(){
    val result by lazy { HeavyStudent() } // we want to initialize when we needed this lazy block only runs one time then store the value in result property
    var value:Int by Delegates.observable(0){ // observe the changes with the help of Delegates.observable
        property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("Old value is $oldValue")
        println("Old value is $newValue")
        println("Meta data is $property")
        
    }


    var age by Delegates.vetoable(18){
        property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("Old value is $oldValue")
        println("Old value is $newValue")
        newValue>=23
    }
}

fun main() {

    val result = Student()
    result.result
    result.value = 25
    result.value = 55
    result.age = 24

}