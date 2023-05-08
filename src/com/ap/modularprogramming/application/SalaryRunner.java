package com.ap.modularprogramming.application;



import com.ap.modularprogramming.calculator.CalculatorHelper;
import com.ap.modularprogramming.calculator.SalaryCalculator;

public class SalaryRunner {
    static SalaryCalculator salCalc = new SalaryCalculator();
    static CalculatorHelper calcHelp = new CalculatorHelper();
    public static void main(String[] args) {
        int newSalaryEmployee = salCalc.salaryCalc(10000, 10);
        int newSalaryManager = salCalc.salaryCalc(30000, 15, 5000);

        System.out.println("Old Salary of Employee: 10000 || New Salary: " + newSalaryEmployee);
        System.out.println("Old Salary of Manager: 30000, || New Salary: " + newSalaryManager);

        //Before CalculatorHelper was default,
        // then we change it to public now we can do different way

        int salary = 35000, bonus = 5500, hike=16;

        salary = salary + bonus;

        //Invoking the Internal Method of Package "com.ap.modularprogramming.calculator"
        //in the external package:

        int newSalaryManager1 = calcHelp.calcHelper(salary, hike);
        System.out.println("Old Salary of Manager: 35000 || New Salary " + newSalaryManager1);

    }

}



