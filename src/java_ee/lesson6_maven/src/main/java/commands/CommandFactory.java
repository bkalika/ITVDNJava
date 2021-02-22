package commands;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {
	
	private static CommandFactory factory = new CommandFactory();
	
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	private CommandFactory() {
		
	}
	
	public static CommandFactory commandFactory() {
		if(factory == null) {
			factory = new CommandFactory();
		}
		return factory;
	}
	
	{
		commands.put("register", new RegisterCommand());
		commands.put("logout", new LogoutCommand());
		commands.put("main", new MainCommand());
		commands.put("create_new_bunch", new CreateBunchCommand());
		commands.put("login", new LoginCommand());
		commands.put("add_to_bunch", new AddToBunchCommand());
		commands.put("add_flower", new AddFlowerToBunchCommand());
		commands.put("bunch_flowers", new BunchFlowersCommand());
		commands.put("remove_flower", new RemoveFlowerCommand());
	}
	
	public Command getCommand(HttpServletRequest request) {
		String action = request.getParameter("action");
		Command command = commands.get(action);
		return command;
	}

}
