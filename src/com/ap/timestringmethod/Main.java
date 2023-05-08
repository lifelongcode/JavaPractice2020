package com.ap.timestringmethod;

public class Main {

    public static void main(String[] args) {
        TimeStringMethodExm convertSecToMinSec = new TimeStringMethodExm();

        //call secsToMinSec method
        System.out.println(convertSecToMinSec.secsToMinSec(1530));

        //invoke the secsToMinsDec method
        System.out.println(convertSecToMinSec.secsToMinsDec(966));


        //I need to grab this one
        System.out.println(convertSecToMinSec.secondsToString(1530));


        int numberOne = 51559;
        System.out.println((numberOne / 100 ) + ":"+ (numberOne % 60));
//
//        int seconds = (numberOne * 60) + (numberOne % 60);
//        System.out.println((numberOne / 60) + (numberOne % 60));
    }
}
