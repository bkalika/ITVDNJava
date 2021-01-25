package jdbc.lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";

        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection(url, userName, userPassword);
            BufferedReader sqlFile = new BufferedReader(new FileReader("E:\\JAVA\\ITVDNJava\\src\\jdbc\\lesson2\\books.sql"));
            Scanner scan = new Scanner(sqlFile);
            Statement statement = connection.createStatement()){

            String line = "";
            while (scan.hasNextLine()){
                line = scan.nextLine();
                if (line.endsWith(";")){
                    line = line.substring(0, line.length() - 1);
                }
                statement.executeUpdate(line);
            }
            ResultSet rs = null;
            try{
                rs = statement.executeQuery("SELECT * FROM public.books");
                while (rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double price = rs.getDouble(3);
                    System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
                }
            } catch (SQLException e){
                System.err.println("SQLException message: " + e.getMessage());
                System.err.println("SQLException SQL state: " + e.getSQLState());
                System.err.println("SQLException error code: " + e.getErrorCode());
            } finally {
                if (rs != null){
                    rs.close();
                } else {
                    System.err.println("Reading DB Error");
                }
            }
        }
    }
}
