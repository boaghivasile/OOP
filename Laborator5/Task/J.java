package com.Vasilica.Laborator5.Task;

public class J extends I {
    protected String j;

    public J(String j) {
        super("i");
        this.j = j;
    }

    public String toString() {
        return super.toString() + "J: " + j + "\n";
    }
}
