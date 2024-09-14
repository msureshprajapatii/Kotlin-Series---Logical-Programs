package com.android.topic.logicalprograms.kotlinSeries

fun main() {

    // While loop is check condition first and if it is true then execute block of code

    var count = 1
    while (count <= 5) {
        println(count)
        count++
    }


    // Do while loop is first execute do block of code and then check while condition.
    // If while condition is true then again execute do block of code again in loop

    println()
    println() // Just for line spacing

    var rate = 1
    do {
        println(rate)
        rate++
    }
    while (rate <= 5)

}