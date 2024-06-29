package advancedTopic.DSL

/*
       Understanding this keyword in kotlin

 In Kotlin, this refers to the current instance of a class. When you call a method on an object,
 this inside that method refers to the object the method was called on.

In the context of the Builder Pattern, returning this from each method means that each method call returns the builder instance itself.
 This allows subsequent method calls to be chained directly onto the result of the previous method call.

 */

// Example of builder pattern class with this keyword

class Sandwich private constructor(
    val bread:String?,
    val meat:String?,
    val cheese:String?,
    val vegetables:List<String>?,
    val sauces:List<String>
){

    // nested class builder

    class Builder(
        var bread: String? = null,
        var meat: String? = null,
        var cheese: String?=null,
        var vegetables: MutableList<String> = mutableListOf(),
        var sauces: MutableList<String> = mutableListOf()
    )
    {
        // Builder method to set bread

        fun bread(bread:String):Builder{
            this.bread = bread
            return this  // Returning the current Builder instance
        }

        // Builder method to set meat
        fun meat(meat: String): Builder {
            this.meat = meat
            return this // Returning the current Builder instance
        }

        // Builder method to set cheese
        fun cheese(cheese: String): Builder {
            this.cheese = cheese
            return this // Returning the current Builder instance
        }

        // Builder method to add a vegetable
        fun addVegetable(vegetable: String): Builder {
            this.vegetables.add(vegetable)
            return this // Returning the current Builder instance
        }

        // Builder method to add a sauce
        fun addSauce(sauce: String): Builder {
            this.sauces.add(sauce)
            return this // Returning the current Builder instance
        }

        // Method to build the Sandwich object
        fun build(): Sandwich {
            return Sandwich(bread, meat, cheese, vegetables, sauces)
        }

        override fun toString(): String {
            return super.toString()
        }
    }

}

// When you use the builder, each method returns the same Builder instance,
// allowing you to chain method calls together.

fun main() {
    val sandwich = Sandwich.Builder()
        .bread("Whole Grain")  // Sets bread and returns the Builder instance
        .meat("Turkey")          // Sets meat and returns the Builder instance
        .cheese("Cheddar")       // Sets cheese and returns the Builder instance
        .addVegetable("Lettuce")  // Adds a vegetable and returns the Builder instance
        .addVegetable("Tomato") // Adds another vegetable and returns the Builder instance
        .addSauce("Mayo")      // Adds a sauce and returns the Builder instance
        .build() // Builds and returns the Sandwich object

 println(sandwich)
}