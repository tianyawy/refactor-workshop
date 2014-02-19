package com.thoughtworks.fourLesson;

/**
 * Created by twer on 2/18/14.
 */
public class IntRangeLimitMax100Min0 extends IntRange{

    @Override
    public int GetAve(){
        int max = high > 100 ? 100 : high;
        int min = low < 0 ? 0 : low;

        return (max + min)/2;
    }
}
