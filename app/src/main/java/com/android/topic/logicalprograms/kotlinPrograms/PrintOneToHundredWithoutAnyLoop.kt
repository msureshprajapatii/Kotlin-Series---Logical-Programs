package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    // Using recursive function we can do that
    //printNum(1)

    // Same logic with generic number
    printNumberWithGenericWay(1,15)

}

fun printNumberWithGenericWay(startNum: Int, endNum: Int) {
    var newNum = startNum
    if (startNum <= endNum){
        println(startNum)
        newNum++
        printNumberWithGenericWay(newNum,endNum)
    }
}

fun printNum(num:Int) {
    var n = num
    if (num <= 100){
        println(num)
        n++
        printNum(n) // call same function again with +1 value
    }
}