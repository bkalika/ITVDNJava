package jdbc_hibernate.lesson2_dao.simple_dao.dao;

public interface IDAOFactory {
    CarDAO getCarDAO();

    ClientDAO getClientDAO();
}
