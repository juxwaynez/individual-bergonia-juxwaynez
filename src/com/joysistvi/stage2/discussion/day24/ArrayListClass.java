package com.joysistvi.stage2.discussion.day24;

import java.util.ArrayList; // Import ArrayList from utility package

public class ArrayListClass {

    public static void main(String[] args) {
        // Create an object of an Arraylist
        ArrayList<String> cars = new ArrayList<>();

        // CRUD Operation

        // Create / add items
        cars.add("E-Bike"); // 0
        cars.add("Tricycle"); // 2
        cars.add("Jeep"); // 4
        cars.add(1,"BYD"); // 1
        cars.add(3, "Tesla"); // 3

        // Read / Read item(s)
        System.out.println(cars.get(4));

//        // Update / set item
//        cars.set(4, "BMW");
//        cars.set(0, "SUV");
//        System.out.println(cars);
//
//        // Delete / remove item
//        cars.remove("Ford");
//
//        cars.remove(1);
//        System.out.println(cars);

//        // Getting the size
//        System.out.println(cars.remove(cars.size() - 2));
//        System.out.println(cars);


        System.out.println("\nTraversing an ArrayList using for-loop");
        for (int i = 0; i < cars.size(); i++ ) {
            if ("E-Bike" .equals(cars.get(i))){
                continue;
            }

            System.out.println(cars.get(i));
        }

        System.out.println("\nTraversing an ArrayList using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
