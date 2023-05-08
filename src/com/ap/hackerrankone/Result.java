package com.ap.hackerrankone;
import java.util.ArrayList;
import java.util.List;
public class Result {

    public static String findNumber(List<Integer> arr, int k){
        String result = "NO";
        for(Integer ele: arr){
            if( ele == k){
                result = "YES";
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> myArray= new ArrayList<Integer>();
        myArray.add(2);
        myArray.add(5);
        myArray.add(3);
        myArray.add(7);

            //It will return the answer YES
        System.out.println(findNumber(myArray, 3));

        //It will return the answer NO
        System.out.println(findNumber(myArray, 9));
    }
}
