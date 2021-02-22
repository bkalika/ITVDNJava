package ex003_servlet_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnotherServlet extends HttpServlet{
	
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
		
		PrintWriter writer = response.getWriter();
		
		try {
			ServletContext context = getServletContext();
			TestObject testObject = (TestObject) context.getAttribute("test");
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>");
			writer.println("second servlet");
			writer.println("</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>" + testObject.getName() + "</h1>");
			writer.println("</body>");
			writer.println("</html>");
			
		} finally {
			writer.close();
		}
	}
}
