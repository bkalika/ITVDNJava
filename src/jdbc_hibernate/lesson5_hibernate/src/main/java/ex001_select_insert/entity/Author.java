package ex001_select_insert.entity;

import javax.persistence.*;

@Entity
@Table(name="authors", schema="public")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authors_id_seq")
    @SequenceGenerator(name = "authors_id_seq", sequenceName = "authors_id_seq", allocationSize = 1)
    private long id;

    private String name;

    public Author(String name){
        this.name = name;
    }

    public Author(){}

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
}
