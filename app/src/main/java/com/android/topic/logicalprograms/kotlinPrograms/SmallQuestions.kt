package com.android.topic.logicalprograms.kotlinPrograms

data class User(val id:Int,val name:String)

fun main() {


    //(1) Program 1
    program1()

    //(2) Program two
    program2()

    val list = arrayOf(3, 5, 100, 8, 17, 19)

    for (i in list.indices) {
        for (j in i + 1 until list.size) {

            val tempI = list[i]
            val tempJ = list[j]

            if (tempI > tempJ) {
                list[i] = tempJ
                list[j] = tempI
            }
        }
    }

    list.forEach {
     //   println(it)
    }
}

fun program2() {

    val s:String? = null
    println(s)
    println(s?.length)

}

fun program1() {
    // Here I'm using String extension function with nullable string and print default value
    // from extension function, so for that we must need to make extension function nullable
    // It can't work like this -> fun String.printString() = this ?: "Default"
    val s :String? = null
    println(s.printString())
}

fun String?.printString() = this ?: "Default"