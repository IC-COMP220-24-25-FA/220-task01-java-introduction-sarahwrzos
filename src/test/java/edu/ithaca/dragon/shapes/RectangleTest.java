package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaRTest(){
        Rectangle myRectangle = new Rectangle(5, 3);
        double area = myRectangle.calcArea();
        assertEquals(15, area, .000001);
    }
    @Test
    public void doubleSizeRTest(){
        Rectangle myRectangle = new Rectangle(2,4);
        myRectangle.doubleSize();
        assertEquals(4, myRectangle.length, .00001);
        assertEquals(8, myRectangle.width, .00001);
    }

}
