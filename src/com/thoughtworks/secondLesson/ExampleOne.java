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
        Enumeration e = _Orders.elements();
        double outstanding = previousPrice*1.2;

        //Print banner
        PrintBanner();
        //Calculate Outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.GetAmount();
        }

        //print details
        PrintDetails(outstanding);


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
