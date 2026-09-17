package com.joysistvi.stage2.discussion.day23;


// SRP
public class Pet {

    private String name;
    private int ageInMonths;
    private String breed;

    public Pet(String name, int ageInMonths, String breed) {
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.breed = breed;
    }

    public Pet(String name, int ageInMonths) {
        this.name = name;
        this.ageInMonths = ageInMonths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", ageInMonths=" + ageInMonths +
                ", breed='" + breed + '\'' +
                '}';
    }
}
