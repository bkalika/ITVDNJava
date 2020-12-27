package lesson4_abstract_interface.ex012_interfaces;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface{
    public void method(){
        System.out.println("Method - realization of the interface in abstract class");
    }
}

class ConcreteClass extends AbstractClass{
}

public class Main {
    public static void main(String[] args){
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
