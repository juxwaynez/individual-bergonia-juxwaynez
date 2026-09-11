package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12Bergonia {

    // 1. Method to identify if a number is odd or even
    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // 2. Method to print your name 50 times
    public static String printName50Times() {
        String result = "";

        for (int i = 1; i <= 50; i++) {
            result += i + ". Juxwaynez\n";
        }

        return result;
    }

    // 3. Method to get the square root of a number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // 4. Method to get the power of a number
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 5. Method to print a random number between 1 and 100
    public static int randomNumber() {
        return (int)(Math.random() * 100) + 1;
    }

    // 6. Method to get the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 7. Method to identify if a person is a voter
    public static String voterStatus(int age) {
        if (age >= 18) {
            return "You are a voter.";
        } else {
            return "You are not a voter.";
        }
    }

    // 8. Method to get the length of a word
    public static int wordLength(String word) {
        return word.length();
    }

    // 9. Method to print a word in reverse order
    public static String reverseWord(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return reverse;
    }

    // 10. Method to print full name and age
    public static String fullNameAndAge() {
        String fullName = "Juxwaynez Qry Bergonia";
        int age = 20;

        return "Full Name: " + fullName + "\nAge: " + age;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== ACTIVITY 12 =====");
            System.out.println("1. Odd or Even");
            System.out.println("2. Print Name 50 Times");
            System.out.println("3. Square Root");
            System.out.println("4. Power of a Number");
            System.out.println("5. Random Number 1-100");
            System.out.println("6. Area of a Circle");
            System.out.println("7. Voter Status");
            System.out.println("8. Word Length");
            System.out.println("9. Reverse Word");
            System.out.println("10. Full Name and Age");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();

                    System.out.println("The number is: " + oddOrEven(number));
                    break;

                case 2:
                    System.out.println(printName50Times());
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();

                    System.out.println("Square Root: " + squareRoot(num));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();

                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();

                    System.out.println("Answer: " + power(base, exponent));
                    break;

                case 5:
                    System.out.println("Random Number: " + randomNumber());
                    break;

                case 6:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();

                    System.out.println("Area of Circle: " + circleArea(radius));
                    break;

                case 7:
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();

                    System.out.println(voterStatus(age));
                    break;

                case 8:
                    System.out.print("Enter a word: ");
                    String word = scanner.nextLine();

                    System.out.println("Length of word: " + wordLength(word));
                    break;

                case 9:
                    System.out.print("Enter a word: ");
                    String originalWord = scanner.nextLine();

                    System.out.println("Reverse: " + reverseWord(originalWord));
                    break;

                case 10:
                    System.out.println(fullNameAndAge());
                    break;

                case 0:
                    System.out.println("Program ended. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

