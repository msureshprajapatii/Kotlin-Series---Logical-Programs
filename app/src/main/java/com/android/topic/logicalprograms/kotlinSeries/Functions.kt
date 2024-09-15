package com.android.topic.logicalprograms.kotlinSeries

import java.util.Date

// Functions is block of code to perform certain functionality
// We can reused functions. its beneficial for boiler plate code
// Function can have zero or more arguments
// Function can have one return type
// We can create function we fun keyword
// We can also right functions without arguments and return type
// Example

fun showMessage(){
    println("This is simple functions")
}

// We can right function with arguments an without return type
fun checkEvenOdd(number:Int){

    if (number % 2 == 0){
        println("Even")
    } else {
        println("Odd")
    }
}

// Function with only return type
fun getCurrentDate(): Date {
    val date = Date()
    return date
}


// Function with arguments and return type
fun getSum(num1: Int, num2: Int): Int {

    val sum = num1 + num2
    return sum
}

fun getMultiplication() : Int = 3 * 2
// In single line function we don't need to specify return type,
// its automatically consider from return value


// We can also provide default argument in function like
// In below function default value is 2 if we don't pass argument it will take 2 as argument value
fun howManyDeveloperYouHave(developer:Int = 2){
    println("I have $developer in my office")
}

fun main() {


    //(1) Simple function
    showMessage()

    //(2) Function which take on argument and return nothing
    checkEvenOdd(5)

    // We can also called function with it argument name like below for checkEvenOdd function
    checkEvenOdd(number = 10)

    //(3) Function with zero argument and has return type
    val date = getCurrentDate()
    println(date)

    //(4) Function which take two arguments and return one Int
    val sum = getSum(5,10)
    println(sum)

    //(5) We can write single line function in kotlin
    val singleLineResult = getMultiplication()
    println(singleLineResult)

    //(6) Default argument
    // Call function with argument
    howManyDeveloperYouHave(5)

    // Call function without argument
    howManyDeveloperYouHave()


}


