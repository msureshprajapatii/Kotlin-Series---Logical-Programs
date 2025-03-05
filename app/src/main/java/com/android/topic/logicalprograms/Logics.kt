package com.android.topic.logicalprograms

import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.text.toUpperCase

fun main(args: Array<String>) {

    val child = Child()
    child.immutableName = "Himani"
    child.show()
}

open class Parent {

    open var immutableName: String = "Parent"
    protected open fun show(){

    }
}

class Child : Parent() {

    override var immutableName: String = "CHild"
        get() = field
        set(value) {
            field = value.toUpperCase()
        }

    public override fun show() {
        println(this.immutableName)
    }
}