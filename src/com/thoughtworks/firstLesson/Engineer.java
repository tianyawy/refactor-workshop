package com.thoughtworks.firstLesson;

public class Engineer extends Employee{
    private int typeCode = ENGINEER;

    public Engineer() {
    }

    @Override
    public int getType(){
        return typeCode;
    }
}
