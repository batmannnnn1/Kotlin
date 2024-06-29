package advancedTopic

/*
sealed class is used for creating limited set of classes and constant
you only use sealed class in this file only here not access outside
like abstract or interface you don't initialize the sealed class
you have to create another class or function which initialize
 */

sealed class Data() {
    data class Success(val data: String) : Data()
    data class Failure(val error: String) : Data()
    object Loading : Data()
}
fun getData():Data{
    return Data.Failure((100..1000).random().toString())
}


fun main() {
    val data = getData()
    when(data){
        is Data.Failure ->{
          println(data)
        }
        Data.Loading -> {
           println(data)
        }
        is Data.Success ->{
          println(data)
        }
    }
}