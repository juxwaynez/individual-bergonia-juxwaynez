package com.joysistvi.stage1.day14;


import java.util.Scanner;

// parameters & arguments
// SOC Principle
// Code Reusability
// Avoid code duplication

public class LoadRegistration {

    // *143#
    // *123#

    public static void validateUssdCode() { //
        String ussdCode = "*143#";

        if (!ussdCode.equals("*143#") || ussdCode.isEmpty()) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0); // Exit JVM
        }
    }

}

//    // Greetings with user
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name = scanner.nextLine();
//        greet(name);
//    }
//
//    public static void greet(String name){
//        System.out.println("Hello " + name);
//    }

    // return used to exit the method
    // system.exit(0) -> exit the system


//import java.util.Scanner;
//
//public class Csp1LoadRegistration_Bergonia {
//
//    static Scanner scanner = new Scanner(System.in);
//
//    // *897#
//
//
//
//    public static void main(String[] args) {
//        isValidUssdCode();
//    }
//
//    public static void isValidUssdCode() {
//        System.out.println("Enter *897# to use Mars services");
//        System.out.println("Enter USSD Code: ");
//        String ussdCode = scanner.nextLine().trim();
//
//        if (!ussdCode.equals("*897#")) {
//            System.out.println("Oh no! Unrecognized USSD code. Exiting…");
//            System.exit(0);
//
//        }
//
//    }
//
//    // Display
//    public static void mainMenu() {
//        System.out.println("==========================================");
//        System.out.println("      MARS LOAD REGISTRATION SYSTEM       ");
//        System.out.println("==========================================");
//    }
//
//}
