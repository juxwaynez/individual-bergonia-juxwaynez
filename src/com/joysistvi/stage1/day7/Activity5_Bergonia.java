package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Bergonia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("===== SIMPLE ATM MENU =====");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.printf("Current Balance: %.2f%n", balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                depositAmount = input.nextDouble();

                // Nested if for deposit validation
                if (depositAmount > 0) {
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Deposit successful!%n");
                        System.out.printf("New Balance: %.2f%n", balance);
                    }
                } else {
                    System.out.println("Error: Deposit amount must be greater than zero.");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                withdrawAmount = input.nextDouble();

                // Nested if statements for withdrawal validation
                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                        System.out.printf("New Balance: %.2f%n", balance);
                    } else {
                        System.out.println("Error: Insufficient balance.");
                    }
                } else {
                    System.out.println("Error: Withdrawal amount must be greater than zero.");
                }
                break;

            case 4:
                System.out.println("Thank you for using the Simple ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please select a number from 1 to 4.");
                break;
        }

        input.close();
    }
}



