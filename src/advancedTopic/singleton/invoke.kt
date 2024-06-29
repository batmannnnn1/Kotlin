package advancedTopic.singleton

/*
 INVOKE FUNCTION

   with the help of invoke function you can use object as a function
   you don't want to create the object and call the method
 */

class Greeting(var greeting:String){

    operator fun invoke(name:String){
        println("$greeting,$name")
    }

}

fun main() {
    var result = Greeting("Hello")
    result("ayan")
    println(result)
}