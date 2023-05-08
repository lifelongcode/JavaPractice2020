package com.ap.inheritance.aggregationexm;

/**
 Aggregation is a term which is used to refer
 one way relationship between two objects. ...
 In Java, aggregation represents HAS-A relationship,
 which means when a class contains reference of another class known to have aggregation.
 */
public class Address {
     String Street, City, State, Country;
     int ZipCode;

    public Address(String street, String city, String state,int zipCode, String country ) {
        this.Street = street;
        this.City = city;
        this.State = state;
        this.ZipCode = zipCode;
        this.Country = country;

    }


}
