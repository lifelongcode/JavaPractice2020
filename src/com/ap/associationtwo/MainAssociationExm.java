package com.ap.associationtwo;

import java.util.ArrayList;
import java.util.List;

public class MainAssociationExm {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Abraham");

        PhoneNumbers ph1 = new PhoneNumbers();
        ph1.setMobileNumber("7184504150");
        PhoneNumbers ph2 = new PhoneNumbers();
        ph2.setMobileNumber("3147602080");

        //Now let's create a list all these phone number
        List<PhoneNumbers> numberList = new ArrayList<>();
        numberList.add(ph1);
        numberList.add(ph2);

        person1.setPhoneNumber(numberList);

        System.out.println(person1.getPhoneNumber() + " are Phone numbers of the person " + person1.getName());

    }

}
