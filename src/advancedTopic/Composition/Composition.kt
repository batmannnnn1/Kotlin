package advancedTopic.Composition

/*
Composition is a design principle where a class contains references to objects of other classes as members.
 Rather than inheriting their behavior, the class delegates responsibilities to its composed objects, promoting code reuse and flexibility.


 When to Use Inheritance vs Composition
Inheritance is suitable when:

There is a clear "is-a" relationship between classes (e.g., Car is a Vehicle).
You want to enforce a common interface and leverage polymorphism.
Composition is suitable when:

There is a "has-a" relationship between classes (e.g., Car has an Engine).
You need flexibility in assembling behaviors dynamically or reusing components across different classes.


 */

class Engine{
    fun detail(){
        println("Electric Engine")
    }
}

class Car(private val engine: Engine){
    fun carDetail(){
        engine.detail()
    }
}

fun main() {
    val engine = Engine()
    val car = Car(engine)
    car.carDetail()
}