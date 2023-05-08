package com.ap.shallowcopyexam;

public class Address {
    public String street;
    public String city;
    public String state;
    public int zipCode;

    public Address(){

    }

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return "Address [ Street " + street + "City " + city + " State "+ state + " Zipcode " + zipCode +"]";
    }

}
