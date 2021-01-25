package jdbc.lesson5;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";
        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = connection.createStatement()){

            String createTable = "CREATE TABLE fruits (id SERIAL, name VARCHAR(25) NOT NULL, amount BIGINT, price REAL NOT NULL, CONSTRAINT fruits_pkey PRIMARY KEY (id))";
            String command1 = "INSERT INTO fruits (name, amount, price) VALUES ('Apple', 500, 15.5)";
            String command2 = "INSERT INTO fruits (name, amount, price) VALUES ('Banana', 25, 25.5)";
            String command3 = "INSERT INTO fruits (name, amount, price) VALUES ('Peach', 200, 25.5)";
            String command4 = "INSERT INTO fruits (name, amount, price) VALUES ('Lemon', 20, 35.5)";

//            connection.setAutoCommit(false);
//            statement.executeUpdate(createTable);
//            statement.executeUpdate(command1);
//            Savepoint spt = connection.setSavepoint();
//            statement.executeUpdate(command2);
//            statement.executeUpdate(command3);
//            statement.executeUpdate(command4);
////            connection.commit();
//            connection.rollback(spt);
//            connection.commit();
////            connection.releaseSavepoint(spt); // doesn't work in PostgreSQL

            // Group commit:
            connection.setAutoCommit(true);
            statement.addBatch(createTable);
            statement.addBatch(command1);
            statement.addBatch(command2);
            statement.addBatch(command3);
            statement.addBatch(command4);
            statement.executeBatch();
        }
    }
}
