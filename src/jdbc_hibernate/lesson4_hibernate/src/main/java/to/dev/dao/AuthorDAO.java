package to.dev.dao;

import org.hibernate.HibernateException;
import to.dev.Author;

import java.util.List;

public interface AuthorDAO {
    long createAuthor(Author author) throws HibernateException;
    Author getAuthor(long id) throws HibernateException;
    List<Author> listAllAuthors() throws HibernateException;
}
