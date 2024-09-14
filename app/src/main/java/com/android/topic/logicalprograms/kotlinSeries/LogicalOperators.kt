package com.android.topic.logicalprograms.kotlinSeries

// we have three logical operators
// (1) && (AND) Operator
// (2) || (OR) Operator
// (3) !  (NOT) Operator

fun main() {

    // (1) && (AND) Operator
    // It will return true if both or more values are true else return false

    var isKotlinDeveloper = false
    var isExperienced = true

    var youAreHire = isKotlinDeveloper && isExperienced
    println(youAreHire) // Return false


    // (2) || (OR) Operator
    // It will return true if one of the value is true from condition.

    isKotlinDeveloper = true
    isExperienced = false

    youAreHire = isKotlinDeveloper || isExperienced
    println(youAreHire) // Return true


    // => Short Circuiting
    // Short-circuiting is particularly useful when dealing with functions or expressions
    // that might have side effects or are computationally expensive. For instance, when
    // checking for null values or conditions that can lead to errors, short-circuiting helps
    // avoid potential exceptions.

    // (3) ! (NOT)
    // It will return opposite value of actual value

    val isApplied = false
    println(!isApplied) // Return true

}
