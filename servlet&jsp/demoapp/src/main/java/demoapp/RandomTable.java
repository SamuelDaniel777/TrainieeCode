package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.annotation.Generated;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RandomTable extends HttpServlet {


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter printWriter=response.getWriter();
	  String table;
	  for (int i = 1; i < 25; i++) {
		  printWriter.println("<!DOCTYPE html>\r\n"
		  		+ "<html>\r\n"
		  		+ "<head>\r\n"
		  		+ "<style>\r\n"
		  		+ "table, th, td {\r\n"
		  		+ "  border: 1px solid black;\r\n"
		  		+ "}\r\n"
		  		+ "</style>\r\n"
		  		+ "</head>\r\n"
		  		+ "<body>\r\n"
		  		+ "\r\n"
		  		+ "\r\n"
		  		+ "\r\n"
		  		+ "<table>\r\n"
		  		+ "\r\n"
		  		+ "  <tr>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "     <td>Demo</td>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "     <td>Demo</td>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "     <td>Demo</td>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "     <td>Demo</td>\r\n"
		  		+ "    <td>Demo</td>\r\n"
		  		+ "    \r\n"
		  		+ "  </tr>\r\n"
		  		+ " \r\n"
		  		+ "</table>\r\n"
		  		+ "\r\n"
		  		+ "</body>\r\n"
		  		+ "</html>");
	
	  }
	  	
	}
}
