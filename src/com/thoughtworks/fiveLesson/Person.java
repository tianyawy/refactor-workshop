package com.thoughtworks.fiveLesson;

/**
 * Created by twer on 2/25/14.
 */
public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int _bloodGroup;

    public Person(int bloodGroup) {
        _bloodGroup = bloodGroup;
    }

    public int get_bloodGroup(){
        return _bloodGroup;
    }

}
