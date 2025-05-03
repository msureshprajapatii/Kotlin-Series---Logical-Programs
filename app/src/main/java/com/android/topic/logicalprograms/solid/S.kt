package com.android.topic.logicalprograms.solid

/*
 || Single Responsibility Principle ||
- S for Single Responsibility Principle
- A class should have only one responsibility or one reason to change
- For example if i have class for email validation then that class should only perform for
  email validation its should not perform another task like password validation etc.
- It might be increase number of classes but highly follow single responsibility principle

 || Advantages of following Single Responsibility Principle ||
    - Improved Maintainability
    - Better Readability & Understandability
    - Simpler Testing
    - Reduced Coupling
    - Supports Clean Architecture
*/

fun main() {

    // This are not following Single Responsibility Principle

    val validator1 = Validation1()
    validator1.isEmailValid()
    validator1.isPasswordValid()
    validator1.isUserNameValid()


    // This are following Single Responsibility Principle

    val emailValidator = EmailValidator()
    emailValidator.validate(email = "suresh@gmail.com")

    val passwordValidator = PasswordValidator()
    passwordValidator.validate(password = "123456")

    val userNameValidator = UserNameValidator()
    userNameValidator.validate(username = "suresh")

}

//This below example is not following Single responsibility principle

class Validation1 {
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
    val passwordRegex = Regex("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}$")
    val usernameRegex = Regex("^[a-zA-Z0-9._-]{3,20}$")

    fun isEmailValid() : Boolean{
        // Write logic here
        return false
    }

    fun isPasswordValid() : Boolean {
        // Write logic here
        return false
    }

    fun isUserNameValid() : Boolean{
        // Write logic here
        return false
    }
}

// This below example is following Single Responsibility Principle

interface Validator {

    fun validate(value:String) : Boolean
}

class EmailValidator : Validator {

    private val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")

    override fun validate(email: String) : Boolean{
        // Write your email validation logic here
        return emailRegex.matches(email)
    }

}

class PasswordValidator : Validator {

    private val passwordRegex = Regex("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}$")

    override fun validate(password: String) : Boolean {
        // Write your password validation logic here
        return passwordRegex.matches(password)
    }
}

class UserNameValidator : Validator {

    private val usernameRegex = Regex("^[a-zA-Z0-9._-]{3,20}$")

    override fun validate(username: String) : Boolean {
        // Write your Username validation logic here
        return usernameRegex.matches(username)
    }
}