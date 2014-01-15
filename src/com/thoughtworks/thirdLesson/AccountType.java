package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class AccountType {

    private int _Amount;
    private int _daysOverdrawn;

    public AccountType(int amount, int daysOverdrawn,double interestRate) {
        _Amount = amount;
        _daysOverdrawn = daysOverdrawn;
        _interestRate2 = interestRate;
    }

    public static AccountType createAccountType(int amount, int daysOverdrawn, double interestRate) {
        return new AccountType(amount, daysOverdrawn, interestRate);
    }


    private double _interestRate2;

    public double get_interestRate2() {
        return _interestRate2;
    }


    public boolean isPremium() {
        if(_Amount > 100)
            return true;
        return false;
    }

    public double overdraftCharge(){
        if(isPremium()){
            double result = 10;
            if(_daysOverdrawn > 7)
                result += (_daysOverdrawn - 7) * 0.85;
            return result;
        }
        else
            return _daysOverdrawn *1.75;

    }

    public int getDaysOverdrawn() {
        return _daysOverdrawn;
    }


}
