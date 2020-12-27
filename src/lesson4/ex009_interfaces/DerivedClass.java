package lesson4.ex009_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    public void method1(){
        System.out.println("Realization of the method1() from Interface1.");
    }

    public void method2(){
        System.out.println("Realization of the method2() from Interface2.");
    }
}
