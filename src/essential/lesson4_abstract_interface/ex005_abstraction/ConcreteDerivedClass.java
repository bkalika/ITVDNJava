package essential.lesson4_abstract_interface.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {

//    public void simpleMethod(){
//        System.out.println("ConcreteDerivedClass.simpleMethod();");
//    }

    @Override
    public void abstractMethod(){
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
