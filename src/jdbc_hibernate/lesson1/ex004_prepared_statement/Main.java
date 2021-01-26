package jdbc_hibernate.lesson1.ex004_prepared_statement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";

    private static final String INSERT_NEW = "INSERT INTO dish(title, description, rating, published, created, icon)"
            + " VALUES(?, ?, ?, ?, ?,  ?)";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.dish(id SERIAL PRIMARY KEY, title CHAR(45), description CHAR(45), rating REAL, published BOOLEAN, created CHAR(29) /*TIMESTAMP with time zone*/, icon BYTEA)");

            preparedStatement = connection.prepareStatement(INSERT_NEW);

            preparedStatement.setString(1, "Title");
            preparedStatement.setString(2, "Description");
            preparedStatement.setDouble(3, 4.5);
            preparedStatement.setBoolean(4, false);

            Date date = new Date();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSSSSSX");
            System.out.println(formatter.format(date));
            preparedStatement.setString(5, formatter.format(date));

            File file = new File("E:\\JAVA\\ITVDNJava\\src\\jdbc_hibernate\\lesson1\\ex004_prepared_statement\\BOD-0009.jpg");
            FileInputStream fis = new FileInputStream(file);
            preparedStatement.setBinaryStream(6, fis, file.length());

            preparedStatement.execute();

        } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try{
                connection.close();
                statement.close();
                preparedStatement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    private static void registerDriver(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
