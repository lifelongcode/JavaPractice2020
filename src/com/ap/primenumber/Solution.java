package com.ap.primenumber;

public class Solution {
    public static void main(String[] args) {
        int low = 2, high=25;

        while(low < high){
            boolean flag = false;
            for(int i=2; i<low/2; ++i){
                //condition for non-prime number
                if(low % i == 0){
                    flag = true;
                    break;
                }
            }

            if(!flag && low !=0 && low !=1)
                System.out.print(low + " ");
                ++low;
        }
    }
}
