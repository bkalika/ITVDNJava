package lesson4.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {

//    public void simpleMethod(){
//        System.out.println("ConcreteDerivedClass.simpleMethod();");
//    }

    @Override
    public void abstractMethod(){
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
