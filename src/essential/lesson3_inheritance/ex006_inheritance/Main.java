package essential.lesson3_inheritance.ex006_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        // upCast
        BaseClass instanceUp = instance;
        instanceUp.method();

        // DownCase
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
