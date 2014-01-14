package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class AccountType {

    private int _Amount;

    public AccountType(int amount) {

        _Amount = amount;
    }

    public boolean isPremium() {
        if(_Amount > 100)
            return true;
        return false;
    }
}
