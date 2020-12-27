package lesson6_staticsClasses.ex004_static_blocks;

public class Main {
    public static void main(String[] args){
        System.out.println(NotStaticClass.x);

        NotStaticClass instance = new NotStaticClass(111);
        System.out.println(instance.x);

        System.out.println(NotStaticClass.x);
    }
}
