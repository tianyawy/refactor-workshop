package com.thoughtworks.fourLesson;

/**
 * Created by twer on 2/19/14.
 */
public class IntRangeV2 {
    private int low;
    private int high;

    public IntRangeV2(){
    }

    public int GetAve(){
        return (low + high)/2;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
