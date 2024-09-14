package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    val originalString = "SureshPrajapati"
    var updatedString = ""

    for (i in originalString){
        updatedString = "".plus(i).plus(updatedString)
    }

    println(updatedString)
}