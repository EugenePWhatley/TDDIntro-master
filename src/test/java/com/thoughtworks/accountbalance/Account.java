package com.thoughtworks.accountbalance;

/**
 * Created by Eugene on 6/8/2015.
 */
public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float deposit(float amount) {
        balance+=amount;
        return balance;
    }

    public float withdraw(float amount) {
        if(balance > amount)
            balance-=amount;
        return balance;
    }
}
