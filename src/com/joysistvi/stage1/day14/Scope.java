package com.joysistvi.stage1.day14;

public class Scope {

    public static void main(String[] args) {
        System.out.println(Scope.name);
        Scope.printName();

        Scope scope = new Scope();
        System.out.println(scope.age);
        scope.printAge();

        int x = 10; // locale variable

        // block scope variable
        if (true) {
            double balance = 100.0; // block scope variable
            System.out.println(balance);
        }





    }

    static String name = "Soju"; // static variable

    public static void printName() { // static method
        System.out.println(name);
    }

    int age = 30; // instance variable

    public void printAge() {
        System.out.println(age);

    }

}

/*     A        B           Result
    static to static        direct
    static to instance      direct
    instance to static      instantiate
    instance to instance    direct
 */
