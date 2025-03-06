package com.android.topic.logicalprograms.oppsConcept.polymorphism

fun main() {

    val android = Android()
    android.showMovie()
    android.showMovie(cost = 100)
    android.showMovie(movieName = "Technology",cost = 100)
    android.showMovie(movieName = "Robot",cost = 150, rating = 5)

}

class Android {
/*

In this class we achive method overloading we have same name methods
with multiple argument in single class

*/

    fun showMovie(){
        println("Show movie\n")
    }

    fun showMovie(cost:Int){
        println("Show movie: cost = $cost\n")
    }

    fun showMovie(movieName:String,cost:Int){
        println("Show movie: movieName = $movieName, cost = $cost\n")
    }

    fun showMovie(movieName:String,cost:Int,rating:Int){
        println("Show movie: movieName = $movieName, cost = $cost, rating = $rating")

    }

}