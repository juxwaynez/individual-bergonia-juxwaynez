package com.joysistvi.stage3.day26;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("name", "Soju Panget");
        students.put("ageInMonths", "67");
        students.put("address", "Metro Manila");
        students.put("isActive", "true");
        students.put("isActive", "False");
        // students.put("maxConnection", "500");
        // System.out.println(students.get("maxConnection"));

        System.out.println(students.get("address"));

        students.remove("isActive");

        System.out.println(students.containsKey("address"));
        System.out.println(students.containsValue("Metro Manila"));







    }
}
