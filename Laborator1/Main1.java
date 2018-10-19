package com.Vasilica.Laborator1;

import com.Vasilica.Laborator1.Task1.Resolution;

import com.Vasilica.Laborator1.Task1.Monitor;

public class Main1{
    public static void main(String[] args) {
        Resolution res1 = new Resolution(800, 600);
        Resolution res2 = new Resolution(1024, 600);
        Resolution res3 = new Resolution(1280, 1024);
        Resolution res4 = new Resolution(3840, 2160);

        Monitor mon1 = new Monitor("Black", 24, res1);
        Monitor mon2 = new Monitor("White", 21, res3);
        Monitor mon3 = new Monitor("Green", 24, res2);
        Monitor mon4 = new Monitor("Blue", 24, res4);

        System.out.println("Second Monitor:\n" + mon2 + "\n");
        System.out.println("Third Monitor:\n" + mon3 + "\n");

        System.out.println("First Monitor:\n" + mon1 + "\n");
        mon1.update("Black", 24);
        System.out.println("First Monitor:\n" + mon1 + "\n");

        mon3.update("Black", 24, res1);
        System.out.println("Third Monitor:\n" + mon3 + "\n");

        System.out.println("Comparing monitors:");
        System.out.println("Monitor1 and Monitor2: " + mon1.equals(mon2));
        System.out.println("Monitor3 and Monitor4: " + mon3.equals(mon4));
        System.out.println("Monitor1 and Monitor3: " + mon1.equals(mon3));
    }
}
