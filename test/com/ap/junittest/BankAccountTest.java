package com.ap.junittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankAccountTest {

    /**
         understanding note here:
         Transaction happened in the bank help of the teller
         Now the test we are going to Bank account open with $1997.00 then we deposit $375.99
         our available balance should be $ 2372.99
         Here we're going to test our actual value and expected value
         here is delta is the parameter, it is some leeway in the comparison. As long as the difference between
         the expected and actual values is within the delta we specify, then the assertion will pass.
         in this case we expected our value to be exactly 2372.99
     */

    @Test
    void deposit() throws Exception{
        BankAccount myAccount = new BankAccount("Abraham", "Parker", 1997.00,BankAccount.CHECKING);
        double balance = myAccount.deposit(375.99, true);
        assertEquals(2372.99, balance, 0);

    }

    //Every test method should be sef contained. 1 test method what happened another test method.
    //Every test method should start fresh, and be able to run independently
    //of the other test methods. And as you saw earlier. We did run dummy test method independently.
    @Test
    void withdraw() throws Exception{

    }

    @Test
    void getBalance_deposit() throws Exception{
        BankAccount myAccount = new BankAccount("Abraham", "Parker", 2750.00, BankAccount.CHECKING);
        myAccount.deposit(250.99, true);
        assertEquals(3000.99, myAccount.getBalance(),0);
    }

    @Test
    void getBalance_withdraw() throws Exception{
        BankAccount myAccount = new BankAccount("Abraham", "Parker", 5000.00, BankAccount.CHECKING);
        myAccount.withdraw(2500.00, true);
        assertEquals(2500.00, myAccount.getBalance(),0);
    }

    @Test
    public void isCheking_true(){
        BankAccount apAcc = new BankAccount("Mst", "Ferdous", 1700, BankAccount.CHECKING);
        //assertEquals(true, apAcc.isChecking());
        //we can test by assertTrue
        assertTrue(apAcc.isChecking(), "The account is NOT a checking account");
    }

    /**
     * it is just dummy test

    @Test
    public void dummyTest(){
        assertEquals(20, 21);
    }
    */
}