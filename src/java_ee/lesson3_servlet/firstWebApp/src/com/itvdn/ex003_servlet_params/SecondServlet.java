package com.itvdn.ex003_servlet_params;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		proccessRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		proccessRequest(request, response);
	}
	
	private void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		String param2 = request.getParameter("p2");
		
		try {
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>");
			writer.println("second servlet");
			writer.println("</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>");
			writer.println("Second servlet from: " + request.getParameter("p1"));
			writer.println("</h1>");
			writer.println("<h2>");
			writer.println("Second servlet from: " + param2);
			writer.println("</h2");
			writer.println("</body>");
			writer.println("</html>");
		} finally {
			writer.close();
		}
	}

}
