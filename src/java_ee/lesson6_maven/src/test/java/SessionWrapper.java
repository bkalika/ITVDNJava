import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

public class SessionWrapper extends AbstractSessionWrapper {
	
	private Map<String, Object> values = new HashMap<String, Object>();

	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return values.get(name);
	}

	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		values.put(name, value);
	}

	public void removeAttribute(String name) {
		// TODO Auto-generated method stub
		values.remove(name);
	}

}
