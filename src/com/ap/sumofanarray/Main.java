package com.ap.sumofanarray;

public class Main {
    public static void main(String[] args) {
        SumOfAnArray sa = new SumOfAnArray();
        int[] myArray = {3, 6, 9, 12, 15};
        System.out.println("Sum of the Array is " + sa.sumOfArray(myArray));

        //Now let's call enhance for loop method

        SumOfAnArray sae = new SumOfAnArray();
        System.out.println("Using Enhance for loop sum of the array is " + sae.makeSumFromArray(myArray));
    }
}
