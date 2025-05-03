package com.android.topic.logicalprograms.kotlinSeries


var number: Int? = null

fun main() {

    /* Let :
    *  (1) Here let is check null for applied object (number)
    *  (2) If object is null then its return 0 as we use elvis operator
    *  (3) Inside let block we can use object it self as below you can see it.
    *  (4) Let is return last statement of let block is as return type, as you can see below its return Int
    * */
    number = 10
    val letBlock: Int = number?.let {
        it + 1
    }?: 0

    println("Let result : $letBlock")

    /* Apply
    * (1) We use apply often in our code
    * (2) Mainly we use apply for modify object
    * (3) Its return updated object itself
    * */
    val person1 = Person(1,"Suresh")

    val applyBlock: Person = person1.apply {
        id = 2
        name = "Aarav"
    }
    println("Apply result : $applyBlock")


    /* Also
    * (1) Use it for performing additional actions (like logging, debugging, etc.) without modifying the object directly.
    * (2) The context object is it.
    * (3) Return object it self just like apply but without modification
    * */
    val person2 = Person(4,"Alpesh")

    val alsoBlock = person2.also {
        it.id = 5
        it.name = "Prakash"
    }
    println("Also result : $alsoBlock")

   /* Run
   * (1) Run is similar to also but its return last value as return type
   * (2) The context object is this.
   *
   * */
    val person3 = Person(3,"Dipak")

    val runBlock: Boolean = person3.run {
        id = 5
        "vijay"
        false
    }
    println("Run result : $runBlock")

    /* With
    * (1) Not an extension function (unlike the others)
    * (2) Takes an object as a parameter, and provides it as this inside the block.
    * (3) Returns the lambda result, just like run.
    * (4) Useful for calling multiple functions on the same object.
    * */

    val withBlockResult = with(StringBuilder()) {
        append("Hello, ")
        append("Kotlin!")
        toString()
    }

    println("With result : $withBlockResult")

}

data class Person(var id:Int,var name:String)