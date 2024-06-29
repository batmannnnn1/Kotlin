package advancedTopic.inline

/*
When you use the inline keyword with a function,
it means the compiler will copy the function's code to the place where it is called.
Sometimes, when using inline functions, you might want to ensure that a lambda passed to this function cannot use return to exit the enclosing function early.
This is where cross-inline comes in.

cross inline ensures that the lambda cannot use return to exit the outer function early.
Instead, it can only return from the lambda itself.
 */

inline fun doTask(crossinline action:()->Unit){
    println("Starting the task")
    action()
    println("Ending the task")
}

fun main() {

    doTask {
        println("Doing the task : action lambda")
        // Here, you could use `return` to exit `main`
        //return@doTask  //  Uncommenting this would cause a compilation error
        
    }
}