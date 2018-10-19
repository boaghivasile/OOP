package com.Vasilica.Laborator5.Task;

public class H extends G {
    protected String h;
    protected X x = new X("xxx");

    public H(String h) {
        super("g");
        this.h = h;
    }

    public String toString() {
        return super.toString() + "H: " + h + "\t" + x + "\n";
    }
}
