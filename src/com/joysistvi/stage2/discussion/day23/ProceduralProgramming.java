package com.joysistvi.stage2.discussion.day23;

public class ProceduralProgramming {

    // Procedural Programming Approach
    /*
        This programming style relies on procedures or routines(methods/function) to operate on data, where data and behavior are handled separately.
     */

    // Example: We want to create a variable(s) that will describe a pet.
    // name, ageInMonths, classfication, gender, sound, breed
    String petAName = "Winter";
    int petAgeInmonths = 5;
    String petClassification = "Dog";
    String petGender = "Male";
    String petSound = "Bark bark";
    String petBreed = "Husky";

    public static void describePet(String petAName, int petAgeInmonths, String petClassification, String petGender, String petSound, String petBreed) {
        System.out.println(petAName + " is a " + petGender + petClassification + " who is " + petAgeInmonths + " years of age in months and breed is " + petBreed );
    }

    public static void makeSound(String petAName, String petSound) {
        System.out.println(petAName + " says " + petSound + "!");
    }


    // Limitations of Procedural Approach:
    /*
        The entity is not represented as a single unit, but rather a collection of spearated variables (eg. multiples per pet)
        No data protection. Any part of the program can be modified or change the variables directly

     */

    // To address this issues, we can use encapsulation which allows us to bundles the data and methods that operates on the data within a single unit (class) and restrict access to some of the object's component.

}
