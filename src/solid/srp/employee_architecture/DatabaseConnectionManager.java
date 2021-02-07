package solid.srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";

    private Connection connection;

    private static DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){

    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

    private Connection getConnection(){
        return connection;
    }

    private void disconnect() throws SQLException{
        connection.close();
        System.out.println("Database disconnected");
    }
}
