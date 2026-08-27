package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Initialized scanner object
        Scanner input = new Scanner(System.in);

        // Get the first number from the user
        System.out.println("Enter first number: ");
        double firstNum = input.nextDouble(); //consume buffer

        // Get the operator symbol from the user
        System.out.println("Enter Operator (+, -, *, /): ");
        char operator = input.nextLine().charAt(0);

        // Get the second number from the user
        System.out.println("Enter second number: ");
        double secondNum = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                System.out.println("Result " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result" + (firstNum * secondNum));
                break;
            case '/':
                if (secondNum == 0){
                    System.out.println("Error: Division by Zero is not allowed");
                } else {
                    System.out.println("Result" + (firstNum / secondNum));
                }
                break;
            default:
                System.out.println("Invalid Operator");




        }

        input.close(); // close scanner10
    }
}
