package com.ap.hackerrang9;

import java.util.Calendar;
import java.util.Locale;

public class CalenderDate {

    public static String findDay(int month, int day, int year) {

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(Calendar.MONTH, month-1 );
        myCalendar.set(Calendar.DAY_OF_MONTH,day);
        myCalendar.set(Calendar.YEAR, year);

        //Now let create a string which will print out as MONDAY
        String dayOfWeek = myCalendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();

        return dayOfWeek;

    }

    public static void main(String[] args) {

        System.out.println(findDay(8,5,2015));
    }

}
