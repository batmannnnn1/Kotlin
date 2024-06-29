package advancedTopic.DSL

/*
simpler DSL example for configuring a Car.
 This example will help you understand how to create and use a DSL without complex structures.
 */

//  Define the Car Structure

class Car{
    var model:String=""
    var engine= Engine()
    var wheels=Wheels()

    fun engine(init:Engine.()->Unit){
        engine.init() // engine.init() means "execute the init lambda with engine as the receiver".
    }

    fun wheels(init:Wheels.()->Unit){ // this is an extension function. It takes a lambda with receiver as its argument, allowing us to initialize and configure a Wheels instance.
        wheels.init()
    }


    override fun toString(): String {
        return  "Car(model='$model', engine=$engine, wheels=$wheels)"
    }
}


class Engine{
    var type:String=""
    var horsepower:Int=0

    override fun toString(): String {
        return "Engine(type= $type,horsepower= $horsepower)"
    }

}


class Wheels{
    var size:Int=0
    var type:String=""

    override fun toString(): String {
      return  "Wheels(size=$size, type='$type')"
    }
}

fun car(init:Car.()->Unit):Car{
    val car = Car()
    car.init()
    return car

     // After applying the lambda configuration, the function returns the car instance. This allows the caller to use the fully configured Car object.
    // also the reason why the chaining is happening
}

/*
This is an extension function on the Car class. It takes a lambda with receiver of type Car.
Inside this function, a new Car object is created.
The init lambda is applied to the Car object, allowing for configuration of the Car using the lambda syntax.
Finally, the configured Car object is returned.
 */

fun main() {
// using the DSL
    val myCar = car {
        model="Tesla Model S"
        engine {
            type="Electric"
            horsepower=762
        }
        wheels {
            size=21
            type="alloy"
        }
    }

println(myCar)

}