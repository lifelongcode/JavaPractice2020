package com.ap.lamda.usingCollections;

import java.util.*;

public class ExampleOfLambdaSort {

    public static void main(String[] args) {


    List<String> nameList = Arrays.asList("Harry", "Harmione", "Ron", "Draco", "Hagrid", "Dobby", "Albus");

    //Cloning the nameList for the demo
        List<String> cNameList1 = new ArrayList<String>(nameList);
        List<String> cNameList2 = new ArrayList<String>(nameList);
        List<String> cNameList3 = new ArrayList<String>(nameList);

        /**
            Sorting using the Collections.sort()

         */

        System.out.println("Sorting done by Collections.sort(): ");
        Collections.sort(nameList);
        System.out.println(nameList);
        System.out.println();

        /**
            Sorting Using list.sort() #1 Sorting using Natural Order
         */
        //Lambda Expression for sorting the list in Natural Order
        Comparator<String> criteria = (str1, str2)-> str1.compareTo(str2);

        System.out.println("Sorting done by list.sort() in Natural Order: ");
        cNameList1.sort(criteria);
        System.out.println(cNameList1);

        System.out.println();


        /**
         *      Sorting Using list.sort() #2 : Sorting on the basis of Length of Elements
         **/

        //Lambda Expression for sorting the list on the basis of Length:
        System.out.println("Sorting done by list.sort() on the basis of Length: ");
        cNameList2.sort((str1, str2) -> str1.length() - str2.length());
        System.out.println(cNameList2);

        System.out.println();

        /**
         *     Sorting Using list.sort() #3 : Sorting on the basis of First Character of Elements
         **/

        //Lambda Expression for sorting the list on the basis of First Character
        System.out.println("Sorting done by list.sort() on the basis of First Character: ");
        cNameList3.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));
        System.out.println(cNameList3);
    }
}
