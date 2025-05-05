package com.android.topic.logicalprograms.solid

/*
|| Liskov Substitution Principle

- It little tricky to explain
- Child classes should behave like their parent classes, without changing the expected behavior.
- If a class B is a subclass of class A, then we should be able to replace A with B without breaking the program
 */

// Below example is Violating Liskov Substitution Principle

open class Vehicle {
    open fun startEngine() {
        println("Engine started")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine started")
    }
}

class Bicycle : Vehicle() {
    override fun startEngine() {
        throw UnsupportedOperationException("Bicycles don't have engines!")
    }
}

fun drive(vehicle: Vehicle) {
    vehicle.startEngine()
}

fun main() {

    // When Liskov Substitution Principle is not followed
    drive(Car())      // Car engine started
    drive(Bicycle())  // CRASH! UnsupportedOperationException


    // When Liskov Substitution Principle is Followed

    val car = Car1()
    val bicycle = Bicycle1()

    startEngine(car)          // Car engine started
    driveVehicle(car)         // Car is moving

    driveVehicle(bicycle)     // Bicycle is pedaling forward
    // startEngine(bicycle)      Compile-time error (perfect!)
}

// Because Bicycle cannot behave like a Vehicle.
// If we treat it like a Vehicle and call startEngine(), it crashes at runtime.

// SO in below example i have Apply Liskov Substitution Principle

interface Vehicle1 {
    fun move()
}

interface EngineVehicle : Vehicle1 {
    fun startEngine()
}

class Car1 : EngineVehicle {
    override fun startEngine() {
        TODO("Not yet implemented")
    }

    override fun move() {
        TODO("Not yet implemented")
    }

}

class Bicycle1 : Vehicle1 {
    override fun move() {
        TODO("Not yet implemented")
    }

}

fun driveVehicle(vehicle: Vehicle1) {
    vehicle.move()
}

fun startEngine(vehicle: EngineVehicle) {
    vehicle.startEngine()
}