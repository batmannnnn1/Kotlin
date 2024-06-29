package oops.other

/*
An enum class is used when you need a predefined set of constants.
Think of it as a list of options that are fixed and do not change.
 WHICH CANNOT BE CHANGED AND WE DON'T INITIALIZE THE CLASS
 WE ONLY USE THIS 6 OBJECT

 EXAMPLE

Day is an enum class with seven constants representing days of the week.
The when statement checks the value of day and prints a message.

 */


 enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
    fun PrintDay(day: Day){

        when(day){
         Day.MONDAY->println("Start of the work week")
            Day.FRIDAY -> println("Almost weekend!")
            Day.SUNDAY -> println("Rest day")
            else -> println("Just another day")

        }
    }

fun main() {
    val today = Day.FRIDAY
    PrintDay(today) // polymorphism -> don't know the PrintDay method's value kotlin find at the runtime
}

