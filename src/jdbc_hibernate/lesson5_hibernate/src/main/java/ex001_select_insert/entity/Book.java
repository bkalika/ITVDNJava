package ex001_select_insert.entity;

import javax.persistence.*;

@Entity
@Table(name="books", schema="public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_id_seq")
    @SequenceGenerator(name = "books_id_seq", sequenceName = "books_id_seq", allocationSize = 1)
    private long id;

    public String name;
    private long author_id;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getAuthor_id(){
        return author_id;
    }

    public void setAuthor_id(long author_id){
        this.author_id = author_id;
    }
}

