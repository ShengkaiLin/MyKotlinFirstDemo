package com.kevin;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
        //System.out.println("Hello Java!");

        Person person = new Person("Kevin",78f,1.73f);
        person.hello();

        float bmi = person.bmi();

        int score = 88;
        System.out.println(score>60  | score<90);

        char c = 'A';
        System.out.println(c>'a');

        System.out.println(bmi);

    }
}
