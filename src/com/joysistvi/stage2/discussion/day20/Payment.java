package com.joysistvi.stage2.discussion.day20;

// General Class
public class Payment {

    double balance;
    double amount;

    public Payment(double balance) {
        this.balance = balance;
    }


    void pay(double amount){
        System.out.println("Processing generic payment of amount: " + amount);


    }
}
