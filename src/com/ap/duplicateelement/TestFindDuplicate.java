package com.ap.duplicateelement;

public class TestFindDuplicate {
    public static void main(String[] args) {
        int [] myArray = {10,20,20,31,41,505,505,60,77,77,8};
        boolean isPresent = false;

        for(int i=0; i<myArray.length -1; i++){
            for(int j=i+1; j<myArray.length; j++){
                if(myArray[i] == myArray[j] && (i != j)){
                    System.out.println("Duplicates are " + myArray[j]);
                    isPresent = true;
                }

            }
        }
        if(isPresent == false){
        System.out.println("We couldn't find the duplicate " + isPresent);
        }
    }
}
