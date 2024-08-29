package edu.ithaca.dragon.shapes;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length * width;
    }

    public void doubleSize(){
        this.length = length*2;
        this.width = width*2;
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
