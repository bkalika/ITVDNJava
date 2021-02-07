package jdbc_hibernate.lesson2_dao.simple_dao.dao;

import jdbc_hibernate.lesson2_dao.simple_dao.entity.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarJDBCDao implements CarDAO {

    @Override
    public void add(Car car) {
        Connection connection = null;

        connection = getConnection();
        PreparedStatement preparedStatement = null;
        Statement statement = null;

        try {
            int markId = getMarkId(car.getMark(), connection);

            if (markId == -1) {
                preparedStatement = connection.prepareStatement("INSERT INTO marks(mark) VALUES (?)");
                preparedStatement.setString(1, car.getMark());
                preparedStatement.execute();

                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT MAX(id) FROM marks");
                rs.next();
                markId = rs.getInt(1);
            }

            preparedStatement = connection.prepareStatement("INSERT INTO cars(mark_id, model, price) VALUES (?, ?, ?)");

            preparedStatement.setInt(1, markId);
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setDouble(3, car.getPrice());
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null && statement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                    statement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private int getMarkId(String markName, Connection connection) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT id FROM marks WHERE mark = ?");
            preparedStatement.setString(1, markName);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return -1;
    }

    @Override
    public List<Car> getAll() {
        List<Car> allCars = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("SELECT c.id, m.mark, c.model, c.price FROM cars c" +
                    " INNER JOIN marks m ON m.id=c.mark_id");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                long id = rs.getLong(1);
                String mark = rs.getString(2);
                String model = rs.getString(3);
                int price = rs.getInt(4);
                Car car = new Car();
                car.setId(id);
                car.setMark(mark);
                car.setModel(model);
                car.setPrice(price);
                allCars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return allCars;
    }

    @Override
    public Car getById(int id) {
        Connection connection;
        PreparedStatement preparedStatement = null;

        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement("SELECT m.mark, c.model, c.price FROM cars c" +
                    " INNER JOIN marks m ON m.id=c.mark_id WHERE c.id = ?");

            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()){
//                long carId = rs.getLong(1);
                String mark = rs.getString(1);
                String model = rs.getString(2);
                int price = rs.getInt(3);
                Car car = new Car();
                car.setId(id);
                car.setModel(model);
                car.setMark(mark);
                car.setPrice(price);
                return car;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
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
    public void updatePrice(int price, int carId) {
        Connection connection;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try {
            preparedStatement = connection.prepareStatement("UPDATE cars SET price = ? WHERE id = ?");

            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, carId);

            int updateValues = preparedStatement.executeUpdate();
            System.out.println("Values updated: " + updateValues);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
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
    public void remove(int id) {
        Connection connection;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try {
            preparedStatement = connection.prepareStatement("DELETE FROM cars WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            int deleteValues = preparedStatement.executeUpdate();
            System.out.println("Values deleted: " + deleteValues);

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
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
    public void remove(String mark) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try {
            int mark_id = getMarkId(mark, connection);
            preparedStatement = connection.prepareStatement("DELETE FROM cars WHERE mark_id = ?");
            preparedStatement.setInt(1, mark_id);

            int deletedValues = preparedStatement.executeUpdate();
            System.out.println("Values deleted: " + deletedValues);

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null){
                try{
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private Connection getConnection() {
        final String URL = "jdbc:postgresql://localhost:5432/itvdn_db";
        final String LOGIN = "postgres";
        final String PASSWORD = "postgres";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
