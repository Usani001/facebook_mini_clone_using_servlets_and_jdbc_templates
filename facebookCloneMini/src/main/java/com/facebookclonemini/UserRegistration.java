//package com.example.facebookclonemini;
//
//import java.sql.*;
//import java.time.LocalDate;
//
//public class UserRegistration {
//
//
//    private String userName;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private String emailAddress;
//    private Date BirthDay;
//    private String age;
//    private String gender;
//    private String country;
//
//
//
//    public  void registerUser() throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emmanuel?user=root&password=Usaniemmanuel@12345");
//        String sql = "INSERT INTO student VALUE (?,?,?,?,?)";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1, userName);
//        statement.setString(2, password);
//        statement.setString(3, emailAddress);
//        statement.setString(4, date);
//        statement.setString(5, age);
//
//
//
//
//
//        statement.executeUpdate();
//        statement.close();
//        connection.close();
//    }
//}
