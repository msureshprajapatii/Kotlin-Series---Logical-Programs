package com.android.topic.logicalprograms.kotlinSeries

/*

We have function overloading concept in kotlin
It means we can create same name multiple function, but its datatype or number of argument should be different
Lets check below addition function example
* */

fun addition(suresh:Int,ramesh:Int): Int {
    return suresh + ramesh
}

fun addition(suresh:Double,ramesh:Double): Double {
    return suresh + ramesh
}

fun addition(suresh:Int,ramesh:Int,mahesh:Int): Int {
    return suresh + ramesh + mahesh
}

fun addition(name: String): String {
    return "$name has 10 salary"
}

/*

In above example we have 4 function with same name
but all the function has different data types or number of arguments are different
In this way we can create multiple function with same name
This concept call function overloading

*/

fun main() {

    val result1 = addition(5,10)
    println(result1)

    val result2 = addition(2.0,4.5)
    println(result2)

    val result3 = addition(4,6,8)
    println(result3)

    val result4 = addition("Ramesh")
    println(result4)

}