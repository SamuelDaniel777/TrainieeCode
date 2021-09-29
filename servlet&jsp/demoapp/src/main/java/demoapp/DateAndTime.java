package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateAndTime extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter =arg1.getWriter();
		ServletContext ctxContext=getServletContext();
		String string=ctxContext.getInitParameter("Fruit");
		printWriter.println(string);
		
		
	}
}
