package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Bergonia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare a single‑dimensional array of 5 integers.
        int[] numbers = new int [5];

        // Ask the user to input 5 numbers.
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display all the numbers entered.
        System.out.println("\nNumbers Entered: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Index " + numbers[i]);
        }

        // Compute and display the sum and average of the numbers.

            // Sum
            int sum = 0;
            for (int i = 0; i < 5; i++){
                sum += numbers[i];
        }
            // Average
            double average = (double) sum / 5;

        // Find and display the highest and lowest number.
            int highest = numbers[0];
            int lowest = numbers[0];

        for (int i = 1; i < 5; i++){
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest){
                lowest = numbers[i];
            }
        }

        // Display Results
        System.out.println("\n\nSum: " + sum);
        System.out.println("Average: " + average);




        scanner.close();




    }
}
