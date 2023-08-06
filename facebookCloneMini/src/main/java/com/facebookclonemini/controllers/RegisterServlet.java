package com.facebookclonemini.controllers;

import java.io.*;
import java.sql.Date;
import java.time.LocalDate;

import com.facebookclonemini.dto.UserDTO;
import com.facebookclonemini.enums.Gender;
import com.facebookclonemini.models.User;
import com.facebookclonemini.service.implementation.UserImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;




@WebServlet(name ="RegisterServlet",value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    UserDTO userDTO = new UserDTO();
    UserImpl userImpl = new UserImpl();

    public RegisterServlet(){
        super();
    }



//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.getWriter().append("Served at: ").append(request.getContextPath());
//        RequestDispatcher dispatcher = request.getRequestDispatcher("facebookCloneMini/src/main/webapp/signup.jsp");
//        dispatcher.forward(request, response);

//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();


        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        String birthDay = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");


        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailAddress(emailAddress);
        user.setBirthDay(LocalDate.parse(birthDay));
        user.setGender(gender);
        user.setCountry(country);

        userImpl.signUp(user,userDTO);

//        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        request.getRequestDispatcher("login.jsp").include(request, response);
//        dispatcher.forward(request, response);

//response.sendRedirect("login.jsp");
    }

}