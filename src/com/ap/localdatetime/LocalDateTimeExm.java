package com.ap.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExm {

    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();

        //Before format the date and time
        System.out.println("Current date & time : " + rightNow);
        //let's format
        String currentDateTime = rightNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));//pattern = "yyyy-MM-dd HH:mm:ss")
        System.out.println("Current date & time : " + currentDateTime);
    }
}
