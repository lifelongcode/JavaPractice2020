/**
    This is the simple example of POJO Plain Old Java Object.
    It is an ordinary object, which does not require any special restriction.
    The POJO file does not require any special class path.
    It is increase the readability and re-usability of java program.
 */

package com.ap.pojo;

public class Employee {
    private int num;
    private String empName;
    private int id;
    private double empSal;

    public Employee(){
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
}
