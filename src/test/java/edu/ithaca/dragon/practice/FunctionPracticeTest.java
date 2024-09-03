package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2)); //tests when largest number is in position 1,2,or3
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));//tests if they are all the same number

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1)); //tests the error raised if a negative number is inputted
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(7.56, FunctionPractice.calcSalePrice(10, .3, .08), .0001);
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-1,-.5,-.08)); 
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(10,3,1.5)); 
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(10,20,.08)); 
    }

    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(2,2,true));
        assertEquals(false, FunctionPractice.isGoodDog(2,1,true));
        assertEquals(false, FunctionPractice.isGoodDog(2,2,false));
        assertEquals(false, FunctionPractice.isGoodDog(2,1,false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(2,-1,true)); 
    }

    @Test
    public void findFirstLargestTest(){
        List <Integer> myList = List.of(50, 2, 1, 40, 50);
        assertEquals(0, FunctionPractice.findFirstLargest(myList));
        List <Integer> emptyList = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(emptyList));
    }

    @Test
    public void findLastLargestTest(){
        List <Integer> myList = List.of(50, 2, 1, 40, 50);
        assertEquals(4, FunctionPractice.findLastLargest(myList));
        List <Integer> emptyList = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findLastLargest(emptyList));
    }
    
}
