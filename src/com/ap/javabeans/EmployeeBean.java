package com.ap.javabeans;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

    //Private fields one of the requirement for JavaBean
    private String firstName;
    private String lastName;
    private int startYear;
    private double payRate;

    //This is also requirement for JavaBean
    //No parameter Constructor
    public EmployeeBean() {
    }

    public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.payRate = payRate;
    }

    //One with all four parameter, because we include no parameter
    // constructor we already satisfied the requirement


            //Rule get followed by the variable name.
        //Satisfied the JavaBean requirement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
