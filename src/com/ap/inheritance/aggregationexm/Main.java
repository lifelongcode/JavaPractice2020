package com.ap.inheritance.aggregationexm;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("8345 Broadway", "Elmhurst", "NY", 11373, "U.S.");
        Address address2 = new Address("4242 Judge St.", "Elmhurst", "NY", 11373, "U.S.");

        Employee bob = new Employee(101, "Mr. Bob", address2);
        Employee ap = new Employee(102, "Mr. Abraham", address1);

        bob.display();
        System.out.println();
        ap.display();
    }
}
