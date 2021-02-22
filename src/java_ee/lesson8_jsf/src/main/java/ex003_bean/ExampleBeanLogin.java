/**
 * 
 */
package main.java.ex003_bean;

import javax.inject.Named;

/**
 * @author bogda
 *
 */

@Named
public class ExampleBeanLogin {

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
