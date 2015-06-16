package com.thoughtworks.accountbalance;

/**
 * Created by Eugene on 6/8/2015.
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
        balance+=amount;
        return balance;
    }

    public int withdraw(int amount) {
        if(balance > amount)
            balance-=amount;
        return balance;
    }
    
    public int balance(){
        return balance;
    }
}
