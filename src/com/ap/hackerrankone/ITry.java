package com.ap.hackerrankone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITry {

    public static String findTheNumber(List<Integer> arr, int k){
        //remember this method is a String return type method
        String result = "No";

        //using the logic below to find the number
        for(Integer ele: arr){
            if(ele == k){
                result = "Yes";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
      List<Integer> myArray = new ArrayList<>();
      myArray.add(10);
      myArray.add(20);
      myArray.add(30);
      myArray.add(40);
      myArray.add(50);

      //let's print first all the elements in the myArrayList
      for(int e: myArray){
          System.out.printf("%d ", e );
      }
        System.out.println("--------------------------------------");
        //Now We can see all the elements there,
        //Let's use the method to see if the element exist in the myArray list,
        // we can return Yes, if it does not then return No
        System.out.println(findTheNumber(myArray, 30));
        System.out.println(findTheNumber(myArray, 70));
    }
}
