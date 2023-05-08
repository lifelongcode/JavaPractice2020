package com.ap.findtriplet;

public class Main {

    public static void main(String[] args) {
        FindTriplet ft = new FindTriplet();

        int[] myArray = {5, 32, 1, 7, 10, 50, 19, 21, 2};
        int n = myArray.length;

        ft.findTripletElement(myArray, n);

    }
}
