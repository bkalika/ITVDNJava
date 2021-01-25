package jdbc.lesson3;

import java.sql.*;

public class MultipleResults {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";
        Class.forName("org.postgresql.Driver");

        try(Connection conn = DriverManager.getConnection(url, userName, userPassword)){
            Statement callableStatement = null;
            try{
                callableStatement = conn.createStatement();
                boolean hasResults = callableStatement.execute("DO $$ BEGIN PERFORM 'public.tables_count'; END $$; ");
                System.out.println(hasResults);
                ResultSet resultSet = null;
                try{
                    while(hasResults){
                        resultSet = callableStatement.getResultSet();
                        System.out.println(resultSet);
                        while(resultSet.next()){
                            System.out.println("Count in tables: " + resultSet.getInt(1));
                        }
                        hasResults = callableStatement.getMoreResults();
                    }
                } catch (SQLException e){
                    e.printStackTrace();
                } finally {
                    if (resultSet != null){
                        resultSet.close();
                    } else {
                        System.err.println("DB read error");
                    }
                }
            } catch (SQLException e){
                e.printStackTrace();
            } finally {
                callableStatement.close();
            }
        }
  }
}
