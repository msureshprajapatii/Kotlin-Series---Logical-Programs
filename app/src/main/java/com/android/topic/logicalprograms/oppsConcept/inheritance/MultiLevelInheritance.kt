package com.android.topic.logicalprograms.oppsConcept.inheritance

fun main() {

    val cc = BB()
    cc.show()
}

open class AA {
    open fun show(){
        println("AA : Show()")
    }
}

open class BB : AA(){
    override fun show(){
        println("BB : Show()")
    }
}
class CC : BB(){

    override fun show(){
        println("CC : Show()")
    }
}