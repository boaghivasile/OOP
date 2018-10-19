package com.Vasilica.Laborator1.Task1;

import com.Vasilica.Laborator1.Task1.Resolution;

public class Monitor {
    private String color;
    private int dimension;
    private Resolution resolution;

    public Monitor(String color, int dimension, Resolution resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = new Resolution(resolution.getHeight(), resolution.getWidth());
    }

    public void update(String color, int dimension, Resolution resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public void update(String color, int dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public String toString() {
        return "Color: " + color + "\nDimension: " + dimension + " inches" +
                "\nResolution: " + resolution.getHeight() + "x" + resolution.getWidth();
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Monitor))
            return false;
        Monitor temp = (Monitor)obj;
        return this.color.equals(temp.color) &&
                this.dimension == temp.dimension &&
                this.resolution.equals(temp.resolution);
    }
}
