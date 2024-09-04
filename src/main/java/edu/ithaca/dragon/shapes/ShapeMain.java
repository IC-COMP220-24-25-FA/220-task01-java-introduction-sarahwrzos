package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShapeMain {
    public static int runScanner(){
        Scanner myObj = new Scanner(System.in);
        int response;
        //System.out.println(myObj);
        System.out.println("Enter the number of the rectangle you would like to use: ");
        int x = myObj.nextInt();
        System.out.println(x);
        if(myObj.hasNextInt()){
            response = myObj.nextInt();
        }
        else{System.out.println(myObj.hasNext());}
        
        myObj.close();
        return x;
    }

    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        for (int m = 0; m <5; m++){
        List <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add((int) (Math.random() * 100)+1);
        }
        Rectangle rectangle1 = new Rectangle(list.get(0), list.get(1));
        Rectangle rectangle2 = new Rectangle(list.get(2), list.get(3));
        Rectangle rectangle3 = new Rectangle(list.get(4), list.get(5));
        Rectangle rectangle4 = new Rectangle(list.get(6), list.get(7));
        Rectangle rectangle5 = new Rectangle(list.get(8), list.get(9));
        System.out.println("1: " + rectangle1);
        System.out.println("Area: " + rectangle1.calcArea());
        System.out.println("Longest Line: " + rectangle1.longestLineWithin());
        System.out.println("2: " + rectangle2);
        System.out.println("Area: " + rectangle2.calcArea());
        System.out.println("Longest Line: " + rectangle2.longestLineWithin());
        System.out.println("3: " + rectangle3);
        System.out.println("Area: " + rectangle3.calcArea());
        System.out.println("Longest Line: " + rectangle3.longestLineWithin());
        System.out.println("4: " + rectangle4);
        System.out.println("Area: " + rectangle4.calcArea());
        System.out.println("Longest Line: " + rectangle4.longestLineWithin());
        System.out.println("5: " + rectangle5);
        System.out.println("Area: " + rectangle5.calcArea());
        System.out.println("Longest Line: " + rectangle5.longestLineWithin());
        int response = ShapeMain.runScanner();
// String response = "6";
// Scanner myObj = new Scanner(System.in);
// while ( response != 1 && response != 2 && response != 3 && response != 4 && response !=5 ){
    
//     System.out.println("Enter the number of the rectangle you would like to use");
//     if (myObj.hasNextLine()) {
//         response = myObj.nextLine().trim();
//     if ( response != 1 && response != 2 && response != 3 && response != 4 && response !=5 ){
//         System.out.println("Try again. Enter a number 1 through 5");
//     }
//     }
// }
        if (response == 1){
            rectangle1.doubleSize();
            double longest = rectangle1.longestLineWithin();
            System.out.println("New Longest line is " + longest);
            System.out.println("dimensions after doubling: " + rectangle1);
        }
        if (response == 2){
            rectangle2.doubleSize();
            double longest = rectangle2.longestLineWithin();
            System.out.println("New Longest line is " + longest);
            System.out.println("dimensions after doubling: " + rectangle2);
        }
        if (response == 3){
            rectangle3.doubleSize();
            double longest = rectangle3.longestLineWithin();
            System.out.println(" New Longest line is " + longest);
            System.out.println("dimensions after doubling: " + rectangle3);
        }
        if (response == 4){
            rectangle4.doubleSize();
            double longest = rectangle4.longestLineWithin();
            System.out.println("New Longest line is " + longest);
            System.out.println("dimensions after doubling: " + rectangle4);
        }
        if (response == 5){
            rectangle5.doubleSize();
            double longest = rectangle5.longestLineWithin();
            System.out.println("New Longest line is " + longest);
            System.out.println("dimensions after doubling: " + rectangle5);

        }
        System.out.println("-----------------------------------------------");
    }
}
}
