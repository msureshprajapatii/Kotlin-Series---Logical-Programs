package com.android.topic.logicalprograms.solid

/*
|| Open/Close Principle ||
--------------------------
- O for Open/Close Principle
- The class should be open for extension but close for modification
- If we change anything in current class it can break current functionality
- According to this Open/Close Principle we should not modify our existing class
  so for that we can create new class for the new functionality and extend existing
  class with this new class
 */

fun main() {

    // Here using new class GmailValidator we can access both gmail and email functionality
    // without any modification on existing EmailValidator2 class

    val gmailValidator = GmailValidator()
    gmailValidator.isEmailValid(email = "suresh@email.com")
    gmailValidator.isGmailValid(gmail = "suresh@gmail.com")
}


// For example if we have already email validator class and
// now i want to add Gmail validator functionality

// This below is not following Open close principle because its modify current class
// and add new functionality in existing class

 class EmailValidator1 {
     val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")

     fun isEmailValid(email:String) : Boolean{
         // Write Email validation logic here
         return false
     }

     fun isGmailValid(gmail:String) : Boolean {
         // Write Gmail validation logic here
         return false
     }
 }

// This below approach is following Open/Close Principle

open class EmailValidator2 {
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")

    fun isEmailValid(email:String) : Boolean {
        return false
    }
}

// Creating here new class for new functionality (Gmail functionality)
class GmailValidator : EmailValidator2() {

    fun isGmailValid(gmail:String) : Boolean {
        return false
    }
}