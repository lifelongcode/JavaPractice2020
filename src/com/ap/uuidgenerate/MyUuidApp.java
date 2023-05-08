package com.ap.uuidgenerate;

import java.util.UUID;

public class MyUuidApp {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println("We can randomly generate UUID is " + "\n" + uuidAsString);
        System.out.println();

        //Now let's convert from a String to a UUID
        /**
            Although it's rare, in some circumstances
            you might need t convert from a String representation
            of a UUID ( like the one from line above)  back into an instance of UUID.

            Java's UUID class provides a for this scenario with
            the static method, fromString(String)
            You can call this method like this:
         */

        UUID sameUuid = UUID.fromString(uuidAsString);
        assert sameUuid.equals(uuid);

        //we can print sameUuid and see
       // System.out.println(sameUuid);

    }

}
