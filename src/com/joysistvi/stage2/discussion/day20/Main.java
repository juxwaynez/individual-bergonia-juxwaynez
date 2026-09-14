package com.joysistvi.stage2.discussion.day20;

public class Main {

    public static void main(String[] args) {
        GCashPayment gcash = new GCashPayment(5000, 300000);
        CashPayment cash = new CashPayment(5000);
        CreditCardPayment credit = new CreditCardPayment(6000);

        gcash.pay(1500);
        cash.pay(2000);
        credit.pay(3500);


    }
}
