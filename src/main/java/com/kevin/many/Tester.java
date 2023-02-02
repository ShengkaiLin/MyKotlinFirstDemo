package com.kevin.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);

        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(68,88,77,99,50);

        for(int result :scores){
            System.out.println(result);
        }
    }

    public void arrayTest(){
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;

        int[] scores = {68, 88, 77, 99, 50};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for(int n : scores){
            System.out.println(n);
        }
    }
}
