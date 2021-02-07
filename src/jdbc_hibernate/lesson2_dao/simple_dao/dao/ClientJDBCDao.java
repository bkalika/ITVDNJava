package jdbc_hibernate.lesson2_dao.simple_dao.dao;

import jdbc_hibernate.lesson2_dao.simple_dao.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientJDBCDao implements ClientDAO {

    @Override
    public void add(Client client){
        Connection connection = null;
        connection = getConnection();

        PreparedStatement preparedStatement = null;


        try{
            preparedStatement = connection.prepareStatement("INSERT INTO public.clients(name, age, phone) VALUES (?, ?, ?)");

            preparedStatement.setString(1, client.getName());
            preparedStatement.setInt(2, client.getAge());
            preparedStatement.setString(3, client.getPhone());
            preparedStatement.execute();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public List<Client> getAll(){

        List<Client> allClients = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM public.clients");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                long id = rs.getLong(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String phone = rs.getString(4);
                Client client = new Client();
                client.setId(id);
                client.setName(name);
                client.setAge(age);
                client.setPhone(phone);
                allClients.add(client);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return allClients;
    }

    @Override
    public Client getById(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try{
            preparedStatement = connection.prepareStatement("SELECT * FROM public.clients WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()){
                int clientId = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String phone = rs.getString(4);
                Client client = new Client();
                client.setId(clientId);
                client.setName(name);
                client.setAge(age);
                client.setPhone(phone);
                return client;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    @Override
    public void updatePhone(String phone, int clientId){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try{
            preparedStatement = connection.prepareStatement("UPDATE public.clients SET phone = ? WHERE id = ?");
            preparedStatement.setString(1, phone);
            preparedStatement.setInt(2, clientId);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void remove(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try{
            preparedStatement = connection.prepareStatement("DELETE FROM public.clients WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null && preparedStatement != null){
                try {
                    preparedStatement.close();
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void remove(String phone){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try{
            preparedStatement = connection.prepareStatement("DELETE FROM public.clients WHERE phone = ?");
            preparedStatement.setString(1, phone);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if(connection != null && preparedStatement != null){
                    connection.close();
                    preparedStatement.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    private Connection getConnection(){
        final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
        final String LOGIN = "postgres";
        final String PASSWORD = "postgres";

        Connection connection  = null;

        try{
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            return connection;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
