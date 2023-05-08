/**
 Find palindrome from given an array, and array size
 */
package com.ap.palindromefromarray;
public class FindPalindromeFromArray {
    public void palindromeFromArray(int arrSize, int arr[]){
        int flag =0;
        int n = arrSize;
        //First loop through the array size n/2
        for(int i=0; i<n/2 && n!=0; i++){
            if(arr[i] != arr[n-i-1]){
                flag = 1;
                break;
            }
        }
        if(flag ==1)
            System.out.println("Not Palindrome");
        else
            System.out.println("It is Palindrome.");
    }
}
