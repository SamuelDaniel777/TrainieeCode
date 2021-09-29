package listeneersdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

@WebServlet("/logout")
public class LogOut extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter= response.getWriter();
		HttpSession hSession=request.getSession();
		String nameString= (String) hSession.getAttribute("userString");
		String passString= (String) hSession.getAttribute("passString");
		System.out.println(nameString);
		System.out.println(passString);
		hSession.invalidate();
		
	}

}
