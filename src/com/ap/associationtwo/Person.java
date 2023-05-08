package com.ap.associationtwo;
import java.util.List;

public class Person {
    private String name;
    List<PhoneNumbers> phoneNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<PhoneNumbers> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<PhoneNumbers> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
