package com.ap.aggregation;

import java.util.List;

/** Institute class contains list of Department objects.
 * It is associated with Department class through its Objects(s). */


public class Institute {
    String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    /**
        Now our goal is to count total students of all departments in a given institute
     */

    //This is very important method which contains 2 list, inside another list
    public int getTotalStu(){
        int noOfStudents = 0;
        List<Student> students;
        for(Department dep: departments){
            students = dep.getStudents();
            for(Student s: students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
