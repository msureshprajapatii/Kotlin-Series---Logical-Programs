package com.android.topic.logicalprograms.kotlinSeries

// In real life programming we have many scenarios where we need to check conditions. so for that
// We can check it with if else if conditions but its not maintain user readability or it can't be
// Easy to modify. so for that we can use When condition it's more readable and easy to use

// In java, we have switch its similar to When condition

fun main() {

    val developer = "Python"

    when(developer){

        "iOS" -> println("is iOS developer")
        "Java" -> println("is java developer")
        "Python" -> println("is Python developer")
        "Kotlin" -> println("is Python developer")
        ".Net" -> println("is .Net developer")
        "PHP" -> println("is PHP developer")
        else -> println("is C++ developer")
    }

    // We can also use When as expression
    //Example

    val component = "Activity"

    val result = when(component) {
        "Activity" -> "Component is Activity"
        "Fragment" -> "Component is Fragment"
        "Service" -> "Component is Service"
        else -> "Nothing Used"
    }

    println(result)


    // Also we can use range in when condition
    val salary = 7

    val salaryResult = when(salary){
        5 -> "This is Rahul's salary"
        12 -> "This is Alpesh's salary"
        in 6..9 -> "This is Dipak's salary"
        in 8..12 -> "This is Ramesh's salary"
        else -> "No one has this salary"
    }

    println(salaryResult)

}