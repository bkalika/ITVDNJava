package essential.lesson6_staticsClasses.ex013_nestedclasses;

class MyClass{
    public static class Nested{
        public static void staticMethodFromNested(){
            System.out.println("Static method from Nested class");
        }
    }
}

public class Main {
    public static void main(String[] args){
        MyClass.Nested.staticMethodFromNested();
    }
}
