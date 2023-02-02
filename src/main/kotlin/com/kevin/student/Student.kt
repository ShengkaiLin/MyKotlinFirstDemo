package com.kevin.student

import java.util.*

fun main(args: Array<String>) {
    //userInput()

    val stu = Student1("Gery",100,70)
    stu.print()
    stu.nameCheck()

    println("High Score ${stu.highest()}")

}

fun userInput() {
    val scanner = Scanner(System.`in`)

    println("Please enter student's name:")
    //val name = scanner.next();
    val name = null

    println("Please enter english score:")
    val english = scanner.nextInt()

    println("Please enter math score:")
    val math = scanner.nextInt()
}

class Student1(var name :String? , var english : Int , var math :Int){

    fun print(){
        println("$name \t $english \t $math \t ${getAverage()} \t ${passOrFailed()}")

        println("\t" + grading())
    }

    fun passOrFailed() = if(getAverage()>=60) "Pass" else "Failed"

    fun nameCheck(){
        println(name?.length)
    }

    fun highest () =if(english > math){
        println("English")
        english
    }else{
        println("Math")
        math
    }

    fun getAverage() =(english+math)/2

    fun grading() =when(getAverage()){
        in 90..100 ->'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else ->'F'
    }

}