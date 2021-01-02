package essential.lesson4_abstract_interface.ex008_interfaces;

public class DerivedClass implements Interface1, Interface2 {
    public void method1(){
        System.out.println("Realization of the method1() from Interface1");
    }

    public void method2(){
        System.out.println("Realization of the method2() from Interface2");
    }
}
