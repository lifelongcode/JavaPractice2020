package com.ap.findpalindromefromarray.method;

/**
    This is the simple program to check if there is palindrome
    in the array. An array is given there could be few elements
    {1, 3, 5, 3, 1}, we can say this array is Palindrome. However,
    {2, 3, 5, 3,6} this array isn't palindrome.

    Targeting this array and work through, array size 5
    index:      0  1  2  3  4
    elements:   1  3  7  3  1
    Here we can see the index and elements let's write the code
 */

public class FindPalindromeFromArray {
    //First let's create a method

    public void palindrome(int[] arr, int n) {
        //Initialize flag to zero
        int flag = 0;

        //Loop till array size n/2
        for(int i=0; i<=n/2 && n!=0; i++){

            //Now we are going to check first and last element are different
            if(arr[i] != arr[n-i-1] ){
                flag = 1;
                break;
            }
        }

        //After finish the array
        if(flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("It is a Palindrome.");
    }
}
