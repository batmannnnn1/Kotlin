package advancedTopic

/*
Collection is used for storing the data item
like list for number , set for unique items , map for key and value pair

     - there are two type for collection
   (mutableListOf)  Mutable -> like a regular list, but you can change its elements (add, remove, update).
    Immutable-> you cannot change its element or don't add new one

 */

fun main() {
    val immList = listOf<String>("ayan","saifi","zarif","kaif") // immutable list
     immList.forEach { } // println(it)


    val mutableList = mutableListOf<String>("Money heist","The boys","oppenheimer","lokiS2","Lucifer")
    mutableList.add("Jack Ryan")
    mutableList.remove("Lucifer")
       //mutableList.forEach { println(it) }


    val immSet = setOf("Ayan","saifi","saifi","kaif")
    //immSet[0] you don't access the element in the set like this
    // if you add the duplicate element the set don't store the value

    // immList.forEach { println(it) }

    val mutableSet = mutableSetOf<String>("Spiderman no way home","Oppenheimer","multiverse of madness","interstellar")
    mutableSet.add("Napoleon")
   //  mutableSet.forEach { println(it) }

    val immMap = mapOf<Int,String>(1 to "Krsna",2 to "Talha",3 to "Seedhe maut",4 to "Karma")
   // immMap.forEach { t, u -> println("$t and $u") }

    val mutableMap = mutableMapOf<Int,String>(1 to "Downer at dusk",2 to "Still here",3 to "Lunch break")
    mutableMap[4] = "khanabadosh"
    mutableMap.forEach { t,u-> println("$t and $u") }

}