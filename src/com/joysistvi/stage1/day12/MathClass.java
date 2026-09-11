package com.joysistvi.stage1.day12;

public class MathClass {


    public static void main(String[] args) {

        // Bingo Simulator
        int roll = (int) (Math.random() * 75) + 1;

        String letter;

        System.out.println("Bingo Simulator\n");

        if (roll <= 15) { // 1 - 15
            letter = "B";
        } else if (roll <= 30) { // 16 - 30
            letter = "I";
        } else if (roll <= 45) { // 31 - 45
            letter = "N";
        } else if (roll <= 60) { // 46 - 60
            letter = "G";
        } else {
            letter = "0"; // 60 - 75
        }

        System.out.println("Sa letrang ng " + letter + " : " + roll);



//        for (int i = 0; i < 20; i++) {
//            System.out.println( (int) (Math.random() * 58));
//        }

//        // Downcasting (need to specify kung anong data type)
//        double decNum = 58.59;
//
//        int num = (int) decNum;
//        System.out.println(num);
//
//        // Upcasting
//        byte x = 10;
//
//        float y = x;
//        System.out.println(y);
//
//        // <- Downcasting, UpCasting ->
//        // byte short int long float double

        // Lotto Simulator
        // 1 - 58
        // 0.0 - 1.0



        // Parsing -> convereting a String to primitive datatype or vice versa
        // Casting -> Number Class ex: double -> int





    }
}
