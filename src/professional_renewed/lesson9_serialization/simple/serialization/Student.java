package professional_renewed.lesson9_serialization.simple.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String name;

    public Student(){

    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }
}
