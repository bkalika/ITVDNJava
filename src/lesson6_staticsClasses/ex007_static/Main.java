package lesson6_staticsClasses.ex007_static;

abstract class BaseClass{
    public static void staticMethod(){
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass{
    public static void staticMethod(){
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args){
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
