package essential.lesson7_anonymousClasses.ex001_anomymous_classes;

interface Interface1 {
    void method();
}

public class Main{
    public static void main(String[] args){
        // anonymous inner class
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };
        System.out.println(instance.getClass().toString());

        // call the object's method anonymous class
        instance.method();
    }
}
