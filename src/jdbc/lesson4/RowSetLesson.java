package jdbc.lesson4;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class RowSetLesson {
    static String url = "jdbc:postgresql://localhost:5432/itvdn_db";
    static String userName = "postgres";
    static String userPassword = "postgres";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = getResSet();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        CachedRowSet rowSet = (CachedRowSet) resultSet;
        rowSet.setCommand("SELECT * FROM public.books WHERE price > ?");
        rowSet.setDouble(1, 30);

        rowSet.setUrl(url);
        rowSet.setUsername(userName);
        rowSet.setPassword(userPassword);
        rowSet.execute();

        System.out.println("===========");

        rowSet.absolute(2);
        rowSet.deleteRow();
        rowSet.beforeFirst();
        Connection connection = DriverManager.getConnection(url, userName, userPassword);
        connection.setAutoCommit(false);
        rowSet.acceptChanges(connection);

        while(rowSet.next()){
            String name = rowSet.getString("name");
            double price = rowSet.getDouble(3);
            System.out.println(name + ": " + price);
        }
    }

    static ResultSet getResSet() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        try(Connection conn = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = conn.createStatement()){
            ResultSet rs = statement.executeQuery("SELECT * FROM public.books");
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            return crs;
        }
    }
}
