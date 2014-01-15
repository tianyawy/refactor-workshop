package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class Account {

    private AccountType _AccountType;
    public double _interestRate;

    public Account(AccountType accountType) {

        _AccountType = accountType;

    }

    public double bankCharge(){
        double result = 4.5;
        if(_AccountType.getDaysOverdrawn() > 0)
            result += _AccountType.overdraftCharge();
        return result;
    }

    public Double interesetForAmout_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}
