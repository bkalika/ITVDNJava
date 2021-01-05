package essential.lesson3_inheritance.ex005_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        BaseClass newInstance = (BaseClass) instance;

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

        System.out.println("instance id: " + instance.hashCode());
        System.out.println("instance id: " + newInstance.hashCode());
    }
}
