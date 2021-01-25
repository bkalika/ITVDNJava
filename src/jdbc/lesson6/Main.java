package jdbc.lesson6;

import java.sql.*;

public class Main {
    static String url = "jdbc:postgresql://localhost:5432/itvdn_db";
    static String userName = "postgres";
    static String userPassword = "postgres";

    public static void main(String[] args) throws SQLException, InterruptedException {
        try(Connection connection = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = connection.createStatement()){

            connection.setAutoCommit(false);
//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
//            statement.executeUpdate("UPDATE public.books SET price = 100.6 WHERE id = 1");
//            new OtherTransaction().start();
//            Thread.sleep(2000);
//            connection.rollback();

//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.books");
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name") + " " + resultSet.getDouble(3));
//            }
//            new OtherTransaction().start();
//            Thread.sleep(2000);
//
//            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM public.books");
//            while(resultSet2.next()){
//                System.out.println(resultSet2.getString("name") + " " + resultSet2.getDouble(3));
//            }

//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.books WHERE id > 4");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name") + " " + resultSet.getDouble(3));
            }
            new OtherTransaction().start();
            Thread.sleep(2000);

            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM public.books WHERE id > 4");
            while(resultSet2.next()){
                System.out.println(resultSet2.getString("name") + " " + resultSet2.getDouble(3));
            }
        }

    }

    static class OtherTransaction extends Thread{
        @Override
        public void run(){
            try(Connection connection = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = connection.createStatement()){
            connection.setAutoCommit(false);
//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
//                ResultSet rs = statement.executeQuery("SELECT * FROM public.books");
//                while (rs.next()){
//                    System.out.println(rs.getString("name") + " " + rs.getDouble(3));
//                }

//                connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
//                connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
//                statement.executeUpdate("UPDATE public.books SET price = price + 20 WHERE name = 'Solomon key' ");
//                connection.commit();

//                connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
                connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
                statement.executeUpdate("INSERT INTO public.books (name, price) VALUES ('New book', 0)");
                connection.commit();
        } catch (SQLException e){
                e.printStackTrace();
        }
    }
    }
}
