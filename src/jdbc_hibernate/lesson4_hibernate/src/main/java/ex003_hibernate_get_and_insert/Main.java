package ex003_hibernate_get_and_insert;

import ex003_hibernate_get_and_insert.entity.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        List<Author> list = ah.getAuthorList();
//        System.out.println(author.getName());
        System.out.println(list);

//        author.setName("Shevchenko");
//        ah.addAuthor(author);
    }
}
