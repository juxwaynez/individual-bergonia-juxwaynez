package com.joysistvi.stage3.day25;

public class Student {

    private int id;
    private String name;
    private String faveLanguage;

    public Student(String faveLanguage) {
        this.faveLanguage = faveLanguage;
    }

    public Student (int id, String name, String faveLanguage) {
        this.id = id;
        this.name = name;
        this.faveLanguage = faveLanguage;
    }

    public String getFaveLanguage() {
        return faveLanguage;
    }

    public void setFaveLanguage(String faveLanguage) {
        this.faveLanguage = faveLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



