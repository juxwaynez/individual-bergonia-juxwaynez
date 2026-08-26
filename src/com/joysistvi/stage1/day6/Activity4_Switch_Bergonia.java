package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_Switch_Bergonia {

    public static void main(String[] args) {

        System.out.println("=== Student Portal Menu ===");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Pay Tuition");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your chioce (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: View Grades");
            break;
            case 2:
                System.out.println("You selected Option 2: Enroll Subjects");
            break;
            case 3:
                System.out.println("You selected Option 3: Pay Tuition");
            break;
            case 4:
                System.out.println("You selected Option 4: Exit");
            default:
                System.out.println("Invalid choice. Please try again.");


        } scanner.close();










    }
}
