package com.joysistvi.stage2.activity;

import java.util.Scanner;

public class MainForUserAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("=== User Account Registration ===");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Create UserAccount object using constructor
        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        // Display account information
        System.out.println("\n=== User Account Information ===");
        System.out.println("Full Name: "
                + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());

        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());

        scanner.close();
    }
}
