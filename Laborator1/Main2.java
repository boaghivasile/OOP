package com.Vasilica.Laborator1;

import com.Vasilica.Laborator1.Task2.University;

public class Main2 {
    public static void main(String[] args){

        University utm = new University("UTM", 1964, 3);
        University mit = new University("MIT", 1960, 2);
        University asem = new University("ASEM", 1991, 2);

        System.out.println("Students average for UTM: " + utm.getStudentsAverage() );
        System.out.println("Students average for MIT: " + mit.getStudentsAverage() );
        System.out.println("Students average for ASEM: " + asem.getStudentsAverage() );
    }
}