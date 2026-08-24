package com.joysistvi.stage1.day5;

public class Activity3_Bergonia {

    public static void main(String[] args) {

        // Task 2: Allowed to enter the event : Yes / No

        int age = 18;
        boolean hasValidid = false;
        String allowed = age >= 18 && hasValidid ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + allowed);

        // Task 3: Class Status check
        boolean isWeekend = true;
        boolean isHoliday = false;
        String noClasses = isWeekend || isHoliday ? "Yes, no classes" : "No classes";
        System.out.println("Are there no classes today? " + noClasses);

        // Task 4: Pass or Fail Check
        int score = 82;
        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Student Result: " + score + " " + result );

        // Task 5: Larger Number Check
        int num = 45;
        int num2 = 67;
        int larger = (num > num2) ? num : num2;
        System.out.println("Larger number: " + larger);









    }
}
