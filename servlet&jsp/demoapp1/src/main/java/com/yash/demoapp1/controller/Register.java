package com.yash.demoapp1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.yash.demoapp1.model.UserData;
import com.yash.demoapp1.serviceimpl.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/Register")
public class Register extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter printWriter=response.getWriter();
	  String email=request.getParameter("email");
	  String passwordString=request.getParameter("password");
	  String userName=request.getParameter("username");
	  UserService userService=new UserService();
	  
	  try {
		userService.save(email, passwordString, passwordString);
	  } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  }
}
