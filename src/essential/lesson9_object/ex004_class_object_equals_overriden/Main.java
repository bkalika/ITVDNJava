package essential.lesson9_object.ex004_class_object_equals_overriden;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car(2);
        Car c2 = new Car(2);
        Car c3 = c1;

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
