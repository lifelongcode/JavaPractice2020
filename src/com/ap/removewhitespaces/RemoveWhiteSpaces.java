package com.ap.removewhitespaces;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String name = "Abraham Parker";
        System.out.println("The length of the name string is "+name.length());

        //Now let's say we want to remove white space of the name String
        String nameWithoutSpaces = name.replaceAll("\\s+", "");
        System.out.println("The length of the nameWithoutSpaces is "
                            + nameWithoutSpaces.length());
    }
}
