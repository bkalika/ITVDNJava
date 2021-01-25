package jdbc.lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";

        Class.forName("org.postgresql.Driver");

        try(Connection conn = DriverManager.getConnection(url, userName, userPassword)){
            System.out.println("Connection successful!");
        }
    }
}
