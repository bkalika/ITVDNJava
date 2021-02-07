package ex003_hibernate_get_and_insert;

import ex003_hibernate_get_and_insert.entity.Author;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

public class AuthorHelper {
    private SessionFactory sessionFactory;

    public AuthorHelper(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList(){
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Author> criteria = builder.createQuery(Author.class);
        System.out.println(criteria);

        Root<Author> root = criteria.from(Author.class);
        criteria.select(builder.construct(Author.class));
        List<Author> authorList = session.createQuery(criteria).getResultList();
        session.close();
        return authorList;
    }

    public Author getAuthorById(long id){
        Session session = sessionFactory.openSession();
        Author author = (Author) session.get(Author.class, id);
        session.close();
        return author;
    }

    public Author addAuthor(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);

        session.getTransaction().commit();
        session.close();
        return author;

    }
}
