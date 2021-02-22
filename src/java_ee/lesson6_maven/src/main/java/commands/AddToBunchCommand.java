package commands;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dao.DAOFactory;
import dao.FlowerDAO;
import entity.Flower;

public class AddToBunchCommand implements Command{
	public String execute(HttpServletRequest request) {
		System.out.println("aaaaa: " + request.getParameter("id"));
		long bunchId = Long.valueOf(request.getParameter("id"));
		DAOFactory factory = DAOFactory.getInstance();
		FlowerDAO flowerDAO = factory.getFlowerDAO();
		List<Flower> flowers = flowerDAO.getAll();
		request.setAttribute("id", bunchId);
		request.setAttribute("flowers", flowers);
		return "add_flowers.jsp";
	}

}
