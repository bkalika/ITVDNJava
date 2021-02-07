package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.constructor;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    // copy constuctor
    public Student(Student other){
        this(other.age, other.name);
    }

    @Override
    public String toString(){
        return "Student:" +
                " age: " + age +
                " name: " + name;
    }
}
