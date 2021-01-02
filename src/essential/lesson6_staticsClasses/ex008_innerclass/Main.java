package essential.lesson6_staticsClasses.ex008_innerclass;

class MyClass {
    public class Inner{
        public void method(){
            System.out.println("Method from Inner class");
        }
    }
}

public class Main{
    public static void main(String[] args){
        MyClass.Inner instance = new MyClass().new Inner();

        instance.method();
    }
}
