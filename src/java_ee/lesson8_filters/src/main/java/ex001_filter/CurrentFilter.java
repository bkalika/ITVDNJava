package ex001_filter;

import javax.servlet.*;
import java.io.IOException;

public class CurrentFilter implements Filter {

    private boolean status;

    public void init(FilterConfig filterConfig) throws ServletException{
        status = Boolean.parseBoolean(filterConfig.getInitParameter("status"));
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        request.setAttribute("status", status);
        chain.doFilter(request, response);
    }

    public void destroy(){

    }
}
