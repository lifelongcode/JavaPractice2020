package com.ap.arraymissingnumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//This is the simple java program to find the missing number from an array
public class Main {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 6, 8, 9, 10, 2};
        /**
         n = 10;
         sum = (n * (n+1))/2 =55
         */

        int n = a.length + 1;
        int sum = (n * (n+1))/2;
        for(int i=0; i<a.length; i++){
            sum = sum - a[i];
        }

        System.out.println("The missing number is " + sum);

        System.out.println("===================================");
       //I tried to do in my way. But it is longer
        //If we want to show true and false
        // Wrong way to do that
        int sumModifiedArray=0;
       Set<Integer> mySet = new HashSet<>();
       for(int i=1; i<=n; i++){ //remember here is n which is the extended 1 length
           mySet.add(i);
            sumModifiedArray += i;  //Cool here we can make sumModifiedArray in mySet
       }
        System.out.println(mySet.toString());
       //No need another enhance for loop for sumModifiedArray
        //       for(int i: mySet){
        //           sumModifiedArray += i;
        //       }
        System.out.println(sumModifiedArray);

       //After that we can make sum old array a
        //then if we subtract we will get missing number
        int sumFirstArray=0;
        for(int i=0; i<a.length; i++){
            sumFirstArray = sumFirstArray + a[i];

        }

        int missingNumberResult = sumModifiedArray - sumFirstArray ;
        System.out.println("Wow!! we found the missing number " + missingNumberResult);
    }


}
