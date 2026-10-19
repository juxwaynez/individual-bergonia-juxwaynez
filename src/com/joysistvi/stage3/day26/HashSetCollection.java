package com.joysistvi.stage3.day26;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

    public static void main(String[] args) {
        // Set doesn't contains duplicate element
        // Instiating HashSet
        Set<String> names = new HashSet<>();

        names.add("Kimchi");
        names.add("Soju");
        names.add("Buldak");
        names.add("Bimbap");
        names.add("Kimchi");

        // names.clear();

        System.out.println(names);


        if (names.isEmpty()) {
            System.out.println("Exiting...");
        }

        names.forEach(System.out::println);




    }
}
