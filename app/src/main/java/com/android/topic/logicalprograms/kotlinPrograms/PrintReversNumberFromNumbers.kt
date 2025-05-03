package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    val originalNumbers = 123456
    var reverse = 0

    for (i in originalNumbers.toString()){
        reverse = i.toString().toInt()
    }

    println(reverse)

}