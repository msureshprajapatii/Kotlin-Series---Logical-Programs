package com.android.topic.logicalprograms.kotlinSeries

fun main() {

    // We have two variation for increment

    //(1) Pre Increment
    var i = 10
    println(i++)
    // Post increment is first used the value and then perform operation on it
    // That's still output is 10



    //(2) Post Increment
    var j = 10
    println(++j)
    // Pre increment is first perform operation on it and then use it
    // That's why output is 11



    // Example
    var a = 10
    println(a++ + ++a) // Output will be 22

    //Explanation
    // 1 : a++ is return 10 as it is now a's value is 11
    // 2 : ++a is plus on a mean 11 + 1 = 12
    // 3 : now (a++) + (++a) means : (10) + (12) = 22


}