package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Bergonia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("====================================");
        System.out.println("        Average Calculator          ");
        System.out.println("====================================");


        // Ask the user to enter the number of students and subjects.
        System.out.println("Enter number of students: ");
        int students = scanner.nextInt();

        System.out.println("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine();

        // Store subject names
        String[] subjectNames = new String[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        // Store student names and grades
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];

        // Input student Information and grades
        for (int i = 0; i < students; i++){
            System.out.println("\nEnter Students Name: ");
            studentNames[i] = scanner.nextLine();

            for (int j = 0; j < students; j++){
                System.out.println("Enter grade for " + subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }

            scanner.nextLine();


        }

        // Display Grades Report
        System.out.println("\n========== GRADES REPORT ==========");

        System.out.print("Student Name\t");

        for (int i = 0; i < subjects; i++) {
            System.out.print(subjectNames[i] + "\t");
        }

        System.out.println("Average");

        // Display each student's grades and average
        for (int i = 0; i < students; i++) {

            double sum = 0;

            System.out.print(studentNames[i] + "\t");

            for (int j = 0; j < subjects; j++) {
                System.out.print(grades[i][j] + "\t");
                sum += grades[i][j];
            }

            double average = sum / subjects;

            System.out.printf("%.2f%n", average);
        }

        System.out.println("====================================");

        scanner.close();





    }
}
