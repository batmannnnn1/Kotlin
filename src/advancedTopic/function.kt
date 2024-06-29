package advancedTopic

// FUNCTION -> it's a block of code which do specific task

 // NORMAL FUNCTION
 fun marvel(){
     println("Hero")
 }

// FUNCTION ALSO HAVE RETURN TYPE

fun dc():String{

    return "Batman is lit!"
}

 // WE CAN ALSO PASS THE PARAMETER

 fun sum(num1:Int,num2: Int){
     println(num1+num2)
 }

// We can also give the default value for parameter if user don't give us

 fun name(name: String="Ayan"){
     println("Name is $name")
 }

// SINGLE EXPRESSION FUNCTION
  fun multiply(a:Int,b:Int):Int = a*b

fun main() {
    marvel()
    println(dc())
    name()
    println(multiply(25,66))
}