package to.dev.dao.impl;

import org.hibernate.*;
import org.hibernate.query.NativeQuery;
import to.dev.Author;
import to.dev.HibernateConfig;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CommonDaoImpl {
    private SessionFactory sessionFactory;
    private Session session;
    
    public CommonDaoImpl(){
        this.sessionFactory = HibernateConfig.getSessionFactory();
        this.session = sessionFactory.getCurrentSession();
    }
    
    protected long saveEntity(Object obj) throws HibernateException{
        Transaction transaction  = session.beginTransaction();
        long id = (Long) session.save(obj);
        transaction.commit();
        return id;
    }
    
    protected Author getEntity(long id) throws HibernateException{
        Transaction transaction = session.beginTransaction();
        Author author = session.get(Author.class, id);
        transaction.commit();
        return author;
    }

    protected List<Author> getEntities() throws HibernateException{
        Transaction transaction = session.beginTransaction();

//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<Author> criteriaQuery = criteriaBuilder.createQuery(Author.class);
//        Root<Author> root = criteriaQuery.from(Author.class);
//        criteriaQuery.select(criteriaBuilder.construct(Author.class));
////        System.out.println(criteriaQuery.distinct(true));
////        List<Author> authorsList = session.createQuery(criteriaQuery).getResultList();
//        List<Author> authorsList = session.createQuery("from authors", Author.class).getResultList();
//        List<Author> authorsList = session.createQuery("SELECT id, name FROM authors a").getResultList();
//        transaction.();

        NativeQuery cb = session.createNativeQuery("SELECT * FROM public.authors");
        List<Author> authorsList = cb.list();
        System.out.println("al: " + authorsList);
        transaction.commit();
        return authorsList;

    }
}
