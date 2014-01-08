package com.thoughtworks.secondLesson;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ExampleOne {
    private PrintStream _PrintStream;
    private Vector<Order> _Orders;
    private String _Name;

    public ExampleOne(PrintStream printStream, Vector<Order> orders, String name) {
        _PrintStream = printStream;
        _Orders = orders;
        _Name = name;
    }

    public void printOwing() {
        //Print banner
        PrintBanner();

        double outstanding = getOutstanding();

        //print details
        PrintDetails(outstanding);


    }

    private double getOutstanding(){
        double result = 0.0;
        Enumeration e = _Orders.elements();
        //Calculate Outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.GetAmount();
        }
        return result;
    }

    public void printOwing2(double previousPrice) {
        //Print banner
        PrintBanner();
        //Calculate Outstanding

        double outstanding = getOutstanding2(previousPrice * 1.2);
        //print details
        PrintDetails(outstanding);


    }

    public void printOwing3(double previousPrice,int month,int day) {
        //Print banner
        PrintBanner();
        //Calculate Outstanding
        double outstanding = getOutstanding2(previousPrice*1.2);


        double adjustValue = adjustValue(month, day);
        //print details
        PrintDetails(outstanding + adjustValue);


    }

    private double adjustValue(int month, int day) {
        int totalDays = month*31+day;
        double importantValue1 = (totalDays * 3) + 200;
        double importantValue2 = (totalDays * 1.5) + 400;

        if((totalDays*4 - importantValue1) > 100){
            importantValue2 = importantValue2 - 20;
        }

        return importantValue2 * 7 -importantValue1;
    }

    private double getOutstanding2(double initOutstanding){
        Enumeration e = _Orders.elements();
        double result = initOutstanding;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.GetAmount();
        }
        return result;
    }

    private void PrintDetails(double outstanding) {
        _PrintStream.println("name:" + _Name);
        _PrintStream.println("amount:" + outstanding);
    }


    private void PrintBanner(){
        _PrintStream.println("********************");
        _PrintStream.println("********Customer****");
        _PrintStream.println("********************");
    }
}
