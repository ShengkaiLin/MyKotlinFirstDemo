package com.kevin.student;

public class Student {

    private String id;
    private String name;
    private int english;
    private int math;

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" +
                getAverage() + "\t" + (getAverage()>=60 ?"Pass":"Failed"));

        char grading  = 'F';

        switch (getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;

            default:
                grading = 'F';
        }

        System.out.println("\t" + grading);



//        if(getAverage() >= 60 ){
//            System.out.println("\tPASS");
//
//        }else{
//            System.out.println("Fail");
//        }
    }

    public int highest(){
        return Math.max(english, math);
    }

    public int getAverage(){
        return (english + math ) / 2 ;
    }




}
