package com.ap.forloop;

import java.util.Arrays;

public class EnhanceForLoop {

    public static void main(String[] args) {

        //Create a String array
        String[] myNum = {"1", "7", "2", "BMW", "9", "VOLVO", "4", "MercedesBenz", "3"};

        //Let's use Enhance for loop
        for(String ele: myNum){
            System.out.println(ele);
        }

        System.out.println("---------------------------");
        //regular for loop
        for(int i =0; i<myNum.length; i++){
            System.out.println(myNum[i]);
        }
    }
}
