package com.joysistvi.stage2.day19;

public class Student {

    // SRP -> Single Responsibility Principle
    // this. keyword is a reference to the current object of a class

    // private data members / private fields
    private int id;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;


//    // default constructor
//    public Student() {
//        System.out.println("Student is created.");
//    }

    // parametherized constructor
    public Student(int id, String name, int age, String course, String section, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;
    }




    // setter method / mutator method

    public void setId(int id) {
        this.id = id; // assigment to itself
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSection(String section){
        this.section = section;
    }

    public void setAddress(String Address){
        // validation
        if (address != null && address.trim().length() >= 5) {
            this.address = address;
        } else {
            this.address = "Unknown"; // fallback value or empty
        }
    }



    // getter method / accessor method


    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }
    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public String getAddress() {
        return address;
    }






















}
