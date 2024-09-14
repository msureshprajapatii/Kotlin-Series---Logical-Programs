package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    val list = mutableListOf(1,2,3,4,5,6,7,7)
    val duplicates = mutableListOf<Int>()

    for (i in list.indices){

        for (j in i+1 until list.size){

            val tempI = list[i]
            val tempJ = list[j]

            if (tempI == tempJ){
                duplicates.add(tempJ)
            }
        }
    }

    println("Duplicate Result : \n")

    duplicates.forEach {
        println(it)
        if (list.contains(it)){
            list.remove(it)
        }
    }

    println("Final Result : \n")
    list.forEach {
        println(it)
    }
}