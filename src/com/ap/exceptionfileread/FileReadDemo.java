package com.ap.exceptionfileread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Open the file
        Scanner inputFile = null;
        FileInputStream file = null;
        boolean fileNotReady=true;


        do{
            //Get the name of the file from the user
            System.out.println("Enter the file name");
            String fileName = keyboard.nextLine();

            //Attempt to open the file
        try{
            file = new FileInputStream(fileName);
            /**
             successfully opened the file in try-catch code
             Catch block will not be entered because
             no exception has been found.
             */
            fileNotReady = false;

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        }while (fileNotReady);
        /**
            Bye the time we reach this point
            in the program, we know we have found the file
            specified by the user
         */
        inputFile = new Scanner(file);
        //Read the lines from the file until
        //no more are left
        while(inputFile.hasNext()){
            String oneLine = inputFile.nextLine();
            //read the line of text
            System.out.println(oneLine);
        }
        inputFile.close();
    }
}
