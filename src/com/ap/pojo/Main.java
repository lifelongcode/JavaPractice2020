package com.ap.pojo;

public class Main {

    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.setEmpName("Jenifer");
        empOne.setId(1005);
        empOne.setEmpSal(65000);

        System.out.println("Employee details: \nName " + empOne.getEmpName()); //Getting the values using the get() method
        System.out.println("Id " + empOne.getId());
        System.out.println("Salary " + empOne.getEmpSal());
    }
}
