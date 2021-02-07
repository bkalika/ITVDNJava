package professional_renewed.lesson10_cloning.ex001_shallow.cloning;

public class Student implements Cloneable {
    public String name;
    public int age;
    public Group group;

    Student(){

    }

    public Student(String name, int age, Group group){
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String toString(){
        return "Student{" +
                "name = " + name + '\'' +
                "age = " + age + '\'' +
                "group = " + group + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
