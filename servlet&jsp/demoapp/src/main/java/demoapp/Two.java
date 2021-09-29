package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Two extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pWriter=response.getWriter();
		response.setContentType("text/html");
		pWriter.print("<h1>Two Servlet</h2>");
		ServletConfig servletConfig=getServletConfig();
		pWriter.println("value of p1"+servletConfig.getInitParameter("p1"));
		pWriter.println("value of p2"+servletConfig.getInitParameter("p2"));
		pWriter.println("value of p3"+servletConfig.getInitParameter("p3"));
		pWriter.println("value of p4"+servletConfig.getInitParameter("p4"));
		ServletContext sContext=getServletContext();
		pWriter.println("value of p5"+sContext.getInitParameter("p5"));
	}
}