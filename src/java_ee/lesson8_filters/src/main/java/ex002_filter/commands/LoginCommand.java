package ex002_filter.commands;

import ex002_filter.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginCommand implements Command {

    public String execute(HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        Map<String, User> userMap = (Map<String, User>) session.getAttribute("users");
        User user = userMap.get(name + "_" + password);
        session.setAttribute("user", user);
        return "ex002_main.jsp";
    }
}
