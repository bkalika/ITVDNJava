package essential.lesson9_object.ex002_class_object_methods;

public class Main {
    public static void main(String[] args){
        Car car = new Car(160, "blue");

        System.out.println(car.getClass());

        System.out.println(car);
    }
}
