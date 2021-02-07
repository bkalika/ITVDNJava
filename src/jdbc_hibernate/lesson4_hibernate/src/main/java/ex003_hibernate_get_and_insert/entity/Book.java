package ex003_hibernate_get_and_insert.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authors_id_seq")
    @SequenceGenerator(name = "authors_id_seq", sequenceName = "authors_id_seq", allocationSize = 1)
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
