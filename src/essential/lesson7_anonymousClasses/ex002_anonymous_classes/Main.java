package essential.lesson7_anonymousClasses.ex002_anonymous_classes;

interface Interface{
    void method();
}

public class Main {
    public static void main(String[] args){
        Interface instance = new Interface(){
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method(){
                num = 24;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }
        };
        instance.method();
    }
}
