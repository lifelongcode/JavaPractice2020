package com.ap.sumofanarray;

public class SumOfAnArray {

    public int sumOfArray(int[] arr){
        int sum = 0;
       for(int i=0; i<arr.length; i++){
           sum +=arr[i];
       }
       return sum;
    }

    //also using enhance for loop

    public int makeSumFromArray(int[] inputArray){
        int sum =0;

        for(Integer ele: inputArray){
            sum += ele;
        }
        return sum;
    }
}
