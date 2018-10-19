package com.Vasilica.Laborator5.Task;

public class G extends F{
    protected String g;

    public G(String g) {
        super("f");
        this.g = g;
    }

    public String toString() {
        return super.toString() + "G: " + g + "\n";
    }
}
