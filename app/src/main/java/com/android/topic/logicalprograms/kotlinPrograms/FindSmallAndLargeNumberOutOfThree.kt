package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    // (1) Find largest number out of three
    var a = 10
    var b = 25
    var c = 20

    if (a > b && a > c) {
        println("Largest number is a : $a")
    }
    else if (b > a && b > c) {
        println("Largest number is b : $b")
    }
    else {
        println("Largest number is c : $c")
    }


    // Find smallest number out of three
    if (a < b && a < c) {
        println("Smallest number is a : $a")
    }
    else if (b < a && b < c) {
        println("Smallest number is b : $b")
    }
    else {
        println("Smallest number is c : $c")
    }
}