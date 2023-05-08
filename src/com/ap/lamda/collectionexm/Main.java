package com.ap.lamda.collectionexm;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        //hardcode
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        //We can check the value added or not
        System.out.println(intSet.toString());

        /**
        //Good way to do that
        for(int i=1; i<=5; i++){
            intSet.add(i);
        }
        System.out.println(intSet.toString());

         */

        //Now let's Set predicate or the condition for filtering the elements
        //using Lambda expression (p) ->(p>2);
        Predicate<Integer> moreThan2Pred = (p) -> (p>2);
        intSet = intSet.stream().filter(moreThan2Pred).sorted().collect(Collectors.toSet());
        System.out.println(intSet);

    }
}
