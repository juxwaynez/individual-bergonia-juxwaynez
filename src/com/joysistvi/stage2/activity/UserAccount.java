package com.joysistvi.stage2.activity;

public class UserAccount {

    // Private fields - Encapsulation
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        // Validate email
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "Invalid Email";
        }

        // Validate password
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            this.password = "Invalid Password";
        }
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for middleName
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        }
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        }
    }

    // Email validation
    public boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // Password validation
    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
