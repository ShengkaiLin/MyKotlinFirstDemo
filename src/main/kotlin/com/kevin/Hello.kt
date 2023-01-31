package com.kevin

fun main(args: Array<String>) {
    //println("Hello Kotlin!")
    //Human().hello()

    val h = Human(weight = 66.5f, height = 1.7f)
    println("bmi" + h.bmi())

    var weight: Float = 66.5f
}

class Human(var name: String ="", var weight: Float, var height: Float) {

    init {
        println("test$weight")
    }

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }


    fun hello() {
        println("Hello Kotlin")
    }
}