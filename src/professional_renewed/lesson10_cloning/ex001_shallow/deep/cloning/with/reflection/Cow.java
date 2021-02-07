package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.reflection;

public class Cow {
    private String name;
    private int age;
    private int head;

    public Cow(){

    }

    public Cow(String name, int age, int head){
        this.name = name;
        this.age = age;
        this.head = head;
    }

    public String toString(){
        return "Cow: " +
                " name: " + name +
                ", age: " + age +
                ", head: " + head +
                '}';
    }
}
