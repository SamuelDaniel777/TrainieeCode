package filterdemo2.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Authentication
 */
@WebFilter("/filter")
public class Authentication implements Filter {

    public Authentication() {
    }

	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Authentication filter called");
		String usernameString=request.getParameter("username");
		String passString=request.getParameter("password");
		HttpServletResponse hsr =(HttpServletResponse)response;

		if (usernameString.equals("admin")&&passString.equals("admin")) {
			hsr.sendRedirect("welcome");
		} else {
			hsr.sendRedirect("invalidentry");
		}
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
