package com.ap.AugFive;

import java.util.ArrayList;
import java.util.List;

public class TodaysExm {

    public static void main(String[] args) {

        String say = "Hello";

        String tell = "Hello";

        System.out.println(say);
        System.out.println(say == tell);


        List<String> product = new ArrayList<>();
        product.add("Mirror");
        product.add("Watch");
        product.add("LightBulb");
        product.add("Batteries");


        //Regular for loop
        for(int i =0; i<product.size(); i++){
            System.out.println(product.get(i));
        }

        System.out.println(" --------------------------- ");
        //Enhance for loop
        for (String str:product) {
            System.out.println(str);
        }



    }


}
