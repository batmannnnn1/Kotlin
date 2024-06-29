package advancedTopic.inline

/*
Noinline is used when you don't want a particular lambda to be inlined in an inline function.
This can be useful when you want some lambdas to stay as regular function objects.
 */

inline fun process(inlineAction:()->Unit,noinline regularAction:()->Unit){

    inlineAction() // this will be inlined
    regularAction() // this will not be inlined

}

fun main() {
    process({
        println("this is inlined")
    },{
       println("this is not inlined") }

    )}

