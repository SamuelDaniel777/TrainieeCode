package com.yash.demoapp1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.apache.catalina.Session;

import com.yash.demoapp1.serviceimpl.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(value = "/login")
public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usernameString= request.getParameter("username");
		String passString=request.getParameter("password");
		PrintWriter printWriter= response.getWriter();
		UserService userService=new UserService();
	
		
	}
}
