package essential.lesson6_staticsClasses.ex012_innerclasses;

class MyClass extends BaseClass{
    public class Inner{
        public void methodFromInner(){
            System.out.println("InnerClass method");
        }
    }
}

public class Main {
    public static void main(String[] args){
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Inner instance2 = new MyClass().new Inner();
        instance2.methodFromInner();
    }
}
