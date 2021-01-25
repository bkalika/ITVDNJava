package jdbc.lesson4;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/itvdn_db";
        String userName = "postgres";
        String userPassword = "postgres";
        Class.forName("org.postgresql.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, userPassword);
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            ResultSet rs = null;
            try {
                rs = statement.executeQuery("SELECT * FROM public.books");
//                while (rs.next()) {
//                    int id = rs.getInt(1);
//                    double price = rs.getDouble(3);
//                    if (id == 4) {
//                        rs.updateString("name", "Spartacus (discount)");
//                        rs.updateDouble(3, price - 10);
//                        rs.updateRow();
//                    }
//                }
                if(rs.absolute(2)){
                    System.out.println(rs.getString("name"));
                }
                if(rs.previous()){
                    System.out.println(rs.getString("name"));
                }
                if(rs.last()){
                    System.out.println(rs.getString("name"));
                }
                if(rs.relative(-3)){
                    ResultSetMetaData rsmd = rs.getMetaData();
                    while(rs.next()){
                        for(int i = 1; i <= rsmd.getColumnCount(); ++i){
                            String field = rsmd.getColumnName(i);
                            String value = rs.getString(field);
                            System.out.print(field + ": " + value + ", ");
                        }
                        System.out.println("");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (rs != null)
                    rs.close();
                else
                    System.err.println("DB read error");
            }
        }
    }
}
