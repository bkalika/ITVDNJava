package essential.lesson9_object.ex006_class_object_hash_code_overriden;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car("1", 12, 1.8F);
        Car c2 = new Car("2", 21, 1.5F);
        Car c3 = new Car("3", 10, 1.3F);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}
