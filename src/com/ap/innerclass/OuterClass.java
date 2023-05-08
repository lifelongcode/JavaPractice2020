package com.ap.innerclass;

public class OuterClass {

    int number = 7;
    public void heyThere(){
        System.out.println("Hey there! it is Happy Friday!");
    }

    public static class InnerClass{
        int number = 107;

        public void itIsWhatItIs(){
            System.out.println("If you let it be so!");
        }
    }
}
