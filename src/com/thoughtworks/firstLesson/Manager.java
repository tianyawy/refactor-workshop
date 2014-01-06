package com.thoughtworks.firstLesson;

public class Manager extends Employee{
    public Manager() {
    }

    @Override
    public int getType(){
        return MANAGER;
    }
}
