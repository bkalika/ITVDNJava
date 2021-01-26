package jdbc_hibernate.lesson1.ex003_result_set;

public class Client {
    private int id;
    private int age;
    private String name;
    private String phone;

    public Client(int id, int age, String name, String phone){
        this.id = id;
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public int getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }
}
