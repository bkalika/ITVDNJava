package com.itvdn.ex006_servlet_multithreading;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArifmeticServlet extends HttpServlet {
	private List<String> operations = new ArrayList<>();

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
			
			switch(operation) {
			case "add": operations.add(value1 + " + " + value2 + " = " + (value1+value2));
				break;
			case "sub": operations.add(value1 + " - " + value2 + " = " + (value1-value2));
				break;
			case "mult": operations.add(value1 + " * " + value2 + " = " + (value1* value2));
				break;
			case "div": operations.add(value1 + " / " + value2 + " = " + (value1 / value2));
				break;
			default: throw new Exception();
			}
			
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Arifmetic multithreading</title>");
			writer.println("</head>");
			writer.println("<body>");
			
			for(String result : operations) {
				writer.print("<p>" + result + "</p>");
			}
			
		} catch(Exception e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			e.printStackTrace();
		} finally {
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}
		
	  }
}
		
		
