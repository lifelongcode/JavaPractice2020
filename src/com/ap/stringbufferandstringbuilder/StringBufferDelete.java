package com.ap.stringbufferandstringbuilder;

public class StringBufferDelete {
    public static void main(String[] args) {
        //String Buffer delete() method
        StringBuffer sb = new StringBuffer("Life is wonderful, successful, when you enjoy it!");
        sb.delete(19, 31);
        System.out.println(sb);

    }
}
