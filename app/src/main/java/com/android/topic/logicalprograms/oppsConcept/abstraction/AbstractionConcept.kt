package com.android.topic.logicalprograms.oppsConcept.abstraction

/*

(1) What happens if an interface and an abstract class both have a method with the same name but different return types? Can a class implement both?
(2) Can an abstract class have a constructor? If yes, how and when is it called?
(3) If a class implements two interfaces, both with the same default method name — does it compile? How do you resolve it?
(4) Can a class extend two abstract classes? Why or why not?
(5) What happens if an abstract class implements an interface but doesn’t implement its methods?
(6) If you have a class A with a method foo(), and an interface with default foo(), and you extend class A and implement the interface, which foo() is used?
(7 )Can you declare a static method in an interface? Can it be overridden?
(8) What happens if you declare the same method in an interface and an abstract class but mark it as default in the interface and abstract in the abstract class?
(9) What if a class implements an interface but doesn’t override all its methods and is not abstract?
(10)Can an interface extend a class in Java? Why or why not?"

* */
fun main() {

    val animal: AnimalInterface = Animal()

}

class Animal : AnimalInterface {
    override fun abc() {

    }

    override fun bcd() {

    }


}

interface AnimalInterface {
    fun abc()
    fun bcd()

    fun efg() {

    }

    fun hij() {

    }
}

abstract class AnimalAbstract {
    open fun makeVoice() {
        print("This method is from Abstract class")
    }
}