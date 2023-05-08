package com.ap.arrayResvese;

import java.util.Arrays;

public class WithDetails {

    //We need to use it because it says no return anything from the method
    public static void reverseAnArray(int[] arr){
        int maxIndex = arr.length -1;
        int halfLength = arr.length/2;

        //Now iterate
        //The loop will go to half because we are going to swap
        //if we change half of the array we do not need to go more
        //all the element of the array will be reverse
        for(int i=0; i<halfLength; i++){
            int temp=arr[i]; //declare temp and it will hold 0 index value
            //now let's grab the last element of the array and assign to
            //0(first) index element
            arr[i]=arr[maxIndex-i]; //You may confuse why maxIndex with subtract i
            //example array has 5 element
            //maxIndex is 4, so if we 4-0, nothing change
            //But it will help our iteration loop through
            //Now swapping
            arr[maxIndex - i] = temp;
        }
        //Note here if we want we can return as below:
        // System.out.println(Arrays.toString(arr));

        //If we want to return value as String type on the method it works like below
        // return " "+ Arrays.toString(arr);

    }

    public static void main(String[] args) {
        int[] myArray = {10, 9, 50, 60, 70};

        //First print the array
        System.out.println("Before reverse the array "+ Arrays.toString(myArray));
        reverseAnArray(myArray);
        System.out.println("After reverse the array " + Arrays.toString(myArray));
        //System.out.println(reverseAnArray(myArray));
    }
}
