package com.facebookclonemini.dto;

import com.facebookclonemini.models.User;

import java.sql.*;

public class UserDTO {


    public  void userDetails(User user) {
        String url = "jdbc:mysql://localhost:3306/emmanuel";
        String userName = "root";
        String password = "Usaniemmanuel@12345";
        try {

           Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, userName, password);
            String query = "INSERT INTO UserDTO(user_name, password, first_name, last_name, email_address, birth_day, gender, country)  VALUE (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFirstName());
            statement.setString(4, user.getLastName());
            statement.setString(5, user.getEmailAddress());
            statement.setDate(6, Date.valueOf(user.getBirthDay()));
            statement.setString(7, String.valueOf(user.getGender()));
            statement.setString(8, user.getCountry());



            statement.executeUpdate();
            statement.close();
            con.close();

            System.out.println("Insert complete");
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
