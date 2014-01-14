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

    public double overdraftCharge(int daysOverdrawn){
        if(isPremium()){
            double result = 10;
            if(daysOverdrawn > 7)
                result += (daysOverdrawn - 7) * 0.85;
            return result;
        }
        else
            return daysOverdrawn *1.75;

    }
}
