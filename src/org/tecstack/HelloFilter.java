package org.tecstack;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HelloFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Filter destroy.");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fchain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		System.out.println("拦截 URI=" + request.getRequestURI());
		fchain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter init.");
	}

}
