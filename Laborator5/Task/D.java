package com.Vasilica.Laborator5.Task;


public class D extends C {
    protected String d;
    protected X x = new X("xx");

    public D(String d) {
        super("c");
        this.d = d;
    }

    public String toString() {
        return super.toString() + "D: " + d + "\t" + x + "\n";
    }
}

