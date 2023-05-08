/**
 This program demonstrates using exception how
 the program works without terminate.
 */

package com.ap.exception;

public class SimpleExceptionExm {

    public static void main(String[] args) {

        //Declare an array of 5 elements on to it.
        int[] numbers = {10, 20, 30, 40, 50};

        try{
            //Let's display array elements
            for(int i=0; i<=numbers.length; i++) //<= will make arrayOutOfBoundException
                                                //because we write the condition <=
                System.out.println(numbers[i]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid array index");
            //If we like to see what type of error we can do it like that
            System.out.println(ex.getMessage());
            //e.printStackTrace(); //this will be the output which usually
            //program shows
        }catch (Exception e){
            System.out.println("An error has taken place.");
        }
        //Will this message be displayed?????
        //Yes, because we use exception try catch block
        //JVM will find the object and
        System.out.println("That's all now!");
    }
}
