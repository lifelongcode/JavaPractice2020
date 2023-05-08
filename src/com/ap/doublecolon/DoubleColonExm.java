package com.ap.doublecolon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class DoubleColonExm {

    //static method
    static void someFunction(String str){
        System.out.println(str);
    }

    //instance function to be called
    //but remember none static because
    //we are going to create an object then call this method
    void nextFunction(String s){
        System.out.println(s);
    }


    public static void main(String[] args) {
        //To print all elements of the stream:
        Stream<String> myStream = Stream.of("The", "quick", "brown",
                "fox", "jumps", "over", "the", "lazy", "dog");
        myStream.forEach(s -> System.out.println(s));


        //blank line
        System.out.println();

        //Now let's take a look
        //stream.forEach with double colon :: operator
        Stream<String> wordStream = Stream.of("The", "quick", "brown",
                "fox", "jumps", "over", "the", "lazy", "dog");
        wordStream.forEach(System.out::println);


        /**
         When and how to use double colon operator?
         Method reference or double colon operator can be used to refer:
         a static method,
         an instance method, or
         a constructor.
         How to use method reference in Java:
         Static method
         Syntax:
         (ClassName::methodName)
         Example:
         SomeClass::someStaticMethod
         */

        List<String> myFriendList = new ArrayList<>();
        myFriendList.add("Mike");
        myFriendList.add("Shiplu");
        myFriendList.add("Md");
        myFriendList.add("Anthony");

        //Here we can call the static method
        //using double colon operator
        myFriendList.forEach(DoubleColonExm::someFunction);

        List<String> abcList = new ArrayList<>();
        abcList.add("A");
        abcList.add("D");
        abcList.add("G");

        //Blank line
        System.out.println();

        //This example we can show Instance method
        //(objectOfClass::methodName)
        abcList.forEach((new DoubleColonExm()::nextFunction));

        //Super method
        //Syntax (super::methodName)



    }
}
