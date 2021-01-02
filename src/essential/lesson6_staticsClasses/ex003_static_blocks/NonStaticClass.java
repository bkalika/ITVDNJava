package essential.lesson6_staticsClasses.ex003_static_blocks;

public class NonStaticClass {
    public static final int X;

    static {
        X = 10;
        System.out.println("Static block X = " + X);
    }

    public NonStaticClass(){
        // X = 4; // Error, due to static block called before, then constructor;
        System.out.println("Constructor X = " + X);
    }
}
