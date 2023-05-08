package com.ap.inputvalidationuntllsatis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemoUntil {

    public static void main(String[] args) {
        //We have to create a Scanner object for keyboard input from the user.
        Scanner keyboard = new Scanner(System.in);


        //Open the file
        Scanner inputFile = null;
        FileInputStream file = null;
        boolean fileNotReady = true;

        //attempt to open the file
        do {
            //get the name of the file from the user.
            System.out.println("Enter the filename: ");
            String fileName = keyboard.nextLine();
            try {
                file = new FileInputStream(fileName);
                /**
                 Successfully opened the file in try-block code.
                 Catch block will not be entered because no
                 exception has been thrown.
                 */
                fileNotReady = false; //Indicate file was opened

            } catch (FileNotFoundException e) {
                System.out.println("File not found! ");
            }
        }
            while (fileNotReady) ;

        /**
         * By the time we reach this point in the program, we
         * know we have found the file specified by the user.
         */

        inputFile = new Scanner(file);
        //Read lines from the file until no more are left
        while(inputFile.hasNext()){
            String oneLine = inputFile.nextLine();
            System.out.println(oneLine);
        }
        inputFile.close();


    }
}
