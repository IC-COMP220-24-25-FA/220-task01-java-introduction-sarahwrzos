package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0));
    }
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(2,4);
        assertEquals(4, myTriangle.calcArea(), .0001);
    }
    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3,4);
        myTriangle.doubleSize();
        assertEquals(6, myTriangle.base, .0001);
        assertEquals(8, myTriangle.height, .0001);
    }
    @Test
    public void longestLineWithin(){
        Triangle myTriangle = new Triangle(3, 7);
        assertEquals(7.1589, myTriangle.longestLineWithin(),.001);
    }
}
