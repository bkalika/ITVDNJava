package lesson4_abstract_interface.ex007_interfaces;

interface Interface{
    void method();
}

class MyClass implements Interface {
    public void method(){
        System.out.println("Method - realization ot the Interface.");
    }
}

public class Main {
    public static void main(String[] args){
        MyClass my = new MyClass();

        my.method();
    }
}
