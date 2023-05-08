package com.ap.hackerrank10;

public class Solution {
    public static int diagonalDifference(int[][] arr){
        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length; //This is because 2D array is array inside the array
        int columns = arr[0].length;

        int i=0;
        int j=0;
        int k=0;
        //Right to left column counter
        int l= arr.length-1;

        while(i<rows && j<columns && k<rows && l>=0){
            left_to_right +=arr[i][j];
            right_to_left +=arr[k][l];

            i +=1;
            j +=1;
            k +=1;
            l -=1;
        }
        return Math.abs(left_to_right - right_to_left);
    }

    //Another method, I feel this way is easy
    public static void printDiagonalSums(int[][] arr) {
        int principal = 0;
        int secondary = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //Condition for principal
                //diagonal
                if (i == j)
                    principal += arr[i][j];

                //Condition for secondary diagonal
                if ((i + j) == (arr.length - 1))
                    secondary += arr[i][j];
            }
        }
        System.out.println("Diagonal: left to right sum is " + principal);
        System.out.println("Diagonal: right to left sum is " + secondary);
        System.out.println(Math.abs(principal-secondary));
    }

    public static void main(String[] args){
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};

        System.out.println("Absolute value is " + diagonalDifference(myArray));

        printDiagonalSums(myArray);
    }
}
