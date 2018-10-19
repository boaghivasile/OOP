package com.Vasilica.Laborator4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.Vasilica.Laborator4.Task.BracketChecker.bracketExpression;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\User\\IdeaProjects\\LaboratoareOOP\\src\\com\\Vasilica\\Laborator4\\Testari.txt");
        Scanner scanner = new Scanner(inFile);

        try {
            scanner = new Scanner(inFile);
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

        while(scanner.hasNext()) {
            String expression = scanner.nextLine();
            System.out.println(bracketExpression(expression));
        }

    }
}

