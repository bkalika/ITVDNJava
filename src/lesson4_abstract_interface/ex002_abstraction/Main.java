package lesson4_abstract_interface.ex002_abstraction;


class ConcreteClassA{
    public void operation(){
        System.out.println("ConcreteClassA.operation");
    }
}

abstract class AbstractClass extends ConcreteClassA{
    public abstract void method();
}

class ConcreteClassB extends AbstractClass{
    @Override
    public void method(){
        System.out.println("ConcreteClassB.method");
    }
}

public class Main {
    public static void main(String[] args){
        AbstractClass instance = new ConcreteClassB();

        instance.method();
        instance.operation();
    }
}
