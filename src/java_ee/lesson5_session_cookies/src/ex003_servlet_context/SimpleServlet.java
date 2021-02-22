package ex003_servlet_context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SimpleServlet extends HttpServlet {
	
	private String developerName;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		// http://localhost:8080/lessonFive/context_result
		
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		
		Object resSessionObj = session.getAttribute("count");
		int count = (resSessionObj == null) ? 0 : (int) resSessionObj;
		
		count++;
		session.setAttribute("count", count);
		
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
				writer.println("param " + i + " " + param);
				writer.print("</p>");
				i++;
			}
			
			TestObject testObject = new TestObject("Test");
			
			ServletContext context = getServletContext();
			context.setAttribute("test", testObject);
			
			writer.print("<h1>Count requested: " + count + "</h1>");
			writer.print("<h1>Count requested: " + developerName + "</h1>");
			
			writer.println("</body>");
			writer.println("</html>");
			
		} finally {
			writer.close();
		}
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		developerName = config.getInitParameter("name");
	}
}
