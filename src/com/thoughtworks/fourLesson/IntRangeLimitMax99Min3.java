package com.thoughtworks.fourLesson;

/**
 * Created by twer on 2/18/14.
 */
public class IntRangeLimitMax99Min3 extends IntRange {
    public void SetHigh(int high){
        if(high > 99)
            this.high = 99;
        else
            this.high = high;

    }

    public void SetLow(int low){
        if(low < 3)
            this.low = 3;
        else
            this.low = low;

    }
}
