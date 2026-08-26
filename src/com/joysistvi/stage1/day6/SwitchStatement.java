package com.joysistvi.stage1.day6;

public class SwitchStatement {

    public static void main(String[] args) {
        String month = "December";

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("Frist Quarter of the year. ");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Second Quarter of the year. ");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Third Quarter of the year. ");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Forth Quarter of the year. ");
                break;
            default:
                System.out.println("Invalid input! Please enter a valid month");


        }

        // Switch Expression (arrow syntax)
        int day = 0;
        switch (day) {
            case 1 -> System.out.println("Monday");
        }

        /*
            Pwede: String, byte, short, int, Enum
            Bawal: Boolean (Range), Long, Float, Double

         */
    }
}
