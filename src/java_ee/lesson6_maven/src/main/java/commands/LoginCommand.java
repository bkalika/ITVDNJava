package commands;

import javax.servlet.http.HttpServletRequest;

import dao.DAOFactory;
import dao.UserDAO;
import entity.User;

public class LoginCommand implements Command{
	
	public String execute(HttpServletRequest request) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		DAOFactory factory = DAOFactory.getInstance();
		UserDAO userDAO = factory.getUserDAO();
		System.out.println("44444: " + name + " 5555555: " + password);
		User user = userDAO.getUser(name, password);
		String resultPage = (user == null) ? "login.jsp" : "controller?action=main";
		System.out.println("=====******: User: " + user);
		System.out.println(": User: " + name + " -- " + password);
		
		if (user == null) {
			request.setAttribute("notExists", "This user not exists");
			
		} else {
			request.getSession().setAttribute("user", user);
		}
		return resultPage;
	}

}
