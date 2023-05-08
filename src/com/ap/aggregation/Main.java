package com.ap.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student s1 = new Student("Aiden", 1, "CS");
        Student s2 = new Student("Abraham", 2, "CS");
        Student s3 = new Student("Lily", 3, "CS");
        Student s4 = new Student("Lily", 4, "CS");
        Student s5 = new Student("Jenifer", 1, "EEN");
        Student s6 = new Student("Rahman", 2, "EEN");

        //Since we added students (creating object) now making a list of CS students
        List<Student> cs_stu = new ArrayList<>();
        cs_stu.add(s1);
        cs_stu.add(s2);
        cs_stu.add(s3);
        cs_stu.add(s4);

        //Since we added students (creating object) now making a list of EEN students
        List<Student> een_stu = new ArrayList<>();
        een_stu.add(s5);
        een_stu.add(s6);

        //Creating Department instance
        Department CS = new Department("CS", cs_stu); //department name and list of student
        Department EEN = new Department("EEN", een_stu);//department name and list of student

        //Creating list of Departments
        List<Department> departments = new ArrayList<>();
        departments.add(CS);
        departments.add(EEN);

        //let's create Institute instance
        //also passing the arguments institute name and list of  departments
        Institute institute = new Institute("JFmedia", departments);
        System.out.print("Total Student in the institute currently has: ");
        System.out.print(institute.getTotalStu());

    }
}
