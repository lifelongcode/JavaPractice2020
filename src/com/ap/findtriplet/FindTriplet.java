package com.ap.findtriplet;

import java.util.Arrays;

/**
    Here is the simple program we will find the triplet from an array elements
 */
public class FindTriplet {
    public void findTripletElement(int[] arr, int n){
        //First we have to sort the array
        Arrays.sort(arr);

        //Now every element of the arr check if a pair exists(in array) whose
        //sum is equal to arr element
        for(int i=n-1; i>=0; i--){
            int j=0;
            int k=i-1;

            while(j < k ){
                if(arr[i] == arr[j] + arr[k]){
                    //pair found
                    System.out.println("Numbers are " + arr[i] + " " + arr[j] + " "+ arr[k]);
                    return;
                }else if(arr[i] > arr[j] + arr[k])
                    j += 1;
                    else
                        k -= 1;
            }
        }

        //No such triplet found in array
        System.out.println("No such triplet exists");
    }
}
