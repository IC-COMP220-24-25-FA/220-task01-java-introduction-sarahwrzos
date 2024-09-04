package edu.ithaca.dragon.shapes;

public interface Shape {//what a shape can do. any given shape will need to know how to calculate area
    public double calcArea();

    public void doubleSize();

    public double longestLineWithin();
}
