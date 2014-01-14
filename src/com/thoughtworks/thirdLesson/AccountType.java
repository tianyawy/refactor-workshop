package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class AccountType {

    private int _Amount;
    private int _daysOverdrawn;

    public AccountType(int amount, int daysOverdrawn) {
        _Amount = amount;
        _daysOverdrawn = daysOverdrawn;
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
