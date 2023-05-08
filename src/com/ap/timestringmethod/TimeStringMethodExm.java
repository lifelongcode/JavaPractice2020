package com.ap.timestringmethod;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TimeStringMethodExm {

    public String secsToMinSec(int miscTimeInSecs){
        int mins = miscTimeInSecs / 60;
        int secs = miscTimeInSecs % 60;
        String secString = "";

        //we can create if else statement that will make our clock
        // like 01, .... 09
        if(secs < 10){
            secString = "0" + Integer.toString(secs);
        } else {
           secString = Integer.toString(secs);
        }
        return (Integer.toString(mins) + ":" + secString);
    }

    public double secsToMinsDec(int miscTimeInSecs){
        final int places = 2; //Number of decimal places to return
        BigDecimal decimalMins = BigDecimal.valueOf(miscTimeInSecs / 60);
        decimalMins = decimalMins.setScale(places, RoundingMode.HALF_UP);
        return decimalMins.doubleValue();
    }

    /**
     private String secondsToString(int pTime) {
     return String.format("%02d:%02d", pTime / 60, pTime % 60);
     }
     */

    public String secondsToString(int timeMisc){
        return String.format("%03d:%02d", timeMisc/100, timeMisc % 60);
    }

    //Note: The %02d means: "Format as a decimal number using at least 2 digits, and pad with 0 if less than 2 digits"

    //String like 20:20 which is minutes and second presenting here



//
//    public void stringToInteger(String clockTime){
//       // String totalTime = String.format("%3d", minutes) + ":" + String.format("%2d", seconds);
//        String[] timef = clockTime.split(":");
//
//        int minute = Integer.parseInt(timef[0]);
//        int second = Integer.parseInt(timef[1]);
//
//        int temp = second + (60 * minute);
//        System.out.println(timef);
//    }


    //Now I need this String to convert integer
}
