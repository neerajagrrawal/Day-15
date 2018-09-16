package com.capgemini.bankapplication.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/login")
public class CookiesEnabledFilter implements Filter {

	public CookiesEnabledFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession(false);
		if(null == session.getAttribute("customer"))
		{
			
			request.getRequestDispatcher("enableCookies.jsp").include(request, response);
		}
		else
		{
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("errorMessages.jsp");
			requestdispatcher.forward(request,response);
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

}
}
