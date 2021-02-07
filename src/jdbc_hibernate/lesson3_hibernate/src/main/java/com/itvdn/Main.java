package com.itvdn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setAge(10);
//        animal.setName("Milka");
//        animal.setTail(true);

        Client client = new Client();
        client.setName("Nazar");
            client.setAge(21);
        client.setPhone("105");

//        Configuration configuration = new Configuration();
        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
//        session.save(animal);
        session.save(client);
        session.getTransaction().commit();
        session.close();

    }
}
