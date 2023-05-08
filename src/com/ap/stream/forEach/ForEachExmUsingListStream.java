package com.ap.stream.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExmUsingListStream {

    public static void main(String[] args) {
        //My bucket list to visit the places
        List<String> placesToVisit = new ArrayList<>();
        placesToVisit.add("New York City");
        placesToVisit.add("London");
        placesToVisit.add("Paris");
        placesToVisit.add("Barcelona");
        placesToVisit.add("Tokyo");
        placesToVisit.add("Dubai");
        placesToVisit.add("Singapore");
        placesToVisit.add("Milan");

        //just 1 line of code faster way to retrieve data
        System.out.println("Below out put example of using lambda expression");
        placesToVisit.forEach(touristPlace -> System.out.println("I like to visit " + touristPlace));


        System.out.println();

        //Regular for loop
        System.out.println("Below output example of using regular for loop");
        for(int i =0; i< placesToVisit.size(); i++){
            System.out.println("I like to visit " + placesToVisit.get(i));
        }

        System.out.println();
        //enhance for loop
        System.out.println("Below output example of using enhance for loop");
        System.out.println("I like to visits:");
        for (String str: placesToVisit){

            System.out.println(str + ",");
        }

        //for blank line space
        System.out.println();
        System.out.println("Below output example of using stream- stream can make it customize ");
        placesToVisit.stream().filter(place -> place.length() == 5).forEach(x -> System.out.println(x));

        //for blank line space
        System.out.println();

        //Now we can sort using stream
        placesToVisit.stream().sorted().forEach(x -> System.out.println(x));


        System.out.println();
        //Now we can sort, filter and == length
        //Now we can sort using stream
        placesToVisit.stream().sorted().filter(place -> place.length() == 5).forEach(x -> System.out.println(x));

        System.out.println();
        //Lambda Expression passed as Argument in sorted()
        placesToVisit.stream().sorted((str1,str2) -> str1.compareTo(str2)).forEach(x -> System.out.println(x));

        /**
             collect() : This method stores the modified stream as a new collection type
             (it can be list, map etc.),after the stream operation terminates,
             under a new identifier.
         */

        System.out.println();
        List<Integer> myNumber = new ArrayList();
        myNumber.add(9);
        myNumber.add(5);
        myNumber.add(2);
        myNumber.add(5);
        myNumber.add(9);
        //The Modified Stream is stored in "doubled multiplying by 2" using collect()
        List<Integer> makeDoubled = myNumber.stream().map(x->2*x).collect(Collectors.toList());

        System.out.println(makeDoubled);

    }

}
