package com.android.topic.logicalprograms.kotlinPrograms

//Remove duplicate characters from string

fun main() {

    val originalString = "AABEDDEFGADBA"
    val updatedString = removeDuplicates(originalString)

    println("Original : $originalString")
    println("Updated : $updatedString")

}

fun removeDuplicates(originalString: String): String {
    var temp = ""

    for (character in originalString) {
        if (temp.contains(character).not()){
            temp = temp.plus(character)
        }
    }
    return temp
}
