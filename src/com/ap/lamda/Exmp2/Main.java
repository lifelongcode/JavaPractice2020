package com.ap.lamda.Exmp2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 31);
        Employee dick  = new Employee("Dick Sen", 37);
        Employee abraham = new Employee("Abraham Parker", 38);
        Employee mike = new Employee("Michael Abiola", 39);
        Employee bradly = new Employee("Bradly Copper", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(dick);
        employees.add(abraham);
        employees.add(mike);
        employees.add(bradly);

        //Take a look first code doesn't use lambda expression
        //Sort employees ascending order
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        //Using Lambda Expression
        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee emp: employees) {
            System.out.println(emp.getName());
        }



    }
}
