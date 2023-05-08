package com.ap.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Stream;

/**
    This is the simple program which can show :: method reference
    how work,
 */
public class MethodReferenceExm {

    public static void main(String[] args) {
        String[] nameArray = {"Abraham", "Parker", "Aiden", "James", "Mary", "John", "Robert"};

        //Before sorting the array
        for(String ele: nameArray){
            System.out.println(ele);
        }

        //Or we can use Factory method returns a fixed-size list backed by the array
       // System.out.println(Arrays.asList(nameArray));

        //We can use method reference to printout when use Stream
        Stream.of(nameArray).forEach(System.out::println);

        //Also, asList
       // Arrays.asList(nameArray).forEach(System.out::print);

        System.out.println("--------------------------------------");
        Arrays.sort(nameArray, new Comparator<String>(){
            public int compare(String s, String t) {
                return s.toLowerCase().compareTo(t.toLowerCase());
            }
        });

        //After sorting the array
        for(String ele: nameArray){
            System.out.println(ele);
        }


        System.out.println("--------------------------------------------");
        //using lambda expression
        Arrays.sort(nameArray, (p, k) -> p.compareTo(k));

        //After sorting the array using lambda expression
        for(String ele: nameArray){
            System.out.println(ele);
        }

        System.out.println("--------------------------------------------");

        //using Method References are even more compact & readable.
        Arrays.sort(nameArray, String::compareToIgnoreCase);

        //After sorting the array using lambda expression
        for(String ele: nameArray){
            System.out.println(ele);
        }


    }



}
