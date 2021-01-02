package essential.lesson6_staticsClasses.ex003_static_blocks;

public class Main {
    public static void main(String[] args){
        System.out.println(NonStaticClass.X);

        NonStaticClass instance = new NonStaticClass();
        System.out.println(instance.X);
    }
}
