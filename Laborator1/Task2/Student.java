package com.Vasilica.Laborator1.Task2;

public class Student {
    private String name;
    private float mark;
    private int age;

    public float getMark(){
        return this.mark;
    }

    Student(String name, int age, float mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}
