package essential.lesson4_abstract_interface.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    @Override
    public void overriddenMethod(){
        System.out.println("DerivedClass.overriddenMethod();");
    }

    @Override
    public void abstractMethod(){
        System.out.println("DerivedClass.abstractMethod();");
    }
}
