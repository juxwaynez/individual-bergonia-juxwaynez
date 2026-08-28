package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = false;

        while (!isRunning) {
            System.out.println("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Program stopped! ");
                isRunning = true;
            }
        }

        scanner.close();
    }
}

        // flag -> used to track / mark  a variable  whether a specific condition or event has occured



        // [Syntax]

        /*
               initialization
               while (condition) {
               statement / body of the loop
               inc / dec
         */
            // Print numbers from 1-10

        /*
        int i = 1;
        while (i <= 10 ) {
            System.out.println(i);
            i++;
         */




