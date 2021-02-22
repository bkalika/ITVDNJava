import java.util.List;
import java.util.Set;

import commands.*;
import dao.BunchDAO;
import entity.Bunch;
import org.junit.Before;
import org.junit.Test;

import dao.DAOFactory;
import dao.UserDAO;
import entity.User;
import org.junit.Assert;

import javax.servlet.http.HttpSession;

public class TestCommand {
	
	RequestWrapper wrapper;
	
	@Before
	public void init() {
		wrapper = new RequestWrapper();
	}
	
	@Test
	public void testRegisterCommand() {
		wrapper.addParam("name", "Value2");
		wrapper.addParam("password", "Pass2");

		DAOFactory daoFactory = DAOFactory.getInstance();
		UserDAO userDAO = daoFactory.getUserDAO();
		Set<User> users = userDAO.getAllUsers();
		int currentSize = users.size();
		
		Command command = new RegisterCommand();
		String errorPage = "register.jsp";
		String page = command.execute(wrapper);
		
		users = userDAO.getAllUsers();
		int newSize = users.size();
		
		System.out.println(page);

		Assert.assertEquals(currentSize + 1, newSize);
		Assert.assertNotEquals(errorPage, page);
	}
	
	@Test
	public void testLogin() {
		wrapper.addParam("name", "bod");
		wrapper.addParam("password", "bod");
		
		Command command = new LoginCommand();
		String errorPage = "login.jsp";
		String page = command.execute(wrapper);
//		Assert.assertNotEquals(page, errorPage);

		HttpSession session = wrapper.getSession();
		User user = (User) session.getAttribute("user");

		Assert.assertNotNull(user);
		Assert.assertNotEquals(page, errorPage);
	}

	@Test
	public void testLogout(){
		HttpSession session = wrapper.getSession();
		session.setAttribute("user", new User());

		Command command = new LogoutCommand();
		command.execute(wrapper);

		User user = (User) session.getAttribute("user");
		Assert.assertNull(user) ;

	}

	@Test
	public void testCreateBunchCommand(){
		User user = new User();
		user.setId(1);
		wrapper.getSession().setAttribute("user", user);

		Command command = new CreateBunchCommand();
		DAOFactory factory = DAOFactory.getInstance();
		BunchDAO bunchDAO = factory.getBunchDAO();
		List<Bunch> bunches = bunchDAO.getAllBunches(user);
		int oldSize = bunches.size();

		command.execute(wrapper);
		bunches = bunchDAO.getAllBunches(user);
		int newSize = bunches.size();

		System.out.println("Old size:" + oldSize);
		System.out.println("New size:" + newSize);
		Assert.assertEquals(oldSize+1, newSize);
	}

}
