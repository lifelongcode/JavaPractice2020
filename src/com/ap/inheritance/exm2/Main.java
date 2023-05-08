package com.ap.inheritance.exm2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account harrysAccount = new Account();
        harrysAccount.setNumber("147201");
        harrysAccount.setBalance(500.00);
        harrysAccount.setCustomerName("Harry Porter");
        harrysAccount.setCustomerEmailAddress("harryporter@dumbledoor.com");
        harrysAccount.setCustomerPhoneNumber("7184504150");
        harrysAccount.withdrawal(100.0);
        harrysAccount.deposit(500.99);
        harrysAccount.withdrawal(100.99);
        harrysAccount.deposit(479.00);


        System.out.println();
        //Also, we can use directly when we create an object

        Account checkingAP = new Account("147101",500.00,"Abraham Parker", "ap@abrham.com","714856239");
        System.out.println(checkingAP.toString());

    }
}
