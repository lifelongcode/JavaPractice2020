package com.ap.hackerrank10;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};



        for(int i=0; i<myArray.length; i++){
            System.out.println();
            for(int j=0; j<myArray[i].length ; j++){
                System.out.print(myArray[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(sol.diagonalDifference(myArray));
    }
}
