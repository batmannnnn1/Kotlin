package advancedTopic
/*
enum class is used for storing the constant values
every value inside the enum class is object
you only use interface with enum
 */
interface DoColor{
    fun doColor()
}

enum class Color(var value:Int):DoColor{
    RED(10){
        override fun doColor() {
            println("The color is red and the value is $value")
        }
    },
    GREEN(25){
        override fun doColor() {
            println("The color is green and the value is $value")
        }
    },
    VIOLET(35){
        override fun doColor() {
            println("The color is violet and the value is $value")
        }
    },
    WHITE(42){
        override fun doColor() {
            println("The color is white and the value is $value")
        }
    }
}

fun main() {
    Color.RED.doColor()

}