package com.android.topic.logicalprograms.solid

/*
|| Interface segregation ||

- Segregation means divide interface into small chunks
- Interface should very concise
- They have very specific use case
- If we are following Interface Segregation in this case our number of code line or number of interface
  classes will be increase,
- But it dose not matter because our code quality will improve

*/

// Below example if not following Interface segregation
// because its implement unnecessary methods which is not useful for each class
// A class should be implement only specific methods which is useful for that class

interface Employee1 {

    fun washDishes()
    fun cook()
    fun serve()
}

// So below class is specifically designed for chef
// Chef can only cook the food, he can't wash the dishes and serve the food
// So here serve() and washDishes() methods are unnecessary implemented

class Chef : Employee1 {
    override fun washDishes() {
        TODO("Not yet implemented")
    }

    override fun cook() {
        TODO("Not yet implemented")
    }

    override fun serve() {
        TODO("Not yet implemented")
    }
}

// Also here waiter can only serve the food, so cook() and washDishes() methods are unnecessary implemented
class Waiter : Employee1 {
    override fun washDishes() {
        TODO("Not yet implemented")
    }

    override fun cook() {
        TODO("Not yet implemented")
    }

    override fun serve() {
        TODO("Not yet implemented")
    }
}

// I below class Helper can only wash the dishes so cook() and serve() methods are unnecessary implementation
class Helper : Employee1 {
    override fun washDishes() {
        TODO("Not yet implemented")
    }

    override fun cook() {
        TODO("Not yet implemented")
    }

    override fun serve() {
        TODO("Not yet implemented")
    }
}

// Below example is following interface segregation
// For that we can create one interface which can have only those methods which are common for all the employees
// And for different task or work, we should create separate interfaces and method,
// So here all employees get salary and all employees should start their work on time
// We create interface which have two methods getSalary() and startOnTime() which are common for the all employees

// This can include only common task or work for all the employees
interface Employees {
    fun getSalary()
    fun startOnTime()
}

// In below three interfaces are extended Employee interface so it can implement common task also
interface ChefEmployee : Employees {
    fun cook()
}

interface WaiterEmployee : Employees {
    fun serve()
}

interface HelperEmployee : Employees {
    fun washDishes()
}

// So here  Chef class have only those methods which are relevant to chef work
// chef can only cook, start work on time and get his salary
// no unnecessary implementation here
class Chef1 : ChefEmployee {
    override fun cook() {
        TODO("Not yet implemented")
    }

    override fun getSalary() {
        TODO("Not yet implemented")
    }

    override fun startOnTime() {
        TODO("Not yet implemented")
    }

}

// Here also Waiter have only relevant methods, like serve, salary and start work
// No any other unnecessary method implementations
class Waiter1 : WaiterEmployee {
    override fun serve() {
        TODO("Not yet implemented")
    }

    override fun getSalary() {
        TODO("Not yet implemented")
    }

    override fun startOnTime() {
        TODO("Not yet implemented")
    }
}

// Same for helper, it can only wash the dishes. no any extra methods

class Helper1 : HelperEmployee {
    override fun washDishes() {
        TODO("Not yet implemented")
    }

    override fun getSalary() {
        TODO("Not yet implemented")
    }

    override fun startOnTime() {
        TODO("Not yet implemented")
    }

}