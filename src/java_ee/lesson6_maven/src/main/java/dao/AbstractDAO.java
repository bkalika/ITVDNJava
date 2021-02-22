package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDAO implements InterfaceDAO{
	
	final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    final String LOGIN = "postgres";
    final String PASSWORD = "postgres";
    
    public Connection getConnection() throws SQLException{
    	return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

}
