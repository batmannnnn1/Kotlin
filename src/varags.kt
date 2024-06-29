/* the vararg modifier is used to declare a parameter that
accepts a variable number of arguments of the same type as much you can
and them stores all the data as an array
 */

 fun Aujla(vararg songs:String){
     for (karan in songs)
     println("Geeta'n di machine songs $karan")
 }


 fun main(){

     val aujlaSong = Aujla("52 bars","Winning speech","on Top","ywim")
     println(aujlaSong)


 }
