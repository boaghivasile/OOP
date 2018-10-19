package com.Vasilica.Laborator1.Task1;

public class Resolution {
    private int height;
    private int width;

    public Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Resolution))
            return false;
        Resolution temp = (Resolution)obj;
        return this.height == temp.height && this.width == temp.width;
    }
}
