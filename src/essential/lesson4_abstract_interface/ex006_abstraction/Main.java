package essential.lesson4_abstract_interface.ex006_abstraction;

abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("1 AbstractClass()");  // 1

        this.abstractMethod();

        System.out.println("2 AbstractClass()"); // 3
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass{
    String s = "FIRST";

    public ConcreteClass(){
        System.out.println("3 ConcreteClass()"); // 4
        s = "SECOND";
    }

    @Override
    public void abstractMethod(){
        System.out.println("Realizaciya methoda abstractMethod() v ConcreteClass " + s); // 2 and 6
    }
}

public class Main {
    public static void main(String[] args){
        AbstractClass instance = new ConcreteClass();

        System.out.println("-----------------------"); // 5

        instance.abstractMethod();
    }
}
