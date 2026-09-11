package com.joysistvi.stage1.day14;

import java.util.Scanner;

public class Csp1LoadRegistration_Sample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String registeredPromo = "";
        double balance = 100.00; // Starting load balance in PHP

        System.out.println("=== Mars Telecom USSD Simulator ===");
        System.out.print("Dial USSD Code *897#: ");
        String ussdCode = scanner.nextLine();

        if (!ussdCode.equals("*897#")) {
            System.out.println("Connection error or invalid MMI code.");
            scanner.close();
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println("\n==========================================");
            System.out.println("      MARS LOAD REGISTRATION SYSTEM         ");
            System.out.println("==========================================");
            System.out.println("1. Load / Promo Registration");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Mars Promo Registration ---");
                    System.out.println("1. MARS50  - Unli All-Net Calls/Text + 5GB (3 Days) - P50");
                    System.out.println("2. MARS99  - Unli All-Net Calls/Text + 10GB (7 Days) - P99");
                    System.out.println("3. MARS299 - Unli Data (30 Days) - P299");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Select promo to register: ");

                    int promoChoice = scanner.nextInt();

                    if (promoChoice == 1) {
                        balance = processRegistration(scanner, balance, "MARS50", 50.0);
                    } else if (promoChoice == 2) {
                        balance = processRegistration(scanner, balance, "MARS99", 99.0);
                    } else if (promoChoice == 3) {
                        balance = processRegistration(scanner, balance, "MARS299", 299.0);
                    } else if (promoChoice == 4) {
                        break;
                    } else {
                        System.out.println("Invalid promo selection.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Balance Inquiry ---");
                    System.out.printf("Your load balance is: PHP %.2f\n", balance);
                    break;

                case 3:
                    System.out.println("\nThank you for using Mars Telecom! Goodbye.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Helper method to confirm and deduct balance
    private static double processRegistration(Scanner scanner, double currentBalance, String promoName, double cost) {
        System.out.printf("\nRegister for %s for PHP %.2f?\n", promoName, cost);
        System.out.println("1. Confirm");
        System.out.println("2. Cancel");
        System.out.print("Choice: ");
        int confirm = scanner.nextInt();

        if (confirm == 1) {
            if (currentBalance >= cost) {
                currentBalance -= cost;
                System.out.printf("\n[SUCCESS] You have successfully registered for %s!\n", promoName);
                System.out.printf("Remaining balance: PHP %.2f\n", currentBalance);
            } else {
                System.out.println("\n[FAILED] Insufficient load balance to register for this promo.");
            }
        } else {
            System.out.println("\nRegistration cancelled.");
        }

        return currentBalance;
    }

}
