package ex002_filter.filters;

import ex002_filter.entities.User;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorizationFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException{
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{

        Map<String, User> userMap = new HashMap<String, User>();
        request.setAttribute("users", userMap);

        String login = request.getParameter("name");
        String password = request.getParameter("password");

        if((login == null && password == null) || (login.length() > 3)
                && password.length() > 5 && findExpression("[0-9]", password)){
            chain.doFilter(request, response);
        } else{
            request.getRequestDispatcher("ex002_error.jsp").forward(request, response);
        }

    }

    private boolean findExpression(String expression, String text){
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public void destroy(){
    }
}
