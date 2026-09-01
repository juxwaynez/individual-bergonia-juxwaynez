package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7Scanner_Bergonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Multiplication Table ===");

        // User input
        System.out.println("Enter which multiplication table you want to display: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();




    }
}
