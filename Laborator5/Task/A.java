package com.Vasilica.Laborator5.Task;

public class A {
    protected String a;
    protected X x = new X("x");

    public A(String a) {
            this.a = a;
        }
        public String toString() {
            return "A: " + a + "\t" + x + "\n";
        }
}
