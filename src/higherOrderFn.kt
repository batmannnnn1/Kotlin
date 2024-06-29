

// if any function takes any other function as an argument or returned another function
// it's called the higher order function
// if you have to use another function as an argument use
// the callback:(enter any argument or not your wish)->Unit
// useful for listener interface


  fun sumTwoNumber(num1:Int,num2:Int,callBack:()->Unit){

      println("Sum of two number is ${num1+num2}")
      callBack()
  }

 // one more function which takes the another funtion arguments also his return type and her parameter

 fun cube(num:Int,callBack: (message:String) -> Unit):
             (num:String)->Unit{

                 println("the cube of the number is ${num*num*num}")
                 callBack("Hello user third way !")
     return callBack;
 }



 fun main(){

     val comebackfun = {
         println("Hello this is the comeBack")
     }
     sumTwoNumber(45,20,comebackfun) // you can add the function after the argument in the parentheses
     // like this

     sumTwoNumber(20,20){
         println("Hello second method for the callBack")
     }

    var cube1 = cube(20,){
         println(it)
     }
     cube1("returned the function")
 }



