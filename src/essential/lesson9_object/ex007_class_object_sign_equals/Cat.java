package essential.lesson9_object.ex007_class_object_sign_equals;

public class Cat {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Cat c1 = new Cat("Barsik");
        Cat c2 = c1;
        if (c1 == c2){
            System.out.println("Cat's equals");
        } else {
            System.out.println("They're not equals");
        }
    }
}
