package org.tecstack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>");
		out.println("This is my first Servlet");
		out.println("</title></head><body>");
		out.println("<h1>Hello,World! Hello Servlet!</h1>");
		out.println("</body></html>");
	}

}
