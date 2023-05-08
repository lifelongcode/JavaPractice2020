package com.ap.aggregation;

import java.util.List;

public class Department {
    String dName;
    //List of Students
    private List<Student> students;

    public Department(String dName, List<Student> students) {
        this.dName = dName;
        this.students = students;
    }

    //Method for returning students
    public List<Student> getStudents(){
        return students;
    }
}
