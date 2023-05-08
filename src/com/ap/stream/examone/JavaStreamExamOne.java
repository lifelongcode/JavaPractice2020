package com.ap.stream.examone;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExamOne {

    public static void main(String[] args) {
        //1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        //2. Integer Stream with skip
        IntStream
            .range(1, 10)
            .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        //3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1,5)
                        .sum());
        System.out.println();

        //4. Stream.of, sorted and findFirst()
        Stream.of("Parker", "Mike", "Abraham", "Alex")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5. Stream from Array, sort, filter and print
        String[] words = {"The", "quick", "brown",
                "fox", "jumps", "over", "the", "lazy", "dog"};
        Arrays.stream(words)   //Same as Stream.of(words)
                .filter(x -> x.startsWith("l"))
                .sorted()
                .forEach(System.out::println);

    }
}
