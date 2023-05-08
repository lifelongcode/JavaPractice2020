package com.ap.inputvalidationuntllsatis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        //We have to create a Scanner object for keyboard input from the user.
        Scanner keyboard = new Scanner(System.in);
        //get the name of the file
        System.out.println("Enter the filename: ");
        String fileName = keyboard.nextLine();

        //Open the file
        Scanner inputFile = null;
        FileInputStream file = null;

        try{
            file = new FileInputStream(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File not found! ");
            System.exit(0);
        }

        inputFile = new Scanner(file);
        //Read lines from the file until no more are left
        while(inputFile.hasNext()){
            String oneLine = inputFile.nextLine();
            System.out.println(oneLine);
        }
        inputFile.close();


    }
}
