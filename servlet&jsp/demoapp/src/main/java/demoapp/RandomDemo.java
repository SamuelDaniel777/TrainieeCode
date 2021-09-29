package demoapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class RandomDemo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Random random=new Random();
		int i= random.nextInt(10);
		int j= random.nextInt(10);
		int k= random.nextInt(10);
		int l= random.nextInt(10);
		
		PrintWriter pWriter= res.getWriter();
		pWriter.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>Random Numbers</h1>\r\n"
				+ "\r\n"
				+ "<ul>\r\n "
				+ "<li>"
				+ i  
				+ "</li>\r\n"
				+ "  <li>"
				+ j
				+ "</li>\r\n"
				+ "  <li>"
				+ k
				+ "</li>\r\n"
				+"  <li>"
				+ l
				+ "</li>\r\n"
				+ "</ul>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}
}
