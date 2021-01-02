package essential.lesson10_generics.ex001_generics;

class MyClass<T>{
    public T field;

    public void method(){
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args){
        MyClass<String> instance1 = new MyClass<>();
        instance1.field = "ABC";
        instance1.method();

        MyClass<Integer> instance2 = new MyClass< >();
        instance2.field = 1234;
        instance2.method();
    }
}
