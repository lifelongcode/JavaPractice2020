package com.ap.shallowanddeepdeepcopyexm;
//This is the example of deep copy which will change when we change the object
//any of them value.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address address = new Address("8345 Broadway", "Elmhurst", "New York", 11373);
        User obj1 = new User("Abraham Parker", 1007, address);

        //Now we are going to check deep copy
        User obj2 = (User) obj1.clone();
        System.out.println("Object 1 " + obj1.toString());
        System.out.println("Object 2 " + obj2.toString());

        obj1.address.city = "Jackson Heights";

        System.out.println("\n=======================After Changing the City ==============\n");
        System.out.println("Object 1 " + obj1.toString());
        System.out.println("Object 2 " + obj2.toString());

    }
}
