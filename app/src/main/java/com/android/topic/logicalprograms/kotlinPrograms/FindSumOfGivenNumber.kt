package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    // Find sum of objects from array

    val numberList = arrayOf(1,2,3,4,5)
    var numObj = 0

    for (num in numberList){
        numObj += num
    }
    println("sum from array = $numObj")


    // Find sum of given number from Int
    val numbers = 12345
    var sum = 0

    for (i in numbers.toString()){
        sum += i.toString().toInt()
    }

    println("sum from Int = $sum")

}