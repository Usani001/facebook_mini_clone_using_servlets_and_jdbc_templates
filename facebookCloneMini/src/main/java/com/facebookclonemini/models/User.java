package com.facebookclonemini.models;

import java.time.LocalDate;

import lombok.*;
@Data
public class User {


    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private LocalDate birthDay;
    private String gender;
    private String country;


    public User() {
    }

    public User(String userName, String password, String firstName, String lastName,
                String emailAddress, LocalDate birthDay, String gender, String country) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.birthDay = birthDay;
        this.gender = gender;
        this.country = country;



    }

}

