package com.kevin;

public class Person {

    public String name;
    public float weight;
    public float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight,height);
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello Java!");
    }

    public float bmi() {
        return weight / (height * height);
    }

}
