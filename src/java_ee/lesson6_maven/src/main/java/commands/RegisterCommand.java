package commands;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.UserDAO;
import entity.User;

public class RegisterCommand implements Command {
	
	public String execute(HttpServletRequest request) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean admin = Boolean.parseBoolean(request.getParameter("admin"));
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAdmin(admin);
		DAOFactory factory = DAOFactory.getInstance();
		UserDAO userDAO = factory.getUserDAO();
		Set<User> users = userDAO.getAllUsers();
		int add = 0;
		
		if(!users.contains(user)) {
			add = userDAO.addUser(user);
			System.out.println(add + " size " + userDAO.getAllUsers().size());
		}
		
		if(add == 0) {
			request.setAttribute("notAdd", "This user exists");
			
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}
		
		String result = (add == 0) ? "register.jsp" : "controller?action=main";
		return result;
	}

}
