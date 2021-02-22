import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

public class RequestWrapper extends AbstractRequestWrapper {
	
	private Map<String, String> params = new HashMap<String, String>();
	private HttpSession session = new SessionWrapper();
	
	public void addParam(String key, String value) {
		params.put(key, value);
	}

	public HttpSession getSession() {
		// TODO Auto-generated method stub
		return session;
	}

	public String getParameter(String s) {
		// TODO Auto-generated method stub
		return params.get(s);
	}
	
}
