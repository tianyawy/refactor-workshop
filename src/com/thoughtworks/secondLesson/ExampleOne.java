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
        double initOutstanding = previousPrice*1.2;

        double outstanding = getOutstanding2(initOutstanding);
        //print details
        PrintDetails(outstanding);


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
