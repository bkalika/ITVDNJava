package ex002_filter.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutCommand implements Command {
    public String execute(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "ex002_main.jsp";
    }
}
