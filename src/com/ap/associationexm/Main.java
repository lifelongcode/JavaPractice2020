package com.ap.associationexm;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank("apbNYC");
        Employee newEmp = new Employee("Anthony");

        Set<Employee> employees = new HashSet<>();
        employees.add(newEmp);

        myBank.setEmployees(employees);

        System.out.println(myBank.getEmployees() + " are belongs to the bank " +
                myBank.getBankName());
    }
}
