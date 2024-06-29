package oops

/*
 class is a blueprint
 object is a real time properties

 suppose class is a house structure which have the properties and behaviour
 when we turned structure into real time property it's called object

 when we create the function inside the class we called her method

 */


class marvel {


    fun streetHero(vararg hero:String){
        for (marvelhero in hero)
            println(" af $marvelhero")
    }

}

fun main(){

    var heroshit = marvel()
    heroshit.streetHero("Spiderman","Daredevil","Batman","flash","peacemaker")

}