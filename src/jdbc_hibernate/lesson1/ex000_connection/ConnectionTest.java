package jdbc_hibernate.lesson1.ex000_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
        private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
        private static final String LOGIN = "postgres";
        private static final String PASSWORD = "postgres";

    public static void main(String[] args) {

        Connection connection;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

            if(!connection.isClosed()){
                System.out.println("Correct connection to db!");
            }

            connection.close();

            if(connection.isClosed()){
                System.out.println("Connection closed:(.");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
