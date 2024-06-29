package advancedTopic

/*
nested class means creating the class inside the class
 */

class Box(val width:Int,val length:Int,val height:Int){

    inner class Content(var content:String){ // without inner keyword you don't use the main class parameter

        fun printInfo(){
            println("$content this is the scene")
        }

        fun multiply(){
          println("${width*length*height}")
        }
    }


}

fun main() {
    var box = Box(25,25,10)
    var result = box.Content("Hello")
    result.printInfo()
    result.multiply()
}