package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTests {
    private Account account;
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account = new Account(100);
        assertThat(account.deposit(50), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account = new Account(100);
        assertThat(account.withdraw(50), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account = new Account(50);
        assertThat(account.withdraw(100),is(50));
    }
}
