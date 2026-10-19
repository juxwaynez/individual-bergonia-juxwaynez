package com.joysistvi.stage3.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorGame {

    public static void main(String[] args) {


        System.out.println("* Color Game *");
        List<String> dice = new ArrayList<>();
        dice.add("Blue"); // 0
        dice.add("Red");
        dice.add("Pink");
        dice.add(1, "Yellow");
        dice.add(2, "White");
        dice.add("Green");

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println("Dice " + (i + 1) + ": " + dice.get(0));
        }



//        Collections.shuffle(dice);
//        System.out.println("Dice 1: " + dice.get(0));

//        List<String> dice2 = new ArrayList<>();
//        dice2.addAll(dice);
//
//
//        Collections.shuffle(dice);
//        System.out.println("Dice 2: " + dice.get(0));
//
//        List<String> dice3 = new ArrayList<>(dice2);
//
//        Collections.shuffle(dice);
//        System.out.println("Dice 3: " + dice.get(0));






    }
}

/*
 if (colors.contains("Blue")){
            System.out.println("Has blue color");
        }

        System.out.println(colors.lastIndexOf("Blue"));

         // Sorting
        System.out.println("Before Sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);
 */