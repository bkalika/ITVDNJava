package jdbc_hibernate.lesson1.ex005_get_all_from_dish;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";

    private static final String GET_ALL = "SELECT * FROM public.dish";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            preparedStatement = connection.prepareStatement(GET_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                double rating = resultSet.getDouble("rating");
                boolean published = resultSet.getBoolean("published");
                String date = resultSet.getString("created");
                byte[] bytes = resultSet.getBytes("icon");

                System.out.println(id + " " + title + "|" + description + "|" + rating + "|" + published + "|" + date + "|" + bytes);
            }
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
