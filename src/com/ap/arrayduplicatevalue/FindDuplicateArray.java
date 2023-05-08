package com.ap.arrayduplicatevalue;

public class FindDuplicateArray {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 5, 6, 4, 7, 7,8};

        for(int i =0; i<myArray.length-1; i++){
            for( int j= i+1; j<myArray.length; j++){
                if( (myArray[i] == myArray[j]) && (i != j) ){
                    System.out.println("Duplicate Element : "+ myArray[j]);
                }
            }
        }

    }
}
