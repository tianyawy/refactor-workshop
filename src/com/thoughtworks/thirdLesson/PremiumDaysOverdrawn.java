package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/15/14.
 */
public class PremiumDaysOverdrawn extends DaysOverdrawn {


    public PremiumDaysOverdrawn(int daysOverdrawn) {
        super(daysOverdrawn);
    }


    @Override
    public double invoke() {
        double result = 10;
        if(daysOverdrawn > 7)
            result += (daysOverdrawn - 7) * 0.85;
        return result;
    }
}
