package com.ap.innerclass;

public class OuterClassMethodInnerClass {
    public void greet(){
        System.out.println("Hi, there");

        class LocalInnerClass{
            String localInnerClassVarible = "Here's Abraham";

            public void printLocalInnerClassVariable(){
                System.out.println(localInnerClassVarible);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

}
