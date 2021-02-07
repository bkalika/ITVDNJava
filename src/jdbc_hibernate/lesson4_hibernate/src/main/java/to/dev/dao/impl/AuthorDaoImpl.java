package to.dev.dao.impl;

import org.hibernate.HibernateException;
import to.dev.Author;
import to.dev.dao.AuthorDAO;

import java.util.List;

public class AuthorDaoImpl extends CommonDaoImpl implements AuthorDAO {

    public long createAuthor(Author author) throws HibernateException{
        return super.saveEntity(author);
    }

    public Author getAuthor(long id) throws HibernateException{
        return super.getEntity(id);
    }

    public List<Author> listAllAuthors() throws HibernateException{
        return super.getEntities();
    }
}
