package com.joysistvi.stage2.discussion.day20;

public class GCashPayment extends Payment {

    double savings;

    public GCashPayment(double balance, double savings) {
        super(balance);
        this.savings = savings;

    }

    // Polymorphism: method overriding
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + "using GCash!");

    }

}
