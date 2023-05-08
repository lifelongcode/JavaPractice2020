package com.ap.innerclass;

public class MainClass {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.heyThere();

        /* if we do not create inner class static then it can be processed like this.
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.numberAdded(100);
         */

        //let's create the inner class as static

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.itIsWhatItIs();

        //Note here void method just work here.

        OuterClassMethodInnerClass outerMethodInner = new OuterClassMethodInnerClass();
        outerMethodInner.greet();
    }
}
