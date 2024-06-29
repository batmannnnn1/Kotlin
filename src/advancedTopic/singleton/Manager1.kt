package advancedTopic.singleton
/*
 but in kotlin for using singleton pattern you just create the object
 and kotlin do everything under the hood

 You can use object to create utility classes that hold static methods and constants.
 This is similar to creating utility classes in other languages.

 Utility Functions: Provides a simple way to group utility functions and constants.
No Instantiation Required: You can call methods directly without creating an instance.
 */
object User {
  init {
      println("Singleton Pattern")
  }
}

object DatabaseManager {
    val name = "MyDatabase"

    fun connect() {
        println("Connected to $name")
    }
}

fun main() {
    // Accessing the singleton instance
    DatabaseManager.connect()
}
