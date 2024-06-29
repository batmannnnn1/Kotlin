package advancedTopic.singleton
/*
if you're creating the object of any class, and it might be costly for you
for creating the object everytime when you needed
so create the singleton instance and call the singleton instance throughout you whole application
this can help you to reduce you code

     SYNCHRONISED BLOCK
     The synchronised block in Kotlin ensures that only one thread can execute a particular block of code at a time.
     This is important in a multi-threaded environment where multiple threads might try to create an instance of the singleton simultaneously, potentially leading to multiple instances being created.


 */


// using the singleton pattern in another languages

class Manager private constructor(){
    companion object{
        private var instance:Manager?=null

        operator fun invoke()= synchronized(this){
            if (instance==null)
                instance = Manager()
            instance
        }
    }
}

fun main() {

    println(Manager())
    println(Manager())
    User
}