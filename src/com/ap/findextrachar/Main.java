package com.ap.findextrachar;

public class Main {

    public static void main(String[] args) {
        CompareStringFindChar csfs = new CompareStringFindChar();

        String myString= "Hello";
        String myAnotherString="Helley";



        System.out.println(csfs.findExtraCharacter(myString.toCharArray(), myAnotherString.toCharArray()));

        //Also, we can convert string to a char[] array
        char[] strA = myString.toCharArray();
        char[] strB = myAnotherString.toCharArray();
        System.out.println(csfs.findExtraCharacter(strA, strB));
    }
}
