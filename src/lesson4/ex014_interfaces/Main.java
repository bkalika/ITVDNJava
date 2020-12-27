package lesson4.ex014_interfaces;

interface Interface{
    void method();
}

class BaseClass{
    public void method(){
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface{
    // realization of the interface is unrequired, due to
    // sigratures of methods in the class and in the interface equals
}

public class Main {
    public static void main(String[] args){
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance1.method();
    }
}
