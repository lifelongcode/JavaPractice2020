package com.ap.convertsum;

/**
    Java simple question. There are a String[] type of array. Elements are int and word
    You need to find all the number of the elements that array and make it sum.
    Rest of the word- you have to tell oh! oh. these are Words, can not convert to interger
    Actually this question ask, candidate should know about try catch and exception
 */
public class ArrayStringException {
    public static void main(String[] args) {
        String[] myNum =  {"1", "4", "2", "6", "BMW", "Ford", "Toyota", "4", "Mercedes-Benz", "5", "2", "1"};

        int sum =0;
        for (String element: myNum) {
            try{
                int convertedSum = Integer.parseInt(element);
                sum += convertedSum; // sum = sum + convertedSum
            } catch(NumberFormatException e){
                System.out.println("Element " + element + " in the array NOT integer");
                //System.out.println(e.getMessage());
            }
        }
        System.out.println("Some of the elements in the array are integers, their sum is " + sum);
    }
}
