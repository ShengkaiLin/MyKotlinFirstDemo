package com.kevin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1

    for( i in 1..5){
        println("Please enter a number:(${i}/4)")
        val number = scanner.nextInt()
        println("第${i}次$number")

      if(number > secret){
          println("lower")
      }else if (number<secret){
          println("higher")
      }else{
          println("Great, the number is " + secret)
          break
      }
    }
}