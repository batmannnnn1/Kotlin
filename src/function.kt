// function is used for doing any specific task
// example you want to fetch the data every time you want to fetch the data you should write the whole code
// but write the code in function and call the function as much you can
// without writing the whole code just call the function

 fun userName(name:String,email:String){
     println("The name is $name and the id is $email")

 }

      fun app(name: String,releaseDate:String):String{

          return "app name is $name and the release date is $releaseDate"
      }


  // we can also give the default in the arguments if the user by mistake
// don't give the value so system use the default one

   fun sayHello(greeting:String="Assalamualikum",user:String="User"):String{

         return "$greeting $user"
   }



 fun main(){

     var result = userName("ayan","saifiayan822@gmail.com")

     var result1 = app("Bismillah","Sept")
     println(result1)

     println(sayHello())

 }