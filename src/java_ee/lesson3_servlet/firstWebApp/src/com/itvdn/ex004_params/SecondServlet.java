package com.itvdn.ex004_params;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		
		Enumeration<String> allParams = request.getParameterNames();
		
		try {
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>");
			writer.println("second servlet");
			writer.println("</title>");
			writer.println("</head>");
			writer.println("<body>");
			
			int i = 1;
			
			while(allParams.hasMoreElements()) {
				writer.print("<p>");
				String param = allParams.nextElement();
				String value = request.getParameter(param);
				writer.println("param " + i + " " + param + " = " + value);
				writer.print("</p>");
				i++;
			}
			
			writer.println("</body>");
			writer.println("</html>");
		} finally {
			writer.close();
		}
	}
 
}
