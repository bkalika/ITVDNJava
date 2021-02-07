package ex002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        ClientDetails details = new ClientDetails();

        details.setAge(20);
        details.setName("Taras");
        details.setPhone("2233");

        SessionFactory factory = new Configuration()
                .configure("/src/test/hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(details);
        session.getTransaction().commit();
        session.close();
    }
}
