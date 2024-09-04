package edu.ithaca.dragon.shapes;

public class Triangle {
    double base;
    double height;
    public Triangle(double baseIn, double heightIn){
        if (baseIn <= 0){
            throw new IllegalArgumentException("base cannot be zero or less");
        }
        if (heightIn <= 0){
            throw new IllegalArgumentException("height cannot be zero or less");
        }
        base = baseIn;
        height = heightIn;
    
    }
    public double calcArea(){
        return .5*base*height;
    }
    public void doubleSize(){
        base = base*2;
        height = height*2;
    }
    public double longestLineWithin(){
        double sideLength;
        sideLength = Math.sqrt((base/2)*(base/2)+height*height);
        if (sideLength > base){
            return sideLength;
        }
        else{
            return base;
        }

    }
}
