package com.thoughtworks.thirdLesson;

/**
 * Created by twer on 1/15/14.
 */
public class PremiumOverdrawnComputer extends OverdrawnComputer {


    public PremiumOverdrawnComputer() {
        super();
    }


    @Override
    public double invoke(int daysOverdrawn) {
        double result = 10;
        if(daysOverdrawn > 7)
            result += (daysOverdrawn - 7) * 0.85;
        return result;
    }
}
