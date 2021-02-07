package jdbc_hibernate.lesson2_dao.simple_dao.dao;

import jdbc_hibernate.lesson2_dao.simple_dao.entity.Car;

import java.util.List;

public interface CarDAO {
    void add(Car car);

    List<Car> getAll();

    Car getById(int id);

    void updatePrice(int price, int carId);

    void remove(int id);

    void remove(String mark);
}
