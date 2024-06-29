fun main(){
    // loops use for repeating the elements

    // while-> first check the condition and then execute the code

    var num = 1
//    while (num<=10){
//        println("ayan $num")
//        num++
//    }

    // do while-> first to execute the code only one time then check the statement

    do {
         println("zarif $num")

    }
       while (num>2);

     // for loop -> used for the iterating the array element

     var marvel:Array<String> = arrayOf("spiderman","kang","ironMan")

    for (dc in marvel.reversed()){
        println(dc)
    }
}