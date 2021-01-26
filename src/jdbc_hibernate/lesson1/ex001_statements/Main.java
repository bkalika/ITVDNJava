package jdbc_hibernate.lesson1.ex001_statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        Statement statement = null;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.marks(id SERIAL PRIMARY KEY, mark TEXT)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.cars(id SERIAL, mark_id INTEGER, model TEXT, price REAL, PRIMARY KEY (id), FOREIGN KEY (mark_id) REFERENCES marks (id))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.clients(id SERIAL PRIMARY KEY, name TEXT, age INTEGER, phone INTEGER)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.orders(id SERIAL PRIMARY KEY, car_id INTEGER, client_id INTEGER, FOREIGN KEY(car_id) REFERENCES cars(id) ON DELETE CASCADE, FOREIGN KEY(client_id) REFERENCES clients(id) ON DELETE CASCADE)");

            statement.execute("INSERT INTO public.cars(mark_id, model, price) VALUES(2, '911 turboS', 65000)");
            int res = statement.executeUpdate("UPDATE public.clients SET age = age + 1 WHERE name = 'Ivan'");
            System.out.println(res);

            statement.addBatch("INSERT INTO public.cars(mark_id, model, price) VALUES (1, 'A6', 40000)");
            statement.addBatch("INSERT INTO public.cars(mark_id, model, price) VALUES (3, 'Cayenne turbo', 75000)");
            statement.addBatch("INSERT INTO public.cars(mark_id, model, price) VALUES (3, 'S7', 123000)");

            statement.executeBatch();

            boolean closed = statement.isClosed();
            System.out.println(closed);
    } catch (SQLException e){
            e.printStackTrace();
    } finally {
            try{
                connection.close();
                statement.close();
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
