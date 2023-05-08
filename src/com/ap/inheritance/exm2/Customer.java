package com.ap.inheritance.exm2;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Account> accountList;

    Customer(int customerId, List<Account> accountList){
        this.customerId = customerId;
        this.accountList = accountList;
    }


}
