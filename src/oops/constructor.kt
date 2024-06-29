package oops

/*

Constructors are like member functions that are called when object of the class is created
 they use for initially initialize the data members for objects

 two types primary and secondary
 primary constructor create in the header class
 and the secondary create inside the class

you can many constructor in one class but the var type are not the same
you can also use the (this) keyword for calling the one constructor by the another

 */

 // primary


class car constructor(name:String,owner:String) {

    init {
        println("these are the primary constructor")

        fun displayDetail(){
            println(name)
            println(owner)
        }
           println(displayDetail())
    }
}


// secondary constructor

class legacy{
   var name:String; // you can firstly initialize the instance variable in constructor
    var occupation:String; // and use this keyword for the instance variable reference

    constructor(name: String,occupation:String){
        this.name = name
        this.occupation = occupation

        println("these are the secondary constructor")
        println("here is the $name $occupation")
    }




}

 fun main(){

     var result = car("tesla","Elon Musk")
      var legaccy = legacy("Nehru ji","First Pm of india")
         println(legaccy.name)



 }