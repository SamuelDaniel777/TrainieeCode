package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServletReqDisp extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//reqdispatcher
//		int k=(int)request.getAttribute("k"); 

		//sendredirect using url rewritting
//		int k= (int)Integer.parseInt(request.getParameter("k"));
		
		
		//using session
//		HttpSession session=request.getSession();
//		int k=(int)session.getAttribute("k");
//		
		//using cookies
		int k=0;
		Cookie cookies[]= request.getCookies();
		for (Cookie c: cookies) {
			if (c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}  
		}
		k=k*k;
		PrintWriter printWriter = response.getWriter();
		printWriter.print(" Result is "+k);
		
		
	}
}
