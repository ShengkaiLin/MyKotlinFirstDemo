package com.kevin.test

import com.kevin.student.Student1
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{

    @Test
    fun highestTest(){
        val student1 = Student1("Kevin" , 60,80)
        Assertions.assertEquals(80,student1.highest())
    }

    @Test
    fun averageTest(){
        val student1 = Student1("Kevin" , 60,80)
        Assertions.assertEquals((60+80)/2,student1.getAverage())
    }

    @Test
    fun gradingTest(){
        val student1 = Student1("Kevin" , 60,80)
        Assertions.assertEquals('C',student1.grading())
    }
}