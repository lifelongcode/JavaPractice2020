package com.ap.stringbufferandstringbuilder;

public class ConcatenatingStringExm {
    public static void main(String[] args) {
        String firstName = "Abraham";
        String lastname = "Parker";
        System.out.println(firstName.concat(lastname));

        System.out.println("--------------------------------------------------");
        //Also, we can use the concat() method with String literals, as follows:
        System.out.println("The dump coder name is ". concat(firstName + " " + lastname));

    }
}
