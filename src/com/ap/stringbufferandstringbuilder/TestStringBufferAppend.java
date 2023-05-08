package com.ap.stringbufferandstringbuilder;

public class TestStringBufferAppend {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("The test word");
        strBuffer.append(" String Buffer added.");
        System.out.println(strBuffer);

        System.out.println("------------------------------------------------");
        //Also we can create StringBuffer object without assigning any value onto it.
        StringBuffer strBufferTwo = new StringBuffer();
        strBufferTwo.append("Before nothing was added, only me added.");
        System.out.println(strBufferTwo);
    }
}
