package ex004_get_some_fields;

import ex004_get_some_fields.entity.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        List<Author> authors = ah.getAuthorList();

        for(Author author : authors){
            System.out.println(author.getId() + " " + author.getName() + " " + author.getLastName());
        }
    }
}
