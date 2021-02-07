package ex004_get_some_fields.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authors_id_seq")
    @SequenceGenerator(name = "authors_id_seq", sequenceName = "authors_id_seq", allocationSize = 1)
    private long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    public Author(){}
    
    public Author(long id){
        this.id = id;
    }

    public Author(String name){
        this.name = name;
    }

    public Author(long id, String lastName){
        this.id = id;
        this.lastName = lastName;
    }

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

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
