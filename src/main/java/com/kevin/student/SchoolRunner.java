package com.kevin.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {
        //userInput();

        Student stu = new Student("1","Keivn",77,99);
        stu.print();
        System.out.println("Height Score : " + stu.highest());
    }

    public static void userInput(){
        System.out.print("Please enter student's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.print("Please enter english score:");
        int english = scanner.nextInt();

        System.out.print("Please enter math score:");
        int math = scanner.nextInt();
    }
}
