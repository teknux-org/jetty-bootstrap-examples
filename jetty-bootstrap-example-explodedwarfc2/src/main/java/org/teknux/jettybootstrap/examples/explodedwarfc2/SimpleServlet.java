package org.teknux.jettybootstrap.examples.explodedwarfc2;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -6420952700663121094L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/plain");
		response.setStatus(HttpServletResponse.SC_OK);

		String value = request.getParameter("value");
		response.getWriter().println("Value=" + value);
	}
}
