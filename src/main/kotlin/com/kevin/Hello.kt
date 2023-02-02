package com.kevin

fun main(args: Array<String>) {
    //println("Hello Kotlin!")
    //Human().hello()

    //val h = Human(weight = 66.5f, height = 1.7f)
    //println("bmi" + h.bmi())

    //var weight: Float = 66.5f

    //val c :Char = 'A'

    //println(c.code >60)

    var s:String? = "abcde"
    s = null

    println(s?.length)
    println(s?.get(2))
    println(s?.substring(3))

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