package ex001_jpa_crud;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Embeddable
@Table(name="clients", schema="public")
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clients_id_seq")
    @SequenceGenerator(name = "clients_id_seq", sequenceName = "clients_id_seq", allocationSize = 1)
    private int id;

    @Column 
    private String name;

    @Column
    private int age;

    @Column
    private String phone;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}

