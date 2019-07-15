package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {

     void printBanner(){
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }

     void printDeatils(Iterator<Order> elements,String name,double outstanding){
        while (elements.hasNext()) {
            Order each = elements.next();
            outstanding += each.getAmount();
        }
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        printBanner();
        printDeatils(elements,name,outstanding);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
