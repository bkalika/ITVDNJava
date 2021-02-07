package ex001_select_insert;

import ex001_select_insert.entity.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        Author newAuthor = new Author("Taras");
        
        ah.addAuthor(newAuthor);

//        List<Author> authorList = ah.getAuthorList();
//
//        for(Author author : authorList){
//            System.out.println(author.getId() + " " + author.getName());
//            }

        Author getAuthor = ah.getAuthorById(8);
        System.out.println(getAuthor.getId() + " " + getAuthor.getName());
    }
}
