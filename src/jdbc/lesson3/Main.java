package jdbc.lesson3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";
        Class.forName("org.postgresql.Driver");

        try(Connection conn = DriverManager.getConnection(url, userName, userPassword)){
            PreparedStatement preparedStatement = null;
            try{
                preparedStatement = conn.prepareStatement("INSERT INTO public.books (name, price) VALUES (?, ?)");
                preparedStatement.setString(1, "Schindler's list");
                preparedStatement.setDouble(2, 32.5);
                preparedStatement.execute();
                preparedStatement.close();

                ResultSet rs = null;
                Statement statement = conn.createStatement();
                try{
                    rs = statement.executeQuery("SELECT * FROM public.books");
                    System.out.println(rs);
                    while(rs.next()){
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        double price = rs.getDouble(3);
                        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
                    }
                } catch (SQLException e){
                    e.printStackTrace();
                } finally {
                    if(rs != null){
                        rs.close();
                    } else {
                        System.err.println("DB reading error");
                    }
                }
            } catch (SQLException ex){
                ex.printStackTrace();
            } finally {
                preparedStatement.close();
            }

            CallableStatement callStat = null;
            try{
                callStat = conn.prepareCall("{call public.count_books(?)}");
                            /* HOW TO CREATE A STORED PROCEDURE IN POSTRESQL:
                                CREATE OR REPLACE FUNCTION count_books(
                                        OUT books_count bigint)
                                RETURNS bigint AS
                                        $BODY$
                                BEGIN
                                SELECT COUNT(*) INTO books_count
                                FROM public.books;
                                END;
                                $BODY$
                                LANGUAGE plpgsql; */

                callStat.registerOutParameter(1, Types.BIGINT);
                callStat.execute();
                System.out.println("Count books in the table books: " + callStat.getObject(1));
            } catch (SQLException e){
                e.printStackTrace();
            } finally {
                callStat.close();
            }
        }
    }
}
