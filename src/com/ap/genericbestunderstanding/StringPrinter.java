package com.ap.genericbestunderstanding;

public class StringPrinter {
    String contentToPrint;

    public StringPrinter(String contentToPrint){
        this.contentToPrint = contentToPrint;
    }

    public void print(){
        System.out.println(contentToPrint);
    }

}
