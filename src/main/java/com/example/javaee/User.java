package com.example.javaee;

import java.io.Serializable;

public class User{
    private final String firstName;
    private final String secondName;
    private final String email;

    public User(String firstName, String secondName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }



}
