package com.Vasilica.Laborator2;

import com.Vasilica.Laborator2.Task2.Queue;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        Queue q2 = new Queue(10);

        int testNumber ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of repetitions:");
        testNumber = Integer.parseInt(scanner.next());

        for (int i = 0; i < testNumber; i++) {
            q2.add(i);
            q1.add(i);
        }

        if(testNumber > 10){
            System.out.println("List array extended.\n");
        }
        else if (q2.isFull() == true) {
            System.out.println("q2 is full. \n");
        }
        else if (q2.isEmpty() == true) {
            System.out.println("q2 is empty.\n");
        }
        else{
            System.out.println("q2 is not full/empty.");
        }


        if (q1.isFull() == true) {
            System.out.println("q1 is full. \n");
        }
        else if (q1.isEmpty() == true) {
            System.out.println("q1 is empty. \n");
        }
        else{
            System.out.println("q1 is not full/empty.");
        }
    }
}
