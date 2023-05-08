package com.ap.genericbestunderstanding;

public class GenericExample {

    public static void main(String[] args) {
        IntegerPrinter printerOne = new IntegerPrinter(77);
        printerOne.print();

        //Let's say we want to print double
        //what we do we create a double class
        DoublePrinter printerTwo = new DoublePrinter(199.99);
        printerTwo.print();

        //Let's say we want to print String
        //what we do we create a StringPrinter class
        StringPrinter printerThree = new StringPrinter("Hello World!");
        printerThree.print();

        //Now we can create just printer

//        Printer printer = new Printer(77);
        //Wrong way to say that, then

        Printer<Integer> print = new Printer<>(89);
        //How we specified that, angle bracket <> we type in Integer
        //oh! note, inside the angle bracket it takes only Object type
        //Wrapper Class
        //That tells java, I want print Integer

        //Let's say now we want to print

    }
}
