package com.thoughtworks.thirdLesson;

/**
* Created by twer on 1/15/14.
*/
public class OverdrawnBuilder {

    private AccountType accountType;

    OverdrawnBuilder(AccountType accountType) {
        this.accountType = accountType;
    }

    public OverdrawnComputer invoke() {
        OverdrawnComputer overDrawnComputer;
        if(accountType.isPremium()){
            overDrawnComputer = new PremiumOverdrawnComputer();
        }
        else {
            overDrawnComputer = new OverdrawnComputer();
        }
        return overDrawnComputer;
    }

}
