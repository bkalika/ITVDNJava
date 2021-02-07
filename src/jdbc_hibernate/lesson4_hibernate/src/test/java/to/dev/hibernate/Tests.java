package to.dev.hibernate;

import org.junit.Test;
import to.dev.Author;
import to.dev.dao.AuthorDAO;
import to.dev.dao.impl.AuthorDaoImpl;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class Tests {
    private static final Logger logging = Logger.getLogger(Tests.class.getName());
    
    private AuthorDAO authorDAO;
    
    public Tests(){
        this.authorDAO = new AuthorDaoImpl();
    }
    
//    @Test
//    public void testInsertAuthor(){
//        Author author = new Author("New Author2");
//        Long id = (Long)authorDAO.createAuthor(author);
//        assertTrue(id instanceof Long);
//    }

//    @Test
//    public void testGetAuthor(){
//        Author author = authorDAO.getAuthor(2);
//        System.out.println(author.getName());
//        System.out.println(author.getId());
////        assertTrue(author instanceof Author);
//    }

    @Test
    public void testGetAuthorsList(){
        List<Author> authors = authorDAO.listAllAuthors();
        System.out.println(authors);
        for(Author author : authors){
            System.out.println(author.getName() + "" + author.getId());
        }
    }
}
