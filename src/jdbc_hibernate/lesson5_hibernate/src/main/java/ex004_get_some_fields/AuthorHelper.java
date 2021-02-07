package ex004_get_some_fields;

import ex004_get_some_fields.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;

public class AuthorHelper {
    private SessionFactory sessionFactory;

    public AuthorHelper(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList(){
        Session session = sessionFactory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery cq = cb.createQuery(Author.class);

        Root<Author> root = cq.from(Author.class);

        Selection[] selections = {root.get("id"), root.get("lastName")};

        cq.select(cb.construct(Author.class, selections));

        Query query = session.createQuery(cq);

        List<Author> authorList = query.getResultList();

        session.close();
        return authorList;
    }

    public Author addAuthor(Author author){
        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Author author1 = session.get(Author.class, 2L);
//        author1.setName("Alexandr");
//        author1.setLastName("Borodach");
//        session.save(author);
        
        session.save(author);
        session.getTransaction().commit();
        session.close();
        return author ;
    }

    public Author getAuthorById(long id){
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id);
        session.close();
        return author;
    }
}
