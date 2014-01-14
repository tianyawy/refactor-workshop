package com.thoughtworks.thirdLesson;

public class DaysOverdrawn {

    protected int daysOverdrawn;

    public DaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }


    public double invoke() {
        return daysOverdrawn *1.75;
    }
}
