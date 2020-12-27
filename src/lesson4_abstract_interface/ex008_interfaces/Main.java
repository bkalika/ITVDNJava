package lesson4_abstract_interface.ex008_interfaces;

public class Main {
    public static void main(String[] args){
        Interface1 instance1 = new DerivedClass();
        Interface2 instance2 = new DerivedClass();

        instance1.method1();

        instance2.method2();
    }
}
