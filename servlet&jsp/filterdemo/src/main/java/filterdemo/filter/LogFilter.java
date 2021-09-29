package filterdemo.filter;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/filter")
public class LogFilter implements Filter {

   
    public LogFilter() {
        
    }

	public void destroy() {
		System.out.println("destroy method is called");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		System.out.println("do filter method is called");
		HttpRequest request2= (HttpRequest) request;
		String ipString=request.getRemoteAddr();
		System.out.println("ip " +ipString +"time" + new Date().toString());
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init method is called");
	}

}
