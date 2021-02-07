package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.serialization;

import java.io.Serializable;

public class Cow implements Serializable {
    private String name;
    private int age;
    private int weight;

    public Cow(){

    }

    public Cow(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String toString(){
        return "Cow: " +
                " name: " + name +
                ", age: " + age +
                ", head: " + weight +
                '}';
    }
}

