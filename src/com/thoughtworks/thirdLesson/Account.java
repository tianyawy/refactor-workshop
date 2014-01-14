package com.thoughtworks.thirdLesson;

import org.junit.Test;

/**
 * Created by twer on 1/14/14.
 */
public class Account {

    private AccountType _AccountType;

    public Account(AccountType accountType) {

        _AccountType = accountType;
    }

    public double overdraftCharge() {
        return 0;
    }
}
