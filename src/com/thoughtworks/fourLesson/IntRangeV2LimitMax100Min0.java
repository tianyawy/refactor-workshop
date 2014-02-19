package com.thoughtworks.fourLesson;

/**
 * Created by twer on 2/19/14.
 */
public class IntRangeV2LimitMax100Min0 extends IntRangeV2 {
    @Override
    public void setLow(int low) {
        if(low < 0)
            low = 0;
        super.setLow(low);
    }

    public void setHigh(int high) {
        if(high > 100)
            high = 100;
        super.setHigh(high);
    }
}
