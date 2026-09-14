package com.joysistvi.stage2.discussion.day20;

public class CreditCardPayment extends Payment {

    double cashAdvance;

    public CreditCardPayment(double balance) {
        super(balance);
    }

    @Override
    void pay(double amount){
        System.out.println("Paid " + amount + "using Credit Card!");

    }
}
