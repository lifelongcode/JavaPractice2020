/**
     This program just demonstrate without using exception how
    the program terminate.
 */
package com.ap.exception;

public class SimpleException {
    public static void main(String[] args) {

        //Declare an array of 5 ints
        int[] numbers = {10, 20, 30, 40, 50};

        //Let's display one too many array elements
        for(int i=0; i<=numbers.length; i++) //<= will make arrayOutOfBoundException
            System.out.println(numbers[i]);

        //Will this message be displayed?????
        System.out.println("That's all now!");
        //Note the above line we like to show program run correctly.
        //There is no exception written therefore, program terminates



    }
}
