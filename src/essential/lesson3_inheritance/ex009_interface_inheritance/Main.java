package essential.lesson3_inheritance.ex009_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();

        //UpCast
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();

        // UpCast
        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();

        // UpCast
        SomeInterface3 instanceUp3 = instance;
        instanceUp3.method3();

        // DownCast
        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();
    }
}
