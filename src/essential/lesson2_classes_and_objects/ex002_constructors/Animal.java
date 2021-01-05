package essential.lesson2_classes_and_objects.ex002_constructors;

public class Animal {
    private int age;
    private int height;

    public Animal(int age, int height){
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(4, 2);

        System.out.println(animal.age);
    }
}
