/**
 * 
 */
package main.java.ex004_bean_session;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author bkalika
 *
 */

@Named
//@RequestScoped
@SessionScoped
//@ApplicationScoped
public class ExampleBeanSession implements Serializable{

	private boolean logged;
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isLogged() {
		return logged;
	}
	
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
	
	public void doLogin() {
		logged = true;
		System.out.println("Logged: " + logged + " User: " + login + " Password: " + password);
	}
}
