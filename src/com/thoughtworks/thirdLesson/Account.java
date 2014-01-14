package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class Account {

    private AccountType _AccountType;
    private int _daysOverdrawn;

    public Account(AccountType accountType, int daysOverdrawn) {

        _AccountType = accountType;

        _daysOverdrawn = daysOverdrawn;
    }

    public double bankCharge(){
        double result = 4.5;
        if(_daysOverdrawn > 0)
            result = overdraftCharge();
        return result;
    }

    private double overdraftCharge() {
        if(_AccountType.isPremium()){
            double result = 0;
            if(_daysOverdrawn > 7)
                result = (_daysOverdrawn - 7) * 0.85;
            return result;
        }
        else
            return _daysOverdrawn *1.75;
    }

}
