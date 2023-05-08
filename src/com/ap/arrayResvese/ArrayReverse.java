package com.ap.arrayResvese;

public class ArrayReverse {
    public void arrayReverse(int[] array){
        //declare an int variable which will hold the array length
        int maxIndex = array.length -1;

        //declare a variable which will hold half array length
        int halfArray = array.length / 2;

        //logic is here to use for loop so that we can iterate one by one
        for(int i=0; i<halfArray; i++){
            //our goal is here to swap the array element
            //first index to last when 0, second index to last second ....
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }

    }
}
