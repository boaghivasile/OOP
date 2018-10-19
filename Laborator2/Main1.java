package com.Vasilica.Laborator2;

import com.Vasilica.Laborator2.Task1.Box;

public class Main1{

    public static void main(String[] args) {


        Box paralelipiped = new Box(20,30,40);
        System.out.println("The 1st box is a paralelipiped and has the following dimensions:");
        System.out.println("The length:" + paralelipiped.getLength());
        System.out.println("The height:" + paralelipiped.getHeight());
        System.out.println("The width:" + paralelipiped.getWidth());
        System.out.printf("The area of the 1st paralelipied is:" + paralelipiped.getArea());
        System.out.printf("\nThe volume of the 1st paralelipiped is:" + paralelipiped.getVolume());

        Box  patrat = new Box(30);
        System.out.println("\n\nThe 2nd box is a cube and has the following dimensions:");
        System.out.println("The length:" + patrat.getLength());
        System.out.println("The width:" + patrat.getWidth());
        System.out.println("The height:" + patrat.getHeight());
        System.out.printf("The area of the 2nd paralelipied is:" + patrat.getArea());
        System.out.printf("\nThe volume of the 2nd paralelipiped is:" + patrat.getVolume());

        Box paralelipiped2 = new Box();
        paralelipiped2.setLength(25);
        paralelipiped2.setWidth(30);
        paralelipiped2.setHeight(35);
        System.out.println("\n\nThe 3rd box is a paralelipiped and has the following dimensions:");
        System.out.println("The length:" + paralelipiped2.getLength());
        System.out.println("The width:" + paralelipiped2.getWidth());
        System.out.println("The height:" + paralelipiped2.getHeight());
        System.out.printf("The area of the 3rd paralelipied is:" + paralelipiped2.getArea());
        System.out.printf("\nThe volume of the 3rd paralelipiped is:" + paralelipiped2.getVolume());
    }
}