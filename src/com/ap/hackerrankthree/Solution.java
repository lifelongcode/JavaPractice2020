package com.ap.hackerrankthree;
//In general question would be found the duplicate value in the array
//How many which we can say pair
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int sockMerchant(int n, int[] ar){

        int numOfPairs=0;
        //base case
        if(ar.length == 0) return numOfPairs;
        Set<Integer> mySet = new HashSet<>();
        for(int i=0; i<ar.length; i++){
            if(!mySet.contains(ar[i])){
                mySet.add(ar[i]);
            }else{
                numOfPairs++;
                mySet.remove(ar[i]);

            }
        }

        return numOfPairs;
    }

    public static void main(String[] args) {

        int[] pileOfSocksOne= {10, 20, 20, 10, 10, 30, 50, 10, 20,30,77 };


        System.out.println("You will have " + sockMerchant(11,pileOfSocksOne));


        int[] pileOfSocksTwo= {10, 20, 30, 40, 50,10 };
        System.out.println("You will have " + sockMerchant(6, pileOfSocksTwo));

        //Another array test
        int[] pileOfSocksThree= {1,2,2,1,3,1,2,2,5,4 };
        System.out.println("You will have " + sockMerchant(10, pileOfSocksThree));

    }
}
