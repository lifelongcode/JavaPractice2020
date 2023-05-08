package com.ap.stream.builtinstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BuiltInStreamExm {

    public static void main(String[] args) {

        //Creating a Stream from a Collection using stream() method. For example
      //  List<String> friendList = List.of("Abir", "Michael", "Aurthy", "Saif", "Mohammed");
      //  Stream<String> supernatural1 = friendList.stream();
       List<String> friendList = Arrays.asList("Abir", "Michael", "Arafat", "Saif", "Mohammed");
       Stream<String> supernatural1 = friendList.stream();

        //Creating a Stream from an Array using stream() method. For example:
        Integer[] myArray = {797, 345,71,45};
        Stream<Integer> myStream = Arrays.stream(myArray);

        //Example of creating a Stream directly for Integer
        Stream<Integer> nextStream = Stream.of(456, 231, 89, 797);

    }

}
//Creating a Stream directly for Objects of User-Defined Classes:
//This is the example of user-defined Class Employee
class Employee{
    private String name;
    private Double salary;

    public Employee(String name, Double salary){
        super();
        this.name = name;
        this.salary = salary;

    }

    //Creating
    public static void main(String[] args) {

        Stream<Employee> empStream = Stream.of(new Employee("Abraham", 7790.7),
                new Employee("Michael", 79750.79), new Employee("Harris", 65900.75));
    }
}