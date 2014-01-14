package com.thoughtworks.thirdLesson;

/**
* Created by twer on 1/15/14.
*/
public class OverdrawnBuilder {

    private AccountType accountType;
    private int daysOverdrawn;

    OverdrawnBuilder(AccountType accountType, int daysOverdrawn) {
        this.accountType = accountType;
        this.daysOverdrawn = daysOverdrawn;
    }

    public DaysOverdrawn invoke() {
        DaysOverdrawn overDrawnComputer;
        if(accountType.isPremium()){
            overDrawnComputer = new PremiumDaysOverdrawn(daysOverdrawn);
        }
        else {
            overDrawnComputer = new DaysOverdrawn(daysOverdrawn);
        }
        return overDrawnComputer;
    }

}
