package essential.lesson6_staticsClasses.ex005_constructors;

public class NotStaticClass {
    public NotStaticClass(){
        System.out.println("Constructor.");
    }

    static {
        System.out.println("Static block.");
    }

    public static void staticMethod(){
        System.out.println("staticMethod");
    }

    public void notStaticMethod(){
        System.out.println("notStaticMethod");
    }
}
