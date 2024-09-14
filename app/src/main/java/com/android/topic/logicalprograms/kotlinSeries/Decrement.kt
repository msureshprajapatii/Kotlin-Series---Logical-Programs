package com.android.topic.logicalprograms.kotlinSeries

fun main() {

    // We have two variation for Decrement

    //(1) Pre Decrement
    var i = 10
    println(i--)
    // Post decrement is first used the value and then perform operation on it
    // That's still output is 10



    //(2) Post Decrement
    var j = 10
    println(--j)
    // Pre decrement is first perform operation on it and then use it
    // That's why output is 9



    // Example
    var a = 10
    println(a-- - --a) // Output will be 2

    //Explanation
    // 1 : a-- is return 10 and it is now a's value is 9
    // 2 : --a is minus on a mean 9 - 1 = 8
    // 3 : now (a--) - (--a) means : (10) - (8) = 2


}