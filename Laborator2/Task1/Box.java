package com.Vasilica.Laborator2.Task1;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(){

    }

    public Box(double parametru){
        this.length = parametru;
        this.width = parametru;
        this.height = parametru;
    }

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){ return 2 * width * height + 2 * width * length + 2 * height * length; }

    public double getVolume(){ return height * length * width; }
    }


