package jdbc_hibernate.lesson2_dao.simple_dao.dao;

import jdbc_hibernate.lesson2_dao.simple_dao.entity.Client;

import java.util.List;

public interface ClientDAO {
    void add(Client client);

    List<Client> getAll();

    Client getById(int id);

    void updatePhone(String phone, int clientId);

    void remove(int id);

    void remove(String phone);
}
