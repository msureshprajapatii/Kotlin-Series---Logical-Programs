package com.android.topic.logicalprograms.kotlinSeries

fun main() {

    // If Else condition is used to decide which block of code will be executed base on value
    // Basically its return true/false value

    val isDeveloper = false

    if (isDeveloper) {
        println("Make Application")
    } else {
        println("Learn coding")
    }


    // If else if condition

    val sureshSalary = 15
    val rameshSalary = 10

    if (sureshSalary > rameshSalary) {
        println("Suresh has a higher salary than Ramesh")
    } else if (sureshSalary < rameshSalary) {
        println("Ramesh has a higher salary than Suresh")
    } else {
        println("Both have equal salaries")
    }


    // In kotlin, we use if condition as an expression. Mean it can return statement as result
    // Let's check above example for it
    // It make code shorter

    val result = if (sureshSalary > rameshSalary) {
        "Suresh has a higher salary than Ramesh"
    } else if (sureshSalary < rameshSalary) {
        "Ramesh has a higher salary than Suresh"
    } else {
        "Both have equal salaries"
    }

    println("Result is = $result")


    // Let's check another example for if expression
    val findOddEven = if (20 % 2 == 0) "is Even" else "is Odd"
    println("Result : $findOddEven")
}