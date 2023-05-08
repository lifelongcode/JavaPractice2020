/**
    This is the simple program where we can show that
    how StringBuffer replace the character in the substring with characters in the
    specified String.
    The method is
    public StringBuffer replace (int start, int end, String str)
    Note: start --- The beginning index , inclusive
          end ----- The ending index, exclusive
          str ------ String that will replace previous contents
 */

package com.ap.stringbufferandstringbuilder;

public class StringBufferReplace {

    public static void main(String[] args) {
        /**
            Let's say as a user I input my first name and middle name
            but the system wants to organize as first name and Last name
            What we have to do one way we could solve the problem
            StringBuffer replace
         */

        StringBuffer sbreplace = new StringBuffer("Abraham Farhad");
        sbreplace.replace(8, 14,"Parker");
        System.out.println(sbreplace);

        //This could be helpful real job, let's say user just input
        //first name and last name, after that we want to
        //create sending message first line
        //like that -
        //Dear firstname lastname,
        //Here we always added
        // Dear  middlewhitespace ,

        sbreplace.insert(0, "Dear ");
        sbreplace.replace(19, 20, ",");
        System.out.println(sbreplace);
        //So the output will be
        //Dear Abraham Parker,

    }
}
