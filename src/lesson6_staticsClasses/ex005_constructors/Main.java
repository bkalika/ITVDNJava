package lesson6_staticsClasses.ex005_constructors;

public class Main {
    public static void main(String[] args){
        NotStaticClass.staticMethod();

        new NotStaticClass().notStaticMethod();
    }
}
