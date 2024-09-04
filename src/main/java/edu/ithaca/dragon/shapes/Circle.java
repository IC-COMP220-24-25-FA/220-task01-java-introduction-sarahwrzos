package edu.ithaca.dragon.shapes;

public class Circle implements Shape{ //circle is a shape (added implements Shape)
    //if youre going to be a shape, you need a calcArea method myShape.calcArea();
    double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){ //change to radiusIn
        if (radius <= 0){
            throw new IllegalArgumentException("radius cannot be zero or less");
        }
        this.radius = radius; //change to radius = radiusIn;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return (radius*radius)*3.14159;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius*2;
    }
}
