package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("numbers have to be positive");
        }
        int larger = -1;
        if (first > larger){
            larger = first;
        }
        if (second > larger){larger = second;}
        if (third > larger){larger = third;}
        return larger;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice < 0){throw new IllegalArgumentException("price cannot be negative");}
        if (discountPercent > 1 || discountPercent < 0){throw new IllegalArgumentException("discount percent has to be between 0 and 1 (inclusive)");}
        if (salesTax > 1 || salesTax < 0){throw new IllegalArgumentException("sales tax has to be between 0 and 1 (inclusive)");}
        return (originalPrice*(1-discountPercent))*(1+salesTax);


    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld < 0 || daysSinceShoesChewed < 0){
            throw new IllegalArgumentException("input cannot be negative");
        }
        if (daysSinceShoesChewed>1 && fetchedThePaperToday == true){
            return true;
        }
        else if(daysSinceShoesChewed == 1 || daysSinceShoesChewed == 0){
            return false;
        }
        else if (fetchedThePaperToday == false){
            return false;
        }
        else{
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int larger = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++ ){
            if (numbers.get(i) > larger){
                larger = numbers.get(i);
            }
        }
        for (int i = 0; i < numbers.size(); i++ ){
            if (numbers.get(i) == larger){
                return i;
            }
        }
        return -1;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
