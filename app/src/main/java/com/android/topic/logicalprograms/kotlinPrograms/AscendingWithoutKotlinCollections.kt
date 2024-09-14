package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    val list = arrayOf(29,10,3,25,100,50,234,1,0,43)

    for (i in list.indices){

        for (j in i + 1 until list.size){

            val tempI = list[i]
            val tempJ = list[j]

            if (tempI > tempJ){
                list[i] = tempJ
                list[j] = tempI
            }
        }
        println(list[i])
    }
}