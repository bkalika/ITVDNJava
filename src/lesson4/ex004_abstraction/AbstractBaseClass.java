package lesson4.ex004_abstraction;

public abstract class AbstractBaseClass {
    public void simpleMethod(){
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    public void overriddenMethod(){
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    abstract public void abstractMethod();
}
