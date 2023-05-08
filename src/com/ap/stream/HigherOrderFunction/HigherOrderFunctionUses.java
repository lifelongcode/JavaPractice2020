package com.ap.stream.HigherOrderFunction;

import java.util.ArrayList;
import java.util.List;

public class HigherOrderFunctionUses {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Harry");
        strList.add("Hermione");
        strList.add("Ron");
        strList.add("Draco");
        strList.add("Albus");
        strList.add("Hagrid");
        strList.sort((str1, str2)-> str1.compareTo(str2));

        System.out.println(strList);

    }
}
