package filterdemo2.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/filter")
public class LogFilter implements Filter {

	public void destroy() {
		System.out.println("Destroy called");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("log do filter method called ");
		HttpServletRequest hsr =(HttpServletRequest)request;
		String ipAddString = request.getRemoteAddr();
		System.out.println("ip address" +ipAddString+"time and date"+new Date().toString());
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init method is called");
	}

}
