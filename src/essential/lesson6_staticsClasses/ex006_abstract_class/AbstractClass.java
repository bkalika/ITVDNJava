package essential.lesson6_staticsClasses.ex006_abstract_class;

public abstract class AbstractClass {
    public static AbstractClass CreateObject(){
        return new ConcreteClass();
    }

    public abstract void method();
}
