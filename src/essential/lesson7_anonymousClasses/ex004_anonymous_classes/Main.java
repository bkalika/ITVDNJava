package essential.lesson7_anonymousClasses.ex004_anonymous_classes;

interface Interface{
    void method();
}

public class Main {
    public static void main(String[] args){
        int n = 100;

        Interface instance = new Interface() {
            public int publicField = 1;

            @Override
            public void method() {
                publicField = n;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
