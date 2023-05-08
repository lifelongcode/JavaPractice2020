/**
    It is important to know String format because on your programming life
    you may have to use many times, whenever you called many built in java methods
    or your own created method.
     You have printf() and format() methods to print output with formatted numbers.
     The String class has an equivalent class method, format(),
     that returns a String object rather than a PrintStream object.

 */
package com.ap.stringbufferandstringbuilder;

public class CreatingFormatString {
    public static void main(String[] args) {
        float floatVar = 10.2f;
        int intVar = 20;
        String stringVar = "Wala";

        String formatstr;
        formatstr = String.format("The value of the float variable is "
                + "%f, \nwhile the value of the integer "
                +"variable is %d, \nand the string "
                +"is %s ", floatVar, intVar, stringVar);

        System.out.println(formatstr);

        System.out.println("---------------------------------------");
        System.out.printf("The value of the float variable is "
                + "%f, \nwhile the value of the integer "
                +"variable is %d, \nand the string "
                +"is %s ", floatVar, intVar, stringVar);
    }



}
