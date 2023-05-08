package com.ap.duplicatestring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 In general let's say your manager ask you find how many Abraham there in the list?
 if you want to get the total number of duplicates of each value of your List, you could do that thanks to
 the Stream API by grouping by values then counting occurrences of each value as next:
 */
public class FindDuplicateString {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Abraham");
        myList.add("Parker");
        myList.add("Abraham");
        myList.add("Teller");
        myList.add("Jenifer");
        myList.add("Austin");
        myList.add("Jenifer");
        myList.add("Pearl");
        Map<String, Long> counter = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(counter);
        }

    }

