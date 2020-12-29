package lesson7_anonymousClasses.ex005_anonymous_classes;

interface Interface{
    void method();

    int getValue();
}

public class Main {
    public static void main(String[] args){
        Interface instance1 = new Interface(){
            int field = 0;

            @Override
            public void method(){
                field = 100;
            }

            @Override
            public int getValue(){
                return field;
            }
        };

        Interface instance2 = new Interface(){
            int field = -1;

            @Override
            public void method() {
                field = instance1.getValue();
            }

            @Override
            public int getValue(){
                return field;
            }
        };

        instance1.method();
        instance2.method();

        System.out.println("instance1: field = " + instance1.getValue() + "   instance2: field = " + instance2.getValue());
    }
}
