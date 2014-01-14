package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/14/14.
 */
public class Account {

    private AccountType _AccountType;
    private int _daysOverdrawn;
    private DaysOverdrawn daysOverdrawn;

    public Account(AccountType accountType, int daysOverdrawn) {
        _AccountType = accountType;
        _daysOverdrawn = daysOverdrawn;
        createDaysOverdrawnComputerByType();
    }

    public double bankCharge(){
        double result = 4.5;
        if(_daysOverdrawn > 0)
            result += daysOverdrawn.invoke();
        return result;
    }

    private void createDaysOverdrawnComputerByType() {
        if(_AccountType.isPremium()){
            daysOverdrawn = new PremiumDaysOverdrawn(_daysOverdrawn);
        }
        else {
            daysOverdrawn = new DaysOverdrawn(_daysOverdrawn);
        }
    }

}

