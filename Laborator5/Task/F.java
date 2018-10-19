package com.Vasilica.Laborator5.Task;

public class F extends E {
    protected String f;

    public F(String f) {
        super("e");
        this.f = f;
    }

    public String toString() {
        return super.toString() + "F: " + f + "\n";
    }
}
