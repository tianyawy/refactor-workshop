package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class Account {

    private AccountType _AccountType;
    private double _interestRate;

    private Account(AccountType accountType, double interestRate) {

        _AccountType = accountType;

        _interestRate = interestRate;
    }

    public static Account createAccount(AccountType accountType, double interestRate) {
        return new Account(accountType, interestRate);
    }

    public double bankCharge(){
        double result = 4.5;
        if(_AccountType.getDaysOverdrawn() > 0)
            result += _AccountType.overdraftCharge();
        return result;
    }

    public Double interestedForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}
