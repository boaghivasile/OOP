package com.Vasilica.Laborator5.Task;

public class E extends D{
    public String e;

    public E(String e) {
        super("d");
        this.e = e;
    }

    public String toString() {
        return super.toString() + "E: " + e + "\n";
    }
}
