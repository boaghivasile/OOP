package com.Vasilica.Laborator4.Task;

public class Stack {
    private char[] list;
    private int last = -1;

    Stack(int maxSize) {
        this.list = new char[maxSize];
    }

    public char getTopElement() {
        return this.list[this.last];
    }

    public void addElement(char ch) {
        ++this.last;
        this.list[this.last] = ch;
    }

    public boolean isEmpty() {
        return this.last == -1;
    }

    public void popTop() {
        this.list[this.last] = 0;
        --this.last;
    }
}
