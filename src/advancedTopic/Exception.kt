package advancedTopic
/*
 when error occurs in runtime they called the exception
* Throwable
* Exception
* All other exception that are predefined

we can create the custom exception class

 */

class IllegalVoting(message:String):Exception(message)

fun vote(name:String,age:Int){

    if(age<18)
        throw IllegalVoting("Younger than 18")
     println(" $name Thanks for the voting")

}

fun main() {
    val result = try { vote("ayan",19) } catch (e:IllegalVoting) {e.message}
    println(result)

}
