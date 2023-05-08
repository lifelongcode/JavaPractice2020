package com.ap.arrayResvese;

import java.util.Arrays;

public class Main {


    public static void reverseArrayElement(int[] array){
        int maxArray = array.length -1;
        int halfArray = array.length / 2; //Integer division

        for(int i = 0; i <= halfArray; i++ ){
            //We want to swap array element here half so that it will be reversed
            int temp = array[i];
            array[i] = array[maxArray - i];
            array[maxArray - i] = temp;
        }

    }

    public static void main(String[] args) {
        ArrayReverse useIt = new ArrayReverse();
        int[] myArray = {7,9,11,15,19};
        System.out.println("Array before reverse =" + Arrays.toString(myArray));
        //Now let's invoke the reverse method to reverse the array element
        useIt.arrayReverse(myArray);
        System.out.println("Array after reverse =" + Arrays.toString(myArray));

        /**
        //Here we can use static method to reverse the array element
        reverseArrayElement(myArray);

        //Then we can call java built in Arrays.toString() method to print
        System.out.println("Static method using array reverse " + Arrays.toString(myArray));
        */
    }
}
