package ex001_jpa_crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClientRepository {

    EntityManagerFactory emf;
    EntityManager em;

    public ClientRepository(){
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public Client getById(int id){
        if(!em.isOpen()){
            emf = Persistence.createEntityManagerFactory("mohr");
            em = emf.createEntityManager();
        }
        em.getTransaction().begin();
        Client client = em.find(Client.class, id);
        em.getTransaction().commit();
        emf.close();
        return client;
    }

    public void add(Client c){
        if(!em.isOpen()){
            emf = Persistence.createEntityManagerFactory("mohr");
            em = emf.createEntityManager();
        }
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        emf.close();
    }

    public void remove(Client c){
        if(!em.isOpen()){
            emf = Persistence.createEntityManagerFactory("mohr");
            em = emf.createEntityManager();
        }
        em.getTransaction().begin();
        em.remove(em.merge(c));
        em.getTransaction().commit();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    public List<Client> getAll(){
        List<Client> clients = null;
        if(!em.isOpen()){
            emf = Persistence.createEntityManagerFactory("mohr");
            em = emf.createEntityManager();
        }

        try {
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT clients FROM Client clients");
            clients = query.getResultList();
            em.getTransaction().commit();
            emf.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return clients;
    }
}
