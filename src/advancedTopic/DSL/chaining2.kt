package advancedTopic.DSL

/*
we can use apply instead of this.return for referring builder instance
{} inside the code block assign the value through the parameter to the property
 */


class Sandwich1 private constructor(
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

        fun bread(bread:String) = apply { this.bread=bread}


        // Builder method to set meat
        fun meat(meat: String) = apply { this.meat=meat }

        // Builder method to set cheese
        fun cheese(cheese: String) = apply { this.cheese=cheese }

        // Builder method to add a vegetable
        fun addVegetable(vegetable: String)=apply { this.vegetables.add(vegetable) }

        // Builder method to add a sauce
        fun addSauce(sauce: String)=apply { this.sauces=sauces }

        // Method to build the Sandwich object
        fun build(): Sandwich1 {
            return Sandwich1(bread, meat, cheese, vegetables, sauces)
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