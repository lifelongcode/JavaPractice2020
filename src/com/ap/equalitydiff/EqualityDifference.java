package com.ap.equalitydiff;

/**
 Here is the simple program to understand == operator
 and equals() method
 */
public class EqualityDifference {

    public static void main(String[] args) {
        String name = new String("John");
        String nameTwo = new String("John");

        System.out.println("We can see the result " + name.equals(nameTwo));
        System.out.println(name == nameTwo);

        //Also, more example
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true




    }
}
