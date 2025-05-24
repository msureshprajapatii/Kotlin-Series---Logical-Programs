package com.android.topic.logicalprograms.kotlinSeries

// Loops are use to execute same statement again and again until condition get false

fun main() {

    val colorsName = listOf("Black","White","Yellow","Blue","Pink","Orange")

    println("Normal for loop")
    for(color in colorsName){
        println(color)
    }

    println("Range for loop")
    //(1) Normal for loop with increment 1 value
    // This is Range loop
    for (i in 1..10) {
        println(i)
    }

    println("Step variation")
    //(2) We can plus more step instead of 1 increment every time. like below output
    // 1, 3, 5, 7, 9
    for (i in 1..10 step 2) {
        println(i)
    }

    println("Until variation")
    //(3) Now we check for loop with until variation
    // Basically it will not include upper bound into range
    // Ex: if we write for(i in 1 until 5) output : 1, 2, 3, 4
    for (i in 1 until 5) {
        println(i)
    }

    println("Step with until variation")
    //(4) We can also use step variation with until.
    for (i in 1 until 10 step 2) {
        println(i)
    }

    println("downTo variation")
    //(5) We have downTo variation which is used to execute statement top to bottom
    // Ex : 10 to 2 - for(i in 10 downTo 1) output : 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    // We can also use step variation with downTo
    for (i in 10 downTo 1) {
        println(i)
    }
}