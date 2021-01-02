package essential.lesson6_staticsClasses.ex011_innerclasses;

class MyClass{
    public class Inner extends BaseClass{
        public void methodFromInner(){
            System.out.println("InnerClass method");
        }
    }
}

public class Main {
    public static void main(String[] args){
        MyClass.Inner instance = new MyClass().new Inner();

        instance.methodFromBase();
        instance.methodFromInner();
    }
}
