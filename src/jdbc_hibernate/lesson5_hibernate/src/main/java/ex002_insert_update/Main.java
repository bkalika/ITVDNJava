package ex002_insert_update;


import ex002_insert_update.entity.Author;

public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

//        Author newAuthor = new Author();
//        newAuthor.setName("Mickailo");
//        newAuthor.setLastName("Lozarchyk");
//        ah.addAuthor(newAuthor);

//        Author getAuthor = ah.getAuthorById(6);
//        getAuthor.setName("Denis");
//        getAuthor.setLastName("Shymilo");
        ah.addAuthor(null);
    }
}
