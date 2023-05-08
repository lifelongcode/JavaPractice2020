package com.ap.shallowanddeepdeepcopyexm;

public class Address implements Cloneable{
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
        return "Address [ " + street + ", City " + city + ", State "+ state + ", Zipcode " + zipCode +"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return (Address) super.clone();
    }
}
