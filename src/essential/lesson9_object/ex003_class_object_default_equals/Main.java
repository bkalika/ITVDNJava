package essential.lesson9_object.ex003_class_object_default_equals;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car(1);
        Car c1_2 = new Car(1);
        Car c2 = new Car(2);
        Car c3 = c1;

        System.out.println(c1.equals(c3));

        System.out.println(c1 == c2);

        System.out.println(c1 == c3);

        System.out.println(c1 == c1_2);

        System.out.println(c1.equals(c1_2));
    }
}
