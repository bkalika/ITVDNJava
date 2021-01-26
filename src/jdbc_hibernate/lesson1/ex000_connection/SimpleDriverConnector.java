package jdbc_hibernate.lesson1.ex000_connection;

public class SimpleDriverConnector {
    public static void main(String[] args) {
        try{

        Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded success!");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
