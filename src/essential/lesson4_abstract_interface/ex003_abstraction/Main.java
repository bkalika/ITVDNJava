package essential.lesson4_abstract_interface.ex003_abstraction;

abstract class AbstractClassA {
    public abstract void operationA();
}

abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}

class ConcreteClass extends AbstractClassB{
    @Override
    public void operationA(){
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB(){
        System.out.println("ConcreteClass.operationB");
    }
}

public class Main {
    public static void main(String[] args){
        AbstractClassA instance = new ConcreteClass();

        instance.operationA();

//        instance.operationB(); // - not allowed, due to we create an instance with AbstractClassA, for call operationB
//        we have to create an instance with type AbstractClassB(), see below:;

        AbstractClassB instance2 = new ConcreteClass();
        instance2.operationB();
    }
}
