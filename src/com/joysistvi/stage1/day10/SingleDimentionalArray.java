package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimentionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Syntax -> Declare an array with a specified size only
        // DataType object = new DataType[5];

        int[] evenNumbers = new int[5];

        System.out.println("Enter the first five even numbers: ");
        for (int i = 0; i < evenNumbers.length; i++) {

            evenNumbers[i] = input.nextInt();
        }

        System.out.print("\nTraversing even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }



        /*
         //                 0       1        2        3         4       5
        String[] cars = {"BYD", "Tesla", "Ford", "Bugatti", "Jeep", "Ebike"};

        // Invoke an element from array
        System.out.println(cars[0]);

        // Invoke the last element from array
        System.out.println(cars[cars.length -1]);

        // Get the length of array using length member
        System.out.println(cars.length);

         // Traverse an array using for loop
                        0 < 5
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        // Traverse an array using for-each loop / enhance loop
        for (String car : cars) {
        //       variable
        //    singular form
            System.out.println(car);
        //                   object
        }

        // instantiation
        int[] evenNumbers = new int[5];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;
        evenNumbers[4] = 10;

        System.out.println(evenNumbers[0]);

        // Notes ni sir

        int count = 0;
        for (int i = 0; i < 10; i++){
            count++;

        }
        System.out.println(count);

         */








    }
}
