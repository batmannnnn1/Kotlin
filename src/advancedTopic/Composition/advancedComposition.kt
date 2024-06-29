package advancedTopic.Composition

/*
Delegation is a type of advanced Composition
 */

interface SoundBehaviour{
    fun makeSound()
}

class Dog:SoundBehaviour{
    override fun makeSound() {
       println("Wolf")
    }

}

class Robot(dog: SoundBehaviour):SoundBehaviour by dog{


}

fun main() {
    val dog = Dog()
    val result = Robot(dog)
    result.makeSound()
}
/*
SoundBehavior is an interface with a makeSound function.
Dog implements SoundBehavior and provides its own implementation of makeSound.
Robot class accepts a SoundBehavior instance and delegates its makeSound implementation to the dog instance using by.
When robot.makeSound() is called, it internally calls dog.makeSound().
 */