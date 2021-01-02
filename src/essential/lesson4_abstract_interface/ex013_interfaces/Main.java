package essential.lesson4_abstract_interface.ex013_interfaces;

interface Interface{
    void method();
}

abstract class AbstractClass implements Interface{
    public abstract void method();
}

class ConcreteClass extends AbstractClass{
    public void method() {
        System.out.println("Method - realization of the interface in abstract class.");
    }
}

public class Main {
    public static void main(String[] args){
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
