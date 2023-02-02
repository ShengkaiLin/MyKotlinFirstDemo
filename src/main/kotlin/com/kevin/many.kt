package com.kevin

fun main(args: Array<String>) {
    val list = listOf(5, 1, 2, 7)
    println(list)

    val scores = listOf(68,88,77,99,50)
    println(scores)

    for(result in scores){
        println(result)
    }

    val mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)

}

