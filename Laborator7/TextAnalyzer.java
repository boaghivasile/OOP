package com.Vasilica.Laborator7;


import java.util.*;

public class TextAnalyzer {

    private String text;
    public String[] words;
    public HashMap<String, Integer> nrOfWords = new HashMap<String, Integer>();
    private Set<Character> allVowels = new HashSet();
    private Set<Character> allConsonants = new HashSet();
    private Scanner sc;

    public TextAnalyzer(String text) {
        this.text = text;
        this.sc = new Scanner(System.in);
        this.allVowels.addAll(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));
        this.allConsonants.addAll(Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z'));
    }


    public int getNumOfSentence() {
        int n = text.length();
        int numOfSentences = 0;
        for(int i = 0; i < n; i++) {
            if(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                numOfSentences++;
            }
        }
        return numOfSentences;
    }

    public int getNumOfWords() {
        int numOfWords = 0;

        boolean isWord = false;
        int endOfLine = text.length() - 1;
        int n = text.length();

        for (int i = 0; i < n; i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character) && i != endOfLine) {
                isWord = true;
            }
            else if (!Character.isLetter(character) && isWord) {
                numOfWords++;
                isWord = false;
            }
        }
        return numOfWords;
    }

    public int getNumOfConsonants() {
        int numOfConsonants = 0;

        for(int i = 0; i < this.text.length(); ++i) {
            if (this.allConsonants.contains(this.text.charAt(i))) {
                ++numOfConsonants;
            }
        }

        return numOfConsonants;
    }

    public int getNumOfVowels() {
        int numOfVowels = 0;

        for(int i = 0; i < this.text.length(); ++i) {
            if (this.allVowels.contains(this.text.charAt(i))) {
                ++numOfVowels;
            }
        }

        return numOfVowels;
    }

    public void showWordsAndTheirCounter() {
        splitText();
        setTop();
        Iterator it = nrOfWords.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
    }

    private void splitText() {
        words = text.split("[\\p{Punct}\\s]+");
    }

    private void setTop() {
        for(int i = 0; i < words.length; i++) {
            if(nrOfWords.containsKey(words[i])) {
                nrOfWords.put(words[i], nrOfWords.get(words[i]) + 1);
            } else {
                nrOfWords.put(words[i], 1);
            }
        }
    }
}