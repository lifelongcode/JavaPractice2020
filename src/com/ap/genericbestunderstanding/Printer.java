package com.ap.genericbestunderstanding;
//<WhatEverYouWant>

//Now the class becomes Generic Printer
public class Printer <T>{
    T contentToPrint;

    public Printer(T contentToPrint) {
        this.contentToPrint = contentToPrint;
    }

    public void print(){
        System.out.println(contentToPrint);
    }

}
