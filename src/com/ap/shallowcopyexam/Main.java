package com.ap.shallowcopyexam;




public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address newAddress = new Address("8345 Broadway", "Elmhurst", "New York", 11373);
        User obj1 = new User("Abraham Parker", 1007, newAddress);

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
