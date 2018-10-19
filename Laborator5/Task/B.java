package com.Vasilica.Laborator5.Task;

public class B extends A {
    protected String b;

    public B(String b) {
        super("a");
        this.b = b;
    }

    public String toString() {
        return super.toString() + "B: " + b + "\n";
    }
}
