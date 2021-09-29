package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class One extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pWriter=response.getWriter();
		response.setContentType("text/html");
		pWriter.print("<h1>One Servlet</h2>");
		ServletConfig config=getServletConfig();
		pWriter.println("value of p1"+config.getInitParameter("p1"));
		pWriter.println("value of p2"+config.getInitParameter("p2"));
		pWriter.println("value of p3"+config.getInitParameter("p3"));
		pWriter.println("value of p4"+config.getInitParameter("p4"));
		ServletContext sContext=getServletContext();
		pWriter.println("value of p5"+sContext.getInitParameter("p5"));
	}
}
