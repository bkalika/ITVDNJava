package essential.lesson10_generics.ex003_generics;

class MyClass{
    public <T> void method(T argument){
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args){
        MyClass instance = new MyClass();
        MyClass instance2 = new MyClass();

        instance.method("Hello world!");
        instance2.method(22);
    }
}
