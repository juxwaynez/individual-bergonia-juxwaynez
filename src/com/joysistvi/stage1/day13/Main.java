package com.joysistvi.stage1.day13;

public class Main {
    // Create an object -> Instantiation
    // ClassName object = new Construction();



    public static void main(String[] args) {
        // Object 1
        Laptop laptop = new Laptop();

        laptop.brand = "Lenovo";
        laptop.color = "Black";
        laptop.ramInGb = 12;
        laptop.weightInKg = 1.2;
        laptop.cpu = "i5";

        laptop.playGames();
        laptop.sendEmail();
        laptop.writeCodes();
        laptop.watchTutorial();

        System.out.println();

        // Object 2

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.color = "Gray";
        laptop2.ramInGb = 8;
        laptop2.weightInKg = 1.3;
        laptop2.cpu = "ryzen5";

        laptop2.sendEmail();
        laptop2.writeCodes();
        laptop2.watchTutorial();

        // Object 3

        Laptop laptop3 = new Laptop();
        laptop3.brand = "MSI";
        laptop3.color = "Black";
        laptop3.ramInGb = 32;
        laptop3.cpu = "ryzen9";

        laptop3.sendEmail();
        laptop3.writeCodes();
        laptop3.playGames();

        System.out.println(laptop2.cpu);




    }



}
