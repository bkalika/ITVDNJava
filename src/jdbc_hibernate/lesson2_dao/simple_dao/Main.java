package jdbc_hibernate.lesson2_dao.simple_dao;

import jdbc_hibernate.lesson2_dao.simple_dao.dao.CarDAO;
import jdbc_hibernate.lesson2_dao.simple_dao.dao.ClientDAO;
import jdbc_hibernate.lesson2_dao.simple_dao.dao.DAOFactory;
import jdbc_hibernate.lesson2_dao.simple_dao.dao.IDAOFactory;
import jdbc_hibernate.lesson2_dao.simple_dao.entity.Car;
import jdbc_hibernate.lesson2_dao.simple_dao.entity.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();
        CarDAO carDAO = factory.getCarDAO();
        ClientDAO clientDAO = factory.getClientDAO();

        // CARS:
        Car car = new Car();

        car.setMark("Mazda");
        car.setModel("RX");
        car.setPrice(25000);
        carDAO.add(car);

        System.out.println("GET ALL CARS: ");
        List<Car> cars = carDAO.getAll();

        for(Car c : cars){
            System.out.println(c.getId() + " " + c.getMark()
            + " " + c.getModel() + " " + c.getPrice());
        }
        System.out.println("GET BY ID:");

        Car car3 = carDAO.getById(6);
        System.out.println(car3.getId() + " " + car3.getMark()
                + " " + car3.getModel() + " " + car3.getPrice());

        System.out.println("UPDATE:");

        carDAO.updatePrice(24000, 11);

        System.out.println("REMOVE:");
        carDAO.remove(14);

        System.out.println("REMOVE BY MARK NAME:");
        carDAO.remove("Super");


        // CLIENTS:
        System.out.println("========CLIENTS=======");

        Client client = new Client();
        client.setName("Pavlo");
        client.setAge(15);
        client.setPhone("0674992133");
        clientDAO.add(client);

        List<Client> clients = clientDAO.getAll();

        System.out.println("GET ALL CLIENTS:");
        for(Client cl : clients){
            System.out.println(cl.getId() + " " + cl.getName() + " " + cl.getAge() + " " + cl.getPhone());
        }

        Client client2 = clientDAO.getById(4);
        System.out.println(client2.getId() + " " + client2.getName() + " " + client2.getAge() + " " + client2.getPhone());

        clientDAO.updatePhone("0965438812", 1);

        clientDAO.remove(1);
        clientDAO.remove("0674992133");

    }
}
