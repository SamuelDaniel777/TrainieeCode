package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

public class Add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("val1"));
		int j = Integer.parseInt(req.getParameter("val2"));
		int k = i + j;
		
//		PrintWriter outPrintWriter = res.getWriter();
//		outPrintWriter.println("addition is"+k); 
		
		//using req dispatcher
//		req.setAttribute("k", k);
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
//		requestDispatcher.forward(req, res);
		
		//using send redirect 
//		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k);   //url rewriteing
		
		//using session
//		HttpSession session=req.getSession();
//		session.setAttribute("k",k);
		
		Cookie cookie=new Cookie("k", k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
	}
}
