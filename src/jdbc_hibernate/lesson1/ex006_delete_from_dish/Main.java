package jdbc_hibernate.lesson1.ex006_delete_from_dish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";

    private static final String DELETE = "DELETE FROM public.dish WHERE id = ? AND title = ?";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            preparedStatement = connection.prepareStatement(DELETE);

            preparedStatement.setString(2, "Title");
            preparedStatement.setInt(1, 1);

            int res = preparedStatement.executeUpdate();
            System.out.println(res);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                connection.close();
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
