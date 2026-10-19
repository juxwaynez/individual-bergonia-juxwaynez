package com.joysistvi.stage3.day26;

public class ExceptionHandling {

    public static void main(String[] args) {

        // 1. StringIndexOutOfBoundsException
        try {
            String name = "Juxwaynez";
            System.out.println(name.charAt(20));
        } catch (Exception ex) {
            System.out.println(ex);
        }


        // 2. NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception ex) {
            System.out.println(ex);
        }


        // 3. NumberFormatException
        try {
            String number = "Hello";
            int num = Integer.parseInt(number);
            System.out.println(num);
        } catch (Exception ex) {
            System.out.println(ex);
        }


        // 4. ArithmeticException
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}


/*
public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

         // exception occur

        try {
            System.out.println(numbers[6]);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Ako sakalam");


    }
}
 */
