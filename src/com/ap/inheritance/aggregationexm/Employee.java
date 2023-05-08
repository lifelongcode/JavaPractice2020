package com.ap.inheritance.aggregationexm;

public class Employee {
    private int id;
    private String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(id + " " + name);
        System.out.println(address.Street+ "\n" + address.City+ "\n"  + address.State+" " + address.ZipCode + "\n"+ address.Country);

    }

}
