package com.itvdn.ex005_error;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArifmeticServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		proccessRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		proccessRequest(request, response);
	}
	
	private void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();

		
		try {
			String operation = request.getParameter("operation");
			System.out.println(operation);
			double value1 = Double.valueOf(request.getParameter("val1"));
			System.out.println(value1);
			double value2 = Double.valueOf(request.getParameter("val2"));
			System.out.println(value2);
			
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>");
			writer.println("second servlet");
			writer.println("</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<p1>");
			writer.println("Second servlet from: " + request.getParameter("p1"));
			writer.println("</p1>");
			writer.println("<p1>");
			
			switch(operation) {
				case "add": writer.print(value1 + " + " + value2 + " = " + (value1+value2));
					break;
				case "sub": writer.print(value1 + " - " + value2 + " = " + (value1-value2));
					break;
				case "mult": writer.print(value1 + " * " + value2 + " = " + (value1* value2));
					break;
				case "div": writer.print(value1 + " / " + value2 + " = " + (value1 / value2));
					break;
				default: throw new Exception();
			}
			writer.print("</p1>");
		} catch (Exception e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			e.printStackTrace();
		} finally {
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}
	}
 
}

