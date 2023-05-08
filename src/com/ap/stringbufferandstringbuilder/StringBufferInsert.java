/**
 Description
 This method removes the characters in a substring of this StringBuffer.
 The substring begins at the specified start and extends to the character
 at index end - 1 or to the end of the StringBuffer, if no such character exists.
 If start is equal to end, no changes are made.

 Syntax:
 Here is a separate method for each primitive data type:
 public StringBuffer insert(int offset, boolean b)
 public StringBuffer insert(int offset, char c)
 public insert(int offset, char[] str)
 public StringBuffer insert(int index, char[] str,
 int offset, int len)
 public StringBuffer insert(int offset, float f)
 public StringBuffer insert(int offset, int i)
 public StringBuffer insert(int offset, long l)
 public StringBuffer insert(int offset, Object obj)
 public StringBuffer insert(int offset, String str)
 */

package com.ap.stringbufferandstringbuilder;

public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Life wonderful, when you enjoy it! ");
        sb.insert(5, "is ");
        System.out.println(sb);
    }
}
