package com.ap.inheritance.exm1;

public class Main {
    public static void main(String[] args) {
        Child childObj = new Child(501, "Johan");
        childObj.display();

        //If we create Parent Object how it would be.. let's see

        Parent parentObj = new Parent();
        parentObj.display();
    }
}
