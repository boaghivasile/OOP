package com.Vasilica.Laborator7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter at least a word:");
        String text = scanner.nextLine();

        TextAnalyzer text1 = new TextAnalyzer(text);

        System.out.println("Number of sentences: " + text1.getNumOfSentence());
        System.out.println("Number of words: " + text1.getNumOfWords());
        System.out.println("Number of consonants: " + text1.getNumOfConsonants());
        System.out.println("Number of vowels: " + text1.getNumOfVowels());
        text1.showWordsAndTheirCounter();
    }
}