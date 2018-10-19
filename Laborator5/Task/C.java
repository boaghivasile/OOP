package com.Vasilica.Laborator5.Task;

public class C extends B {
    protected String c;

    public C(String c) {
        super("b");
        this.c = c;
    }

    public String toString() {
        return super.toString() + "C: " + c + "\n";
    }
}

