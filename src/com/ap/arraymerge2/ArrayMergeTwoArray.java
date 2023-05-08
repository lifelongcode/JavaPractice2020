package com.ap.arraymerge2;

import java.util.Arrays;

/**
    Merge two given array. But here create another Array
 */
public class ArrayMergeTwoArray {
    public static void main(String[] args) {
        int[] firstArray = {4, 5, 6, 7, 8, 9, 10};
        int[] secondArray={1,2,3};
        int[] mergeArray = new int[firstArray.length + secondArray.length];

        int num =0;
        for(int i=0; i<firstArray.length; i++){
            mergeArray[i]=firstArray[i];
            num++;
        }

        for(int j=0; j<secondArray.length; j++){
            mergeArray[num++] = secondArray[j];

        }
        for(int m =0; m<mergeArray.length;m++){

            System.out.print(mergeArray[m]+ " ");
        }
        System.out.println("\n===============================");
            Arrays.sort(mergeArray);
        for (int element: mergeArray) {
            System.out.print(element + " ");
        }

        //Let's say we want to copy all the elements from secondArray
        //to firstArray

        for(int i=0; i<firstArray.length; i++){
            secondArray[i] = firstArray[i];
        }
    }
}
