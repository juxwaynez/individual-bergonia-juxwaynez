package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();


        Student stud = new Student(1, "Jux", 18, "IT","Hakdog", "Manila");
    }

//     System.out.println("\n \nStudent Profile");
//        System.out.println("id: " + stud.getId());
//        System.out.println("Name: " + stud.getName());
//        System.out.println("Age: " + stud.getAge());
//        System.out.println("Course: " + stud.getCourse());
//        System.out.println("Section: " + stud.getSection());
//        System.out.println("Address: " + stud.getAddress());




}
