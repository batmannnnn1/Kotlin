package advancedTopic

/*
It is very easy to add new functionality if you own the class what if you don't own class
then it's very difficult to add new functionality
at this situation we use extension function its help to add functionality in existing classes
 */

fun String.getPrintInfo():String{
    return this.uppercase()
}

fun main() {
    var name = "ayan ibn irshad"
    println(name.getPrintInfo()) // see getPrintInfo function doesn't exist in the original string class, but we're using this like they exist in original class
}