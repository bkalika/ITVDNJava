package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.staticmethod;

public class Human {
    private int age;
    private String name;

    Human(){

    }

    public static Human getHumanInstanceWithAgeAndString(int age, String name){
        Human instance = new Human();
        instance.age = age;
        instance.name = name;
        return instance;
    }

    @Override
    public String toString(){
        return "Human{" +
                "age: " + age +
                " name: " + name +
                '}';
    }
}
