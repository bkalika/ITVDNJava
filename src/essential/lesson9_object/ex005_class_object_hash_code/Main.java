package essential.lesson9_object.ex005_class_object_hash_code;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car(1);
        Car c2 = new Car(1);
        Car c3 = new Car(2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }

}
