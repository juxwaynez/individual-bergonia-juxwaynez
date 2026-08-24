package com.joysistvi.stage1.day4;

public class Activity2_Bergonia {

    public static void main(String[] args) {

        // Given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentages
        double foodPercent = (foodAllowance / income) * 100;
        double transportPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Calculate total expenses and remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;
        double remainingPercent = (remainingBalance / income) * 100;

        // Display results with rounding using printf
        System.out.printf("Food Allowance: %.1f %%\n", foodPercent);
        System.out.printf("Transportation: %.1f %%\n", transportPercent);
        System.out.printf("Rent: %.1f %%\n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%\n", utilityPercent);
        System.out.printf("Remaining Balance: %.1f %%\n", remainingPercent);
        System.out.printf("Remaining Balance in Pesos: %.2f\n", remainingBalance);


    }
}
