package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    val numbers = arrayOf(21,34,56,935,12,78,9,34,3,8,24,557,342,753,23)
    var small = 0
    var large = 0

    for (i in numbers){

        if (i > large){
            large = i
        }

        if (i < small || small == 0){
            small = i
        }
    }

    println("smallest number = $small")
    println("largest number = $large")

}