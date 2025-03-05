package com.android.topic.logicalprograms.oppsConcept.inheritance

/*

 Why Inheritance?

Inheritance allows you to define common functionality in a parent (super) class
and then reuse this functionality in child (sub) classes. This reduces code
duplication and allows you to write less code by reusing existing code in a
more organized manner.


 (1) In kotlin we can't extend/inherit any class directly. first we need to make it open
 (2) Also we can't use any function directly from Parent class, first we need to make it open function
 (3) We can't use private properties in child class from parent

* */

fun main() {

    val dog = Dog()
    dog.drinking(dog.animalName)
    dog.eating(dog.animalName)
    dog.running(dog.animalName)
    dog.feature()

    val horse = Horse()
    horse.drinking(horse.animalName)
    horse.eating(horse.animalName)
    horse.running(horse.animalName)
    horse.feature()

    val elephant = Elephant()
    elephant.drinking(elephant.animalName)
    elephant.eating(elephant.animalName)
    elephant.running(elephant.animalName)
    elephant.feature()

    val donkey = Donkey()
    donkey.drinking(donkey.animalName)
    donkey.eating(donkey.animalName)
    donkey.running(donkey.animalName)
    donkey.feature()
}

open class Animal {

    open fun eating(animal:String) {
        println("$animal is eating")
    }

    open fun drinking(animal:String){
        println("$animal is drinking water")
    }

    open fun running(animal:String){
        println("$animal is running")
    }

}

class Dog : Animal(){
    val animalName : String = "Dog"
    fun feature(){
        println("I'm loyal\n")
    }
}

class Horse : Animal(){
    val animalName : String = "Horse"
    fun feature(){
        println("I'm running very fast\n")
    }
}

class Elephant : Animal(){
    val animalName : String = "Elephant"
    fun feature(){
        println("I can lift more weight.\n")
    }
}

class Donkey : Animal(){
    val animalName : String = "Donkey"
    fun feature(){
        println("I'm strong for labor work\n")
    }
}