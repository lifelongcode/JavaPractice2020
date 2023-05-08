package com.ap.duplicateelement;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] myArray = {1,2,2,3,4,5,5,6,7,7,8};

        boolean isPresent= false;

        for(int i=0; i<myArray.length-1; i++){
            for(int j=i+1; j<myArray.length; j++){
                if((myArray[i] == myArray[j]) && (i !=j)){
                    System.out.println("Duplicate elements are: "+ myArray[j]);
                    isPresent = true;
                }
            }
        }
        if(isPresent==false){
            System.out.println("We couldn't find the duplicate value");
        }
    }

}
