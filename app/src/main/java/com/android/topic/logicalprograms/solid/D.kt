package com.android.topic.logicalprograms.solid

/*
|| Dependency Inversion Principle ||

- A high level concrete class should not depend on low level concrete class
- instead of the both concrete class should depend on abstraction
*/

// Let see how it look without following Dependency Inversion principle
// So in below example high level class is totally depends on low level concrete class
// And if we want to add some other validation like username validator then we need to modify current class so its also
// violet Open close principle,
class LoginHandlerWithoutDIP {

    private val emailValidator: EmailValidator = EmailValidator()
    private val passwordValidator: PasswordValidator = PasswordValidator()

    fun login(email: String, password: String) {
        if (emailValidator.validate(email) && passwordValidator.validate(password)) {
            // Write your login logic here
        }
    }
}

// Check below example which following Dependency inversion principle

class LoginHandler(
    private val emailValidator: Validator,
    private val passwordValidator: Validator
) {

    fun login(email: String, password: String) {
        if (emailValidator.validate(email) && passwordValidator.validate(password)) {
            // Write your login logic here
        }
    }

}


fun main() {

    // This is how we call without Dependency inversion principle

    val loginHandlerWithoutDIP = LoginHandlerWithoutDIP()
    loginHandlerWithoutDIP.login(email = "suresh@gmail.com", password = "123456")

    // Here we are following Dependency Injection Principle
    val loginHandler = LoginHandler(
        emailValidator = EmailValidator(),
        passwordValidator = PasswordValidator()
    )

    loginHandler.login(email = "suresh@gmail.com", password = "123456")

}