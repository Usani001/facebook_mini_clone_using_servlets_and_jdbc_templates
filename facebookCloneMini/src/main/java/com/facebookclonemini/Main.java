package com.facebookclonemini;

import com.facebookclonemini.dto.UserDTO;
import com.facebookclonemini.enums.Gender;
import com.facebookclonemini.models.User;
import com.facebookclonemini.service.implementation.UserImpl;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main {
    public static void main(String[] args) {


        User user = new User("Maria456","1234","Martins","Chidi",
                "email@gmail.com", LocalDate.of(1995,8,21), "Male","Canada");
        UserDTO userDTO = new UserDTO();
        userDTO.userDetails(user);



    }
}
